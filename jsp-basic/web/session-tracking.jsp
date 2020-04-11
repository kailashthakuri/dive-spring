<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 08/04/2020
  Time: 12:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session Tracking</title>
</head>
<body>
<h2 align="center">Session Tracking Example</h2>
<%
    Date creationTime = new Date(session.getCreationTime());
    Date lastAccessedTime = new Date(session.getLastAccessedTime());
    String idKey = "userId";
    String id = "ABCD";
    String visitCountKey = "visitKey";
    int visitCount = 0;
    if (session.isNew()) {
        session.setAttribute(visitCountKey, visitCount);
        session.setAttribute(idKey, id);
    }
    id = (String) session.getAttribute(idKey);
    visitCount = (Integer) session.getAttribute(visitCountKey);
    visitCount = visitCount + 1;
    session.setAttribute(visitCountKey, visitCount);
%>

<table border="`1" align="center">
    <tr>
        <td>Creation Date</td>
        <td><%=creationTime%>
        </td>
    </tr>
    <tr>
        <td>Last Accessed Date</td>
        <td><%=lastAccessedTime%>
        </td>
    </tr>
    <tr>
        <td>User ID</td>
        <td><%=id%>
        </td>
    </tr>
    <tr>
        <td>Visit Count</td>
        <td><%=visitCount%>
        </td>
    </tr>
</table>
</body>
</html>
