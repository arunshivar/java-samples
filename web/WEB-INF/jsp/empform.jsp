<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<form:form method="post" action="save">
    <p>
        <label><spring:message code="label.name"/>:</label>
        <form:input path="name"/>
    </p>
    <p>
        <label><spring:message code="label.salary"/>:</label>
        <form:input path="salary"/>
    </p>
    <p>
        <label><spring:message code="label.designation"/>:</label>
        <form:input path="designation"/>
    </p>
    <p>
        <input type="submit" value="Save" />
    </p>
</form:form>