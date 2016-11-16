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
 * Servlet implementation class UpdateDelete
 */
@WebServlet("/UpdateDelete")
public class UpdateDelete extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public UpdateDelete() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String action = (String) request.getParameter("action");
    request.setAttribute("id", request.getParameter("id"));
    System.out.println(action);

    if (action.equals("update")) {
      RequestDispatcher re = request.getRequestDispatcher("/UpdateItem");
      re.forward(request, response);

    } else {
      RequestDispatcher re = request.getRequestDispatcher("/DeleteItem");
      re.forward(request, response);
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
