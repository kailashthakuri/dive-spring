<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %><%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client Response</title>
</head>
<body>
<h1>Auto Refresh Example</h1>

<%
    response.addIntHeader("Refresh", 1);
    Calendar calendar = new GregorianCalendar();
    int hour = calendar.get(Calendar.HOUR);
    int min = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    String amPm = "";
    if (calendar.get(Calendar.AM_PM) == 0) {
        amPm = "AM";
    } else {
        amPm = "PM";
    }
    String currentTime = hour + ":" + min + ":" + second + "  " + amPm;
    out.print("Current Time : " + currentTime);
%>
</body>
</html>
