<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Register - Vehicle Insurance</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="images/icon.jpg" rel="icon">
  <style>
    body, html {
      height: 100%;
      margin: 0;
    }

    .bg-cover {
      background-image: linear-gradient(rgba(0, 0, 0, 0.4), rgba(0, 0, 0, 0.7)), url('images/hero.jpg');
      background-size: cover;
      background-position: center;
      height: 100vh;
      display: flex;
      align-items: center;
      justify-content: center;
    }

    .form-container {
      background-color: rgba(255, 255, 255, 0.85);
      padding: 30px;
      border-radius: 15px;
      max-width: 550px;
      width: 100%;
      box-shadow: 0 8px 24px rgba(0, 0, 0, 0.3);
    }

    h3 {
      font-weight: bold;
      text-align: center;
      margin-bottom: 20px;
      color: #2c3e50;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Hexaware Insurance</a>
    <div class="collapse navbar-collapse justify-content-end">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" href="register.jsp">Register</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="bg-cover">
  <div class="form-container">
    <h3>Create Your Account</h3>

    <c:if test="${not empty error}">
      <div class="alert alert-danger text-center">${error}</div>
    </c:if>
    <c:if test="${not empty message}">
      <div class="alert alert-success text-center">${message}</div>
    </c:if>

    <form action="register" method="post" class="needs-validation" novalidate>

      <div class="mb-3">
        <label class="form-label">Full Name</label>
        <input type="text" class="form-control" name="name" placeholder="Your full name" required>
      </div>

      <div class="mb-3">
        <label class="form-label">Email Address</label>
        <input type="email" class="form-control" name="email" placeholder="you@example.com" required>
      </div>

      <div class="mb-3">
        <label class="form-label">Password</label>
        <input type="password" class="form-control" name="password" placeholder="Choose a password" required minlength="6">
      </div>

      <div class="mb-3">
        <label class="form-label">Date of Birth</label>
        <input type="date" class="form-control" name="dob" required>
      </div>

      <div class="mb-3">
        <label class="form-label">Aadhaar Number</label>
        <input type="text" class="form-control" name="aadhaar" placeholder="12-digit Aadhaar" " required>
      </div>

      <div class="mb-3">
        <label class="form-label">PAN Number</label>
        <input type="text" class="form-control" name="pan" placeholder="Your PAN" maxlength="10" required>
      </div>
      
      <div class="form-check form-check-inline">
      	<input class="form-check-input" type="radio" name="role" id="USER" value="USER">
        <label class="form-check-label" for="USER">USER</label>
     </div>
      <div class="form-check form-check-inline">
      	<input class="form-check-input" type="radio" name="role" id="OFFICER" value="OFFICER">
        <label class="form-check-label" for="OFFICER">Officer</label>
     </div>

      <div class="d-grid gap-2 d-md-flex justify-content-md-between">
        <button type="submit" class="btn btn-primary">Register</button>
        <button type="reset" class="btn btn-secondary">Reset</button>
      </div>
    </form>
  </div>
</div>

<script>
(() => {
  'use strict';
  const forms = document.querySelectorAll('.needs-validation');
  Array.from(forms).forEach(form => {
    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault();
        event.stopPropagation();
      }
      form.classList.add('was-validated');
    }, false);
  });
})();
</script>

</body>
</html>
