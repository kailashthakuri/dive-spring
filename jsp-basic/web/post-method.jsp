<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Post Method</title>
</head>
<body>
<h2>Post Method Example</h2>

<ol type="1">
    <li>First Name : <%=request.getParameter("first_name")%>
    </li>
    <li>Last Name : <%=request.getParameter("last_name")%>
    </li>
    <li>Age : <%=request.getParameter("age")%>
    </li>
    <li>Subject :
        <%
            String[] subjects = request.getParameterValues("subject");
            if (null != subjects) {
                for (int i = 0; i < subjects.length; i++) {
                    if (i > 0) {
                        out.print(" ,");
                    }
                    out.print(subjects[i]);
                }
            }
        %>
    </li>


</ol>
</body>
</html>
