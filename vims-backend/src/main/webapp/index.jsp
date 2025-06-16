<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Hexaware | Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="images/icon.jpg" rel="icon">
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Hexaware</a>
    <div class="collapse navbar-collapse justify-content-end">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="registerPage">Register</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="loginPage">Login</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="container-fluid text-center py-5" style="background: linear-gradient(to right, #e3f2fd, #f1f8e9);">
  <h1 class="display-5 fw-bold">Welcome to Hexaware Vehicle Insurance</h1>
  <p class="lead mt-3">Simplifying insurance. Empowering lives.</p>
  <hr style="width: 60%; margin: auto;">
  <p class="mt-4">Secure your ride in minutes. Register or log in to get started.</p>
  <div class="d-flex justify-content-center gap-3 mt-4">
    <a href="registerPage" class="btn btn-success px-4">Register</a>
    <a href="loginPage" class="btn btn-outline-primary px-4">Login</a>
  </div>
</div>

</body>
</html>
