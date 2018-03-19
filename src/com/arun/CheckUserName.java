package com.arun;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "CheckUserName", urlPatterns = {"/checkUserName"})
public class CheckUserName extends HttpServlet {
    Connection connection;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reqParam = request.getParameter("q");
        PrintWriter out = response.getWriter();
        try {
            connection = DBConnection.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("select * from company where name = ?");
            preparedStatement.setString(1, reqParam);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                out.print("Username already taken");
            } else {
                out.print("Username available");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }

    }
}
