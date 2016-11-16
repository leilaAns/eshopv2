package com.eshopproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshopproject.models.Item;
import com.eshopproject.models.ItemControl;

/**
 * Servlet implementation class DeleteUpdateItems
 */
@WebServlet("/UpdateItem")
public class UpdateItem extends HttpServlet {
  private static final long serialVersionUID = 1L;
  ItemControl itemControl = new ItemControl();

  /**
   * @see HttpServlet#HttpServlet()
   */
  public UpdateItem() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String id = (String) request.getAttribute("id");
    Item item = itemControl.getItemById(id);
    request.setAttribute("Item", item);
    System.out.println("this is update id is:" + id + "item is : " + item);

    RequestDispatcher rd = request.getRequestDispatcher("createNewItem.jsp");
    rd.forward(request, response);
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
