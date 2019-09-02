<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>

<h1>Dokonaj Wplaty</h1>

<form:form method="POST" action="/donate" modelAttribute="donation">
    <table>
        <tr>
            <td><form:label path="user.firstName">First name</form:label></td>
            <td><form:input path="user.firstName"/></td>
        </tr>
        <tr>
            <td><form:label path="user.lastName">Last name</form:label></td>
            <td><form:input path="user.lastName"/></td>
        </tr>
        <tr>
            <td><form:label path="user.email">Email</form:label></td>
            <td><form:input path="user.email"/></td>
        </tr>
        <tr>
            <td><form:label path="amount">Amount</form:label></td>
            <td><form:input type="number" path="amount"/></td>
        </tr>
        <tr>
            <form:hidden path="whipround.id"></form:hidden>
        </tr>
        <tr>
            <td><input type="submit" value="Pay"/></td>
        </tr>
    </table>
</form:form>

<a href="/">Go back to donation list</a>


</body>
</html>