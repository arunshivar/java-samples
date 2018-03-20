package com.arun;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection connection;
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

        /*System.out.println("Request received");
        HttpSession session = request.getSession(false);
        System.out.println("Session requested ID in Request:" + request.getRequestedSessionId());

        if(request.getRequestedSessionId() == null){
            System.out.println("First request");
            session = request.getSession(true);
            handleRequest(request, response);
        } else {
            System.out.println("Not required");
        }*/
    }

    /*void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Connection connection;
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

    }*/
}

