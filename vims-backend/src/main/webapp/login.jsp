<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login - Vehicle Insurance</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="images/icon.jpg" rel="icon">
</head>
<body style="background-image: url('images/hero.jpg'); background-size: cover; background-position: center; height: 100vh; display: flex; align-items: center; justify-content: center;">

<div class="card p-4 shadow" style="max-width: 400px; width: 100%; background-color: rgba(255, 255, 255, 0.9); border-radius: 15px;">
  <h3 class="text-center mb-3">Login</h3>

  <!-- Show login error -->
  <c:if test="${not empty error}">
    <div class="alert alert-danger text-center">${error}</div>
  </c:if>

  <form action="login" method="post">
    <div class="mb-3">
      <label class="form-label">Email</label>
      <input type="email" name="email" class="form-control" placeholder="Enter email" required>
    </div>
    <div class="mb-3">
      <label class="form-label">Password</label>
      <input type="password" name="password" class="form-control" placeholder="Enter password" required>
    </div>
    <div class="d-grid mb-2">
      <button type="submit" class="btn btn-primary">Login</button>
    </div>
    <div class="text-center">
      <a href="registerPage">Don't have an account? Register</a>
    </div>
  </form>
</div>

</body>
</html>
