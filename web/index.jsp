<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title><spring:message code="index.title"/></title>
</head>
<body>
<%--<a href="?lang=en">en</a><a href="?lang=de">de</a>--%>

    <p>
        <a href="empform"><spring:message code="label.addEmployee"/></a>
    </p>
    <p>
        <a href="viewemp"><spring:message code="label.viewEmployees"/></a>
    </p>

Current Locale : ${pageContext.response.locale}
</body>
</html>
