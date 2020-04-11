<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read Cookie</title>
</head>
<body>
<h2 align="center">Reading Cookie Example</h2>
<%

    Cookie[] cookies = request.getCookies();
    if (null != cookies) {
        for (Cookie cookie : cookies) {
            out.println(cookie.getName() + " : " + cookie.getValue());
        }
    } else {
        out.println("No Cookies  Found!");
    }

%>


</body>
</html>
