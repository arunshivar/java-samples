package com.arun;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name	= (String)request.getAttribute("name");

        out.println("Request received <br>");
        out.println(name+"<br>");
    }
}
