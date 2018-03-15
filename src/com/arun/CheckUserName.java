package com.arun;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name = "CheckUserName", urlPatterns = {"/checkUserName"})
public class CheckUserName extends HttpServlet {
    Connection connection;
    ArrayList<String> arrayList = new ArrayList<String>();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reqParam = request.getParameter("q");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/training", "postgres", "admin");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from company where name = ?");
            preparedStatement.setString(1, reqParam);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                out.print("Username already taken");
            } else {
                out.print("Username available");
            }
            /*if(arrayList.contains(reqParam)) {
                // if user name already taken
                out.print("Username already taken");
            } else {
                out.print("Username available");
            }*/
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
