<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<table border="2" width="70%" cellpadding="2">
    <tr>
        <th><spring:message code="label.id"/></th>
        <th><spring:message code="label.name"/></th>
        <th><spring:message code="label.salary"/></th>
        <th><spring:message code="label.designation"/></th>
    </tr>
    <c:forEach var="emp" items="${list}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.salary}</td>
            <td>${emp.designation}</td>
        </tr>
    </c:forEach>
</table>
