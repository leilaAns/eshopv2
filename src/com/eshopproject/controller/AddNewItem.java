package com.eshopproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eshopproject.models.Item;
import com.eshopproject.models.ItemControl;

/**
 * Servlet implementation class AddNewItem
 */
@WebServlet("/AddNewItem")
public class AddNewItem extends HttpServlet {
  private static final long serialVersionUID = 1L;


  /**
   * @see HttpServlet#HttpServlet()
   */
  public AddNewItem() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    if (id == null || id.equals("") || name == null || name.equals("")) {
      response.sendRedirect("error.jsp");
    }

    else {
      Item newItem = new Item(request.getParameter("id"), request.getParameter("name"),
          request.getParameter("des"), request.getParameter("cat"),
          Double.parseDouble(request.getParameter("price")));
      ItemControl itemControl = new ItemControl();
      // itemControl.getAllItems();
      Item item = itemControl.getItemById(id);
      System.out.println(item);
      if (item != null)
        itemControl.itemList.remove(item);
      itemControl.itemList.add(newItem);
      HttpSession itemSession = request.getSession();
      System.out.println(itemControl.itemList);
      itemSession.setAttribute("items", itemControl.itemList);

      response.sendRedirect("ViewItemsForAdmin.jsp");
    }
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
