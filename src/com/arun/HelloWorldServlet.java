package com.arun;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class  HelloWorldServlet extends HttpServlet
{
    private String message;
    public void init() {
        this.message = "Hello From first servlet";
    }
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
    {

        response.setContentType("text/html");

        PrintWriter out	 = response.getWriter();
        out.println(" <a href='./addition.html'>Addition Demo</a> ");
        out.println(" <a href='./params'>Params Demo</a> ");

        out.println("<h1>"+this.message+"</h1>");

    }
    public void destroy() {}
}