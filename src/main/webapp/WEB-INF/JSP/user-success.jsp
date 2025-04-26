<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  <%-- don't forget this line at the top! --%>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h2>${message}</h2>

    <p>Name: ${user.firstName} ${user.lastName}</p>

    <h3>All Users:</h3>

    <c:choose>
        <c:when test="${not empty userList}">
            <table border="1">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>
                <c:forEach var="u" items="${userList}">
                    <tr>
                        <td>${u.firstName}</td>
                        <td>${u.lastName}</td>
                        <td>${u.email}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <p>No users found.</p>
        </c:otherwise>
    </c:choose>

</body>
</html>
