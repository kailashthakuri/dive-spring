<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie Set</title>
</head>
<body>
<%
    Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
    Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));
    firstName.setMaxAge(60);
    lastName.setMaxAge(60);
    response.addCookie(firstName);
    response.addCookie(lastName);
%>
<h2 align="center">Setting Cookie Example</h2>
<ui>
    <li><b>First Name : </b><%=request.getParameter("first_name")%>
    </li>
    <br/>
    <li><b>Last Name : </b><%=request.getParameter("last_name")%>
    </li>
</ui>
</body>
</html>
