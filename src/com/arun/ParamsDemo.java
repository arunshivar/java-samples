package com.arun;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// get context params and init params
// context params are available through out application
// init params are available for particular servlet
public class ParamsDemo extends HttpServlet {
    String company;
    String location;
    String employee;
    String phone;
    public void init(ServletConfig config) {
        // context object
        ServletContext servletContext = config.getServletContext();

        // reading context parameters
        company = servletContext.getInitParameter("company");
        location	= servletContext.getInitParameter("location");

        // reading config parameters
        employee = config.getInitParameter("employee");
        phone = config.getInitParameter("phone");


        System.out.println("Company Name "+company);
        System.out.println("Location "+location);
        System.out.println("Employee  "+employee);
        System.out.println("Phone "+phone);

    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
    {

        response.setContentType("text/html");

        PrintWriter out	 = response.getWriter();
        out.println(" <a href='/hello'>Hello</a> ");
        out.println(" <a href='./addition.html'>Addition</a> ");

        out.println("<h3>These Values are read from web.xml as context and config params</h3>");
        out.println("<h4>Company Name: "+company+"</h4>");
        out.println("<h4>Location: "+location+"</h4>");
        out.println("<h4>Employee Name: "+employee+"</h4>");
        out.println("<h4>Phone: "+phone+"</h4>");


    }
}
