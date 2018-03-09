package com.arun;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeCycle extends HttpServlet {


    public LifeCycle()
    {
        System.out.println("Constructor");
    }

    public void init(ServletConfig config)
    {
        System.out.println("Init method");
    }

    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
        System.out.println("Service Method");

    }

    public void destroy()
    {
        // destroy will only be called once the servlet has been Undeployed
        System.out.println("Destroy method");
    }

}