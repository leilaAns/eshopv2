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
 * Servlet implementation class DeleteItem
 */
@WebServlet("/DeleteItem")
public class DeleteItem extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public DeleteItem() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String id = (String) request.getAttribute("id");
    System.out.println(id);
    ItemControl itemControl = new ItemControl();
    // itemControl.getAllItems();


    Item item = itemControl.getItemById(id);
    if (item != null)
      itemControl.itemList.remove(item);

    HttpSession itemSession = request.getSession();
    itemSession.setAttribute("items", itemControl.itemList);
    response.sendRedirect("ViewItemsForAdmin.jsp");
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
