
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="js/application.js"></script>
    <script language="JavaScript">
        function validateForm() {
            if(document.registerForm.password.value != '' && document.registerForm.password_confirm.value != '') {
                if(document.registerForm.password.value != document.registerForm.password_confirm.value) {
                    alert("Passwords did not match");
                    return false;
                } else {
                    return true;
                }
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

<div class="container">
    <form  action="/register" method="POST" name="registerForm" onSubmit="return validateForm()">
        <h1> Register </h1>
        <p>
            <label>Username</label>
            <input  name="username" required="required" type="text" placeholder="User Name"
                    onkeyup="checkUserName(this.value)" onblur="blurName()" />
            <span id="txtHint" style="color:red;"></span>
        </p>
        <p>
            <label>Email</label>
            <input  name="email" required="required" type="email" placeholder="Email"/>
        </p>
        <p>
            <label>Password </label>
            <input name="password" required="required" type="password" placeholder="Password"/>
            <%--<% String password1 = request.getParameter("password"); %>--%>
        </p>
        <p>
            <label>Confirm password </label>
            <input name="password_confirm" required="required" type="password"/>
            <%--<% String password2 = request.getParameter("password_confirm"); %>--%>
        </p>
        <p>
            <input type="submit" value="Sign up"/>
        </p>
        <p>
            Already a member ?
            <a href="login.jsp" class="to_register">Login here</a>
        </p>
    </form>
</div>

<div class="">
    <%@ include file="footer.jsp"%>
</div>

</body>
</html>
