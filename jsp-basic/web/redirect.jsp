<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 08/04/2020
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Redirect</title>
</head>
<body>
<h2 align="center">Redirect Example</h2>
<%
    String site = new String("http://www.photofuntoos.com");
    //response.sendRedirect(site);
    response.setStatus(response.SC_MOVED_PERMANENTLY);
    response.setHeader("Location", site);

%>

</body>
</html>
