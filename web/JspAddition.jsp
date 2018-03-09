
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JspAddition</title>
</head>
<body>
<form method = "POST">

    FirstNumber: <input type = "text" name ="fno" value="<%=fno%>"> <br>
    SecondNumber: <input type = "text" name ="sno" value="<%=sno%>"><br>
    <%
        String fno = request.getParameter("fno");
        String sno = request.getParameter("sno");

        if(sno ==  null)
        {
            sno = "";
        }

        if(fno ==  null)
        {
            fno = "";
        }

    %>



    <%
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        String result;
        try {
            n1	= Integer.parseInt(fno);
            n2	= Integer.parseInt(sno);
        } catch (Exception e) {}

        n3 = n1 + n2;

        if (n3 == 0) {
            result = "";
        } else {
            result	= Integer.toString(n3);
        }
    %>

    Result: <input type = "text" name ="res" value="<%=result%>"><br><br>

    <input type = "submit" name ="button" value="Add">
</form>

</body>
</html>
