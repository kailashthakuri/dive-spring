<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 12/04/2020
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ROOT_PATH" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
    <link href="${ROOT_PATH}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="${ROOT_PATH}/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="${ROOT_PATH}/">Human Resource</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="${ROOT_PATH}/">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${ROOT_PATH}/employee">Employee</a>
                </li>
            </ul>
        </div>
    </nav>