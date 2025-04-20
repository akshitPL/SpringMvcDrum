<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>User Form</title></head>
<body>
    <h2>Enter User Details</h2>

    <form:form method="POST" modelAttribute="user" action="${pageContext.request.contextPath}/submitUser">
        <p>First Name: <form:input path="firstName" /></p>
        <p>Last Name: <form:input path="lastName" /></p>
        <p>Email: <form:input path="email" /></p>
        <p><input type="submit" value="Submit" /></p>
    </form:form>
</body>
</html>
