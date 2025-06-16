<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Submit Proposal - Hexaware Insurance</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Hexaware Insurance</a>
  </div>
</nav>

<div class="container mt-5">
  <h3 class="mb-4 text-center">Submit Vehicle Insurance Proposal</h3>

  <form action="submitProposal" method="post" class="p-4 border rounded shadow bg-light">
    
    <!-- Hidden userId -->
    <input type="hidden" name="userId" value="${userId}">

    <div class="mb-3">
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
      <button type="submit" class="btn btn-primary">Submit Proposal</button>
    </div>
  </form>
</div>

</body>
</html>
