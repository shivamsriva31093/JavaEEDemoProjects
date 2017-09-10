package com.example.servlets;

import java.io.IOException;

/**
 * Created by sHIVAM on 9/9/2017.
 */
@javax.servlet.annotation.WebServlet(name = "Servlet", urlPatterns = "/generate")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int n = Integer.parseInt(request.getParameter("argument").isEmpty()?"0":request.getParameter("argument"));
        request.setAttribute("args", n);
        request.getRequestDispatcher("generateTable.jsp").forward(request, response);
    }
}
