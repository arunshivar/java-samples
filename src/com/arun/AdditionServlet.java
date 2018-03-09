package com.arun;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdditionServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println(" <a href='/hello'>Hello</a> ");
        out.println(" <a href='./addition.html'>Addition Demo</a> ");
        out.println(" <a href='/params'>Params Demo</a> ");


        int n1 = Integer.parseInt(request.getParameter("firstNumber"));
        int n2 = Integer.parseInt(request.getParameter("secondNumber"));
        String res = String.valueOf(n1 + n2);
        out.print("<h1>"+res+"</h1>");


    }
}
