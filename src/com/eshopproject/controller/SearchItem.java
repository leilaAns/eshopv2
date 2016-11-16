package com.eshopproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.RestCsrfPreventionFilter;

import com.eshopproject.models.Item;
import com.eshopproject.models.ItemControl;

/**
 * Servlet implementation class SearchItem
 */
@WebServlet("/SearchItem")
public class SearchItem extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public SearchItem() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ItemControl itemControl = new ItemControl();
    Item item = itemControl.getItemById(request.getParameter("id"));
    System.out.println(item);
    request.setAttribute("Item", item);
    RequestDispatcher rd = request.getRequestDispatcher("searchResult.jsp");
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
