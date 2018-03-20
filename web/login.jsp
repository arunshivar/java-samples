
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/application.css" rel="stylesheet">
    <script language="JavaScript">
        function validateForm() {
            if(document.loginForm.name.value == '' || document.loginForm.password.value == '') {
                return false;
            } else {
                return true;
            }
        }
    </script>
</head>
<body>
<div class="">
    <%@ include file="header.jsp"%>
</div>
<div class="content-wrapper">
    <div class="container">
        <form action="/login"  method="post" name="loginForm" onsubmit="return validateForm()">
            <h1> Login </h1>
            <p>
                <label>Username</label>
                <input  name="username" required="required" type="text" placeholder="User Name" />
            </p>
            <p>
                <label>Password</label>
                <input name="password" required="required" type="password" placeholder="Password"/>
            </p>
            <p>
                <input type="submit" value="Login"/>
            </p>
            <p>
                If not a registered member ?
                <a href="register.jsp">Register here</a>
            </p>
        </form>
    </div>
</div>
<div class="">
    <%@ include file="footer.jsp"%>
</div>
</body>

</html>
