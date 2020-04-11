<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 06/04/2020
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="person" class="io.ace.jsp.model.PersonBean"/>
<html>
<head>
    <title>JSP Basic</title>
</head>
<body>
<h1>Hello World</h1>
<jsp:include page="date.jsp"></jsp:include>
<p>Go to Date Page :
    <%--<jsp:forward page="date.jsp"/>--%>
</p>
<jsp:setProperty name="person" property="name" value="Kailash"/>
<p>Got Person Name :
    <jsp:getProperty name="person" property="name"/>
</p>
</body>
</html>
