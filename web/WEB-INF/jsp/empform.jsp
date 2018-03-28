<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="post" action="save">
    <p>
        <label>Name:</label>
        <form:input path="name"/>
    </p>
    <p>
        <label>Salary:</label>
        <form:input path="salary"/>
    </p>
    <p>
        <label>Designation:</label>
        <form:input path="designation"/>
    </p>
    <p>
        <input type="submit" value="Save" />
    </p>
</form:form>