package com.eshopproject.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eshopproject.models.Item;
import com.eshopproject.models.ItemControl;

/**
 * Servlet implementation class ShoppingBasket
 */
@WebServlet("/ShoppingBasket")
public class ShoppingBasket extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public ShoppingBasket() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String[] ids = request.getParameterValues("id");
    ItemControl itemControl = new ItemControl();
    ArrayList<Item> selectedItem = new ArrayList<Item>();
    itemControl.fillList();
    for (String id : ids) {

      selectedItem.add(itemControl.getItemById(id));
    }
    /*
     * for(Item item : selectedItem) System.out.println(item);
     */
    HttpSession itemSession = request.getSession();
    itemSession.setAttribute("items", selectedItem);
    response.sendRedirect("shoppingBasket.jsp");

  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}
