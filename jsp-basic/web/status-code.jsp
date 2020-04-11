<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 8:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Status Code</title>
</head>
<body>
<h2>Status Code Example</h2>
<%
 response.sendError(407,"Need Authentication Dude!!");

%>
</body>
</html>
