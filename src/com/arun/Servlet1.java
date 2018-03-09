package com.arun;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    // to dispatch a request the second servlets method must be the same as the first servlet
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("./servlet2");

        String name = request.getParameter("name");

        request.setAttribute("name", name);
        requestDispatcher.forward(request, response);
        // requestDispatcher.include(request, response);
        // response.sendRedirect("./servlet2");
    }
}
