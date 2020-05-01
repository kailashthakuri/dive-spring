<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 01/05/2020
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="../../layout/header.jsp" %>
<h3>Employee</h3>
<a type="button" href="${ROOT_PATH}/employee/create" class="btn btn-primary mb-2">Create</a>
<table class="table table-bordered table-striped table-hover">
    <thead>
    <form:form modelAttribute="searchDTO" method="get" action="${ROOT_PATH}/employee">
        <tr>
            <th>Name
                <form:input cssClass="form-control mr-sm-2" type="search" placeholder="Search By Name"
                            aria-label="Search" path="name"></form:input>
            </th>
            <th>Age
                <form:input cssClass="form-control mr-sm-2" type="number" placeholder="Search By Age"
                            aria-label="Search" path="age"></form:input>
            </th>
            <th>Action
                <br>
                <button class="btn btn-success" type="submit">Search/Go</button>
            </th>
        </tr>
    </form:form>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.firstName} ${employee.lastName}</td>
            <td>${employee.age}</td>
            <td><a href="${ROOT_PATH}/employee/edit/${employee.id}"><i class="far fa-edit"></i></a>
                <a href="${ROOT_PATH}/employee/delete/${employee.id}"><i class="far fa-trash-alt"></i></a></td>
        </tr>
    </c:forEach>
    </tbody>

</table>
<%@ include file="../../layout/footer.jsp" %>
<script>
    $("#searchByName")
        .keyup(function () {
            console.log("Test");
        });
</script>