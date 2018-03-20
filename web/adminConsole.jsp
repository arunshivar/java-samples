<%@ page import="java.sql.Connection" %>
<%@ page import="com.arun.DBConnection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Console</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/application.css" rel="stylesheet">
</head>
<body>
<%
    Connection connection = DBConnection.getInstance().getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM company");
    ResultSet resultSet = preparedStatement.executeQuery();
%>
<div class="">
    <%@ include file="header.jsp"%>
</div>
<div class="content-wrapper">
    <div class="container">
        <h1>
            Welcome Admin
        </h1>

        <table border="1" borderColor="black" cellPadding="0" cellSpacing="0" width="100%" height="200">
            <tbody>
            <td bgColor="grey" width="30" height="19" align="center"><b>User name</b></td>
            <td bgColor="grey" width="50" height="19" align="center"><b>Email</b></td>
            <td bgColor="grey" width="30" height="19" align="center"><b>Role</b></td>
            <td bgColor="grey" width="30" height="19" align="center"><b>Action</b></td>
            <% while(resultSet.next()) {
            %>
            <tr>
                <td  bgColor="FFFDFD" width="30" height="19" align="center">
                    <%= resultSet.getString(1)%></td>
                <td  bgColor="FFFDFD" width="50" height="19" align="center">
                    <%= resultSet.getString(3)%></td>
                <td  bgColor="FFFDFD" width="30" height="19" align="center">
                    <%= resultSet.getString(4)%></td>
                <td  bgColor="FFFDFD" width="30" height="19" align="center">
                    <a href="#">Edit</a>
                </td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>

        <br>
        Upload Employee details file
        <form action="/uploadFile" method="post" enctype="multipart/form-data" ><%--enctype = "multipart/form-data"--%>
            <p><input type = "file" name="uploadedFile" accept=".json"/></p>
            <br/>
            <p><input type = "submit" value = "Upload File" /></p>
        </form>

    </div>
</div>

<div class="">
    <%@ include file="footer.jsp"%>
</div>
</body>
</html>
