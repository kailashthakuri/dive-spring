<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 08/04/2020
  Time: 12:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Client</title>
</head>
<body>
<h1 align="center">File Uploading Form</h1>

Upload File <br>
<form action="file-server.jsp" enctype="multipart/form-data">
    <input type="file" name="file">
    <button type="submit">Submit File</button>
</form>

</body>
</html>
