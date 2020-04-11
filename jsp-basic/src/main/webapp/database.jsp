<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 10/04/2020
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
    <title>Database</title>
</head>
<body>

<h2 align="center">Database Example</h2>
<sql:setDataSource var="snapshot" url="jdbc:mysql://localhost:3306/human_resource?serverTimezone=UTC"
                   user="root"
                   password=""
                   driver="com.mysql.jdbc.Driver"></sql:setDataSource>

<%--<sql:update dataSource="${snapshot}">--%>
<%--insert into employee (first_name,last_name,age) values("Ashok","Shahi",29)--%>
<%--</sql:update>--%>

<%--<sql:update dataSource="${snapshot}">--%>
    <%--delete from employee where id=?--%>
    <%--<sql:param value="4"></sql:param>--%>
<%--</sql:update>--%>

<sql:query var="result" dataSource="${snapshot}">
    select * from employee
</sql:query>


<table border="1" align="center" width="50%">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${result.rows}">
        <tr>
            <td><c:out value="${employee.first_name}"/></td>
            <td><c:out value="${employee.last_name}"/></td>
            <td><c:out value="${employee.age}"/></td>
        </tr>
    </c:forEach>

    <c:catch></c:catch>


    </tbody>
</table>


</body>
</html>
