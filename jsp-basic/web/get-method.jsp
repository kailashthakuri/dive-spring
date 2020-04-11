<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Method Example</title>
</head>
<body>
<h2>Get Method Example</h2>
<%--http://localhost:8080/get-method.jsp?first_name=kailash&last_name=shahi--%>
<ul>
    <li>
        <p>
            <b>First Name : </b> <%=request.getParameter("first_name")%>
        </p>
    </li>
    <li>
        <p>
            <b>Last Name : </b> <%=request.getParameter("last_name")%>
        </p>
    </li>
</ul>


</body>
</html>
