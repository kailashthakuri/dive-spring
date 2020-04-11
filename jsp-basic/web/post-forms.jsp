<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 07/04/2020
  Time: 8:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Post Form</title>
</head>
<body>
<h2>Post Form Example</h2>

<form action="post-method.jsp" method="post">
    <table>
        <tr>
            <td>First Name :</td>
            <td><input type="text" name="first_name"></td>
        </tr>
        <tr>
            <td>Last Name :</td>
            <td><input type="text" name="last_name">
        </tr>
        </td>
        <tr>
            <td>Age :</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="checkbox" name="subject" value="math">Math</input>
                <input type="checkbox" name="subject" value="chemistry">Chemistry</input>
                <input type="checkbox" name="subject" value="nepali" checked>Nepali</input>
            </td>
        </tr>
    </table>
    <button type="submit"> Submit</button>
</form>
</body>
</html>
