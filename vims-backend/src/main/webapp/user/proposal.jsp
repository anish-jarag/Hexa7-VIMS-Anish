<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Submit Proposal - Hexaware Insurance</title>
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

    .form-container {
      background: rgba(255, 255, 255, 0.95);
      backdrop-filter: blur(10px);
      border-radius: 20px;
      padding: 40px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
      margin-top: 60px;
      max-width: 600px;
      margin-left: auto;
      margin-right: auto;
    }

    h3 {
      font-weight: 600;
      color: #2c3e50;
      text-align: center;
      margin-bottom: 30px;
    }

    .btn-gradient {
      background: linear-gradient(45deg, #007BFF, #00BCD4);
      color: white;
      font-weight: 600;
      border: none;
      padding: 12px;
      border-radius: 30px;
      transition: all 0.3s ease;
    }

    .btn-gradient:hover {
      background: linear-gradient(45deg, #00BCD4, #007BFF);
      box-shadow: 0 4px 12px rgba(0, 123, 255, 0.3);
    }
  </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid px-4">
    <a class="navbar-brand fw-bold" href="index.jsp">Hexaware Insurance</a>
  </div>
</nav>

<!-- Proposal Form -->
<div class="container">
  <div class="form-container">
    <h3>Submit Vehicle Insurance Proposal</h3>

    <form action="submitProposal" method="post" class="needs-validation" novalidate>
      <!-- Hidden userId -->
      <input type="hidden" name="userId" value="${userId}">

      <div class="mb-4">
        <label class="form-label">Select Vehicle</label>
        <select class="form-select" name="vehicleId" required>
          <c:forEach var="vehicle" items="${vehicles}">
            <option value="${vehicle.vehicleId}">
              ${vehicle.type} - ${vehicle.registrationNumber}
            </option>
          </c:forEach>
        </select>
      </div>

      <div class="d-grid mt-4">
        <button type="submit" class="btn btn-gradient">Submit Proposal</button>
      </div>
    </form>
  </div>
</div>

<!-- Form Validation Script -->
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
