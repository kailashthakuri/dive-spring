<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 02/05/2020
  Time: 1:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../../layout/header.jsp" %>
<h2>Create Employee</h2>
<form:form method="POST" modelAttribute="employee" action="${ROOT_PATH}/employee/create">
    <form:hidden path="id"/>
    <div class="form-group">
        <label for="firstName">First Name</label>
        <form:input path="firstName" cssClass="form-control" aria-describedby="firstNameHelp"/>
        <small id="firstNameHelp" class="form-text text-muted">Enter your first name</small>
    </div>
    <div class="form-group">
        <label for="lastName">Last Name</label>
        <form:input path="lastName" cssClass="form-control" aria-describedby="lastNameHelp"/>
        <small id="lastNameHelp" class="form-text text-muted">Enter your last name</small>
    </div>

    <div class="form-group">
        <label for="age">Age</label>
        <form:input type="number" path="age" cssClass="form-control" aria-describedby="agetHelp"/>
        <small id="agetHelp" class="form-text text-muted">Enter your age</small>
    </div>
    <div class="form-group form-check">
        <input type="checkbox" name="status" class="form-check-input" id="status">
        <label class="form-check-label" for="status">Status</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>

<%@ include file="../../layout/footer.jsp" %>