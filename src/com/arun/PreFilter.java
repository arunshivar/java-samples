package com.arun;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "PreFilter", urlPatterns = {"/filterServlet"})
public class PreFilter implements Filter {
    public void init(FilterConfig config) {
        System.out.println("Filter init");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Filter doFilter");
        resp.getWriter().println("Response from PreFilter");
        chain.doFilter(req,resp);
    }

    public void destroy() {
        System.out.println("Filter Destroyed");
    }

}
