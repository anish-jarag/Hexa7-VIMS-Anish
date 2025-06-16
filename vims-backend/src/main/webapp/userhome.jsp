<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>User Dashboard - Hexaware Insurance</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Hexaware Insurance</a>
    <div class="collapse navbar-collapse justify-content-end">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="container text-center mt-5">
  <h2>Welcome to Your Dashboard</h2>

  <c:if test="${not empty user}">
    <p class="lead mt-3">Hello, <strong>${user.name}</strong></p>
  </c:if>

  <div class="mt-4 d-flex flex-column align-items-center gap-3">
    <form action="proposalPage" method="get">
      <input type="hidden" name="userId" value="${user.userId}" />
      <button type="submit" class="btn btn-primary px-4">Submit New Proposal</button>
    </form>

    <form action="viewProposals" method="get">
      <input type="hidden" name="userId" value="${user.userId}" />
      <button type="submit" class="btn btn-outline-success px-4">View My Proposals</button>
    </form>
  </div>

  <c:if test="${not empty message}">
    <div class="alert alert-success mt-4">${message}</div>
  </c:if>
</div>

</body>
</html>
