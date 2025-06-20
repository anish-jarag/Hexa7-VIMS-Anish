<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>User Dashboard - Hexaware Insurance</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap & Fonts -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">

  <style>
    body {
      font-family: 'Poppins', sans-serif;
      background: linear-gradient(to right, #E3F2FD, #F1F8E9);
      min-height: 100vh;
      display: flex;
      flex-direction: column;
    }

    .navbar {
      box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
    }

    .dashboard-container {
      background-color: #fff;
      padding: 40px;
      border-radius: 20px;
      margin-top: 60px;
      box-shadow: 0 8px 25px rgba(0, 0, 0, 0.1);
      max-width: 600px;
      margin-left: auto;
      margin-right: auto;
    }

    h2 {
      font-weight: 600;
      color: #2c3e50;
    }

    .btn-gradient {
      background: linear-gradient(45deg, #007BFF, #00BCD4);
      color: white;
      font-weight: 600;
      border: none;
      padding: 12px 25px;
      border-radius: 30px;
      transition: all 0.3s ease;
    }

    .btn-gradient:hover {
      background: linear-gradient(45deg, #00BCD4, #007BFF);
      box-shadow: 0 4px 12px rgba(0, 123, 255, 0.3);
    }

    .btn-outline-style {
      font-weight: 600;
      border-radius: 30px;
      padding: 12px 25px;
    }

    .welcome-msg {
      font-size: 1.1rem;
      color: #333;
    }
  </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid px-4">
    <a class="navbar-brand fw-bold" href="index.jsp">Hexaware Insurance</a>
    <div class="collapse navbar-collapse justify-content-end">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Dashboard -->
<div class="container">
  <div class="dashboard-container text-center">
    <h2>Welcome to Your Dashboard</h2>

    <c:if test="${not empty user}">
      <p class="welcome-msg mt-3">Hello, <strong>${user.name}</strong></p>
    </c:if>

    <div class="d-flex flex-column align-items-center gap-3 mt-4">
      <form action="proposalPage" method="get">
        <input type="hidden" name="userId" value="${user.userId}" />
        <button type="submit" class="btn btn-gradient">Submit New Proposal</button>
      </form>

      <form action="viewProposals" method="get">
        <input type="hidden" name="userId" value="${user.userId}" />
        <button type="submit" class="btn btn-outline-success btn-outline-style">View My Proposals</button>
      </form>
    </div>

    <c:if test="${not empty message}">
      <div class="alert alert-success mt-4">${message}</div>
    </c:if>
  </div>
</div>

</body>
</html>
