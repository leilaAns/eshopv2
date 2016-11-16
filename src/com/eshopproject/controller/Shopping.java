package com.eshopproject.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eshopproject.models.Item;
import com.eshopproject.models.ItemControl;

/**
 * Servlet implementation class Shopping
 */
@WebServlet("/Shopping")
public class Shopping extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Shopping() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    double total = 0;
    String[] ids = request.getParameterValues("id");
    ItemControl itemControl = new ItemControl();
    ArrayList<Item> selectedItem = new ArrayList<Item>();
    itemControl.fillList();
    for (String id : ids) {

      selectedItem.add(itemControl.getItemById(id));
    }
    for (Item item : selectedItem) {
      System.out.println(item);
      total += item.getPrice();
    }
    System.out.println(total);
    request.setAttribute("total", total);
    HttpSession itemSession = request.getSession();
    itemSession.setAttribute("selectedItems", selectedItem);
    RequestDispatcher rd = request.getRequestDispatcher("shoppingForm.jsp");
    rd.forward(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {



  }

}
