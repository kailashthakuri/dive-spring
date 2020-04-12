<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 12/04/2020
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../layout/header.jsp" %>
<%@ page isErrorPage="true" %>
<h2>Error Page </h2>
<h3>Message : <%= exception.getMessage() %>
</h3>

<%@ include file="../layout/footer.jsp" %>
