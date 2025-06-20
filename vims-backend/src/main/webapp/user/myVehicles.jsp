<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.vims_backend.entity.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My Vehicles</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            padding: 40px;
            background-color: #f0f8ff;
        }
        .container {
		    margin-left: 270px; /* same width as sidebar */
		    padding: 30px;
		}
        .form-container {
            background: #fff;
            padding: 30px;
            border-radius: 16px;
            box-shadow: 0 8px 24px rgba(0,0,0,0.1);
            margin-bottom: 40px;
        }
        .btn {
            font-weight: 500;
        }
    </style>
</head>
<body>

    <!-- Sidebar -->
    <jsp:include page="/user/user_sidebar.jsp" />
<div class="container">
    <h2 class="text-primary mb-4">Manage My Vehicles</h2>

    <!-- Vehicle Form -->
    <div class="form-container">
        <form action="/addVehicle" method="post">
            <input type="hidden" name="userId" value="<%= user.getUserId() %>">
            <div class="row g-3">
                <div class="col-md-4">
                    <label>Vehicle Type</label>
                    <select name="type" class="form-select" required>
                        <option value="CAR">Car</option>
                        <option value="BIKE">Bike</option>
                        <option value="TRUCK">Truck</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label>Make</label>
                    <input type="text" name="make" class="form-control" required>
                </div>
                <div class="col-md-4">
                    <label>Model</label>
                    <input type="text" name="model" class="form-control" required>
                </div>
                <div class="col-md-6">
                    <label>Registration Number</label>
                    <input type="text" name="registrationNumber" class="form-control" required>
                </div>
                <div class="col-md-6">
                    <label>Manufacture Year</label>
                    <input type="number" name="manufactureYear" class="form-control" min="1990" max="2025" required>
                </div>
            </div>
            <button type="submit" class="btn btn-success mt-4">Add Vehicle</button>
        </form>
    </div>

    <!-- Vehicle Table -->
    <div class="table-responsive">
        <table class="table table-bordered table-hover">
            <thead class="table-primary">
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Make</th>
                    <th>Model</th>
                    <th>Reg. No</th>
                    <th>Year</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="vehicle" items="${vehicles}">
                    <tr>
                        <td>${vehicle.vehicleId}</td>
                        <td>${vehicle.type}</td>
                        <td>${vehicle.make}</td>
                        <td>${vehicle.model}</td>
                        <td>${vehicle.registrationNumber}</td>
                        <td>${vehicle.manufactureYear}</td>
                        <td>
                            <a href="/editVehicle/${vehicle.vehicleId}" class="btn btn-warning btn-sm">Edit</a>
                            <a href="/deleteVehicle/${vehicle.vehicleId}" class="btn btn-danger btn-sm"
                               onclick="return confirm('Delete this vehicle?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
