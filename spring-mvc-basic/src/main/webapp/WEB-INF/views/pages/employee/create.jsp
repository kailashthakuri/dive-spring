<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 12/04/2020
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../layout/header.jsp" %>
<h2>Create Employee</h2>
<form:form method="POST" action="${ROOT_PATH}/employee/create">
    <div class="form-group">
        <label for="firstName">First Name</label>
        <input type="text" class="form-control" name="firstName"   id="firstName" aria-describedby="firstNameHelp">
        <small id="firstNameHelp" class="form-text text-muted">Enter your first name</small>
    </div>
    <div class="form-group">
        <label for="lastName">Last Name</label>
        <input type="text" required name="lastName" class="form-control" id="lastName" aria-describedby="lastNameHelp">
        <small id="lastNameHelp" class="form-text text-muted">Enter your last name</small>
    </div>

    <div class="form-group">
        <label for="lastName">Age</label>
        <input type="number" required class="form-control" name="age"   id="aget" aria-describedby="agetHelp">
        <small id="agetHelp" class="form-text text-muted">Enter your age</small>
    </div>
    <div class="form-group form-check">
        <input type="checkbox"  name="status"  class="form-check-input" id="status">
        <label class="form-check-label" for="status">Status</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>

<%@ include file="../layout/footer.jsp" %>

