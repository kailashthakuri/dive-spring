<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client Request</title>
</head>
<body>
<table width="100%" border="1">
    <thead>
    <tr bgcolor="#949494">
        <th>Header Name</th>
        <th>Header Value</th>
    </tr>
    </thead>
    <tbody>
    <%
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String paramName = headerNames.nextElement();
            String paramValue = request.getHeader(paramName);
            out.print("<tr>");
            out.print("<td>" + paramName + "</td>");
            out.print("<td>" + paramValue + "</td>");
            out.print("</tr>");
        }
    %>

    </tbody>
</table>


</body>
</html>
