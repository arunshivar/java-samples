package com.arun;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection = null;
        DBConnection dbConnection = DBConnection.getInstance();
        try {
            connection = dbConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from company where name = ? and password = ?");
            preparedStatement.setString(1,request.getParameter("username"));
            preparedStatement.setString(2,request.getParameter("password"));
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                String role = resultSet.getString("role");
                if(role == "admin") {
                    response.sendRedirect("/adminConsole.jsp");
                } else {
                    response.sendRedirect("/welcome.jsp");
                }
                connection.close();
            } else {
                response.sendRedirect("/login.jsp");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
