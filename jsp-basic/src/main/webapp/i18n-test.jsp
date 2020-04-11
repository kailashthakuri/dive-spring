<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Locale" %><%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 11/04/2020
  Time: 12:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Internalization Example</title>
</head>
<body>
<h2 align="center">Internalization Example</h2>

<%
    Locale locale = request.getLocale();
    String country = locale.getCountry();
    String displayLanguage = locale.getDisplayLanguage();
    DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, request.getLocale());
    String dateString = dateTimeInstance.format(new Date());

%>

<p align="center">
    Country : <%=country%> <br>
    Language : <%=displayLanguage%> <br>
    Date : <%=dateString%> <br>
</p>


</body>
</html>
