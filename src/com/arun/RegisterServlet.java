package com.arun;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection connection = null;
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        DBConnection dbConnection = DBConnection.getInstance();
        try {

            connection = dbConnection.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO company(name, password, email, role) VALUES(?, ?, ?, ?)");
            preparedStatement.setString(1, name);

            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, "user");


            int i = preparedStatement.executeUpdate();
            if(i > 0) {
                response.sendRedirect("/login.jsp");
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
