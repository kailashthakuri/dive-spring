<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 10/04/2020
  Time: 11:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="xml" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Xml Parse</title>
</head>
<body>
<c:import url="xml-parse.jsp" var="books"></c:import>

<xml:parse xml="${books}" var="output"></xml:parse>

Name of the First Book
<xml:out select="$output/books/book[1].name"></xml:out>


Price of the First Book
<xml:out select="$output/books/book[2].price"></xml:out>


</body>
</html>
