<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 12/04/2020
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../layout/header.jsp" %>
<h2>Employee</h2>

<a type="button" href="${ROOT_PATH}/employee/create" class="btn btn-primary mb-2">Create</a>
<table class="table table-bordered table-striped table-hover">
    <thead>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.firstName} ${employee.lastName}</td>
            <td>${employee.age}</td>
            <td>
                <c:choose>
                    <c:when test="${employee.status}">
                        <span type="button" class="btn btn-success btn-sm">Active</span>
                    </c:when>
                    <c:otherwise>
                        <span class="btn btn-danger btn-sm">Inactive</span>
                    </c:otherwise>
                </c:choose>
            </td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>

</table>
<%@ include file="../layout/footer.jsp" %>
