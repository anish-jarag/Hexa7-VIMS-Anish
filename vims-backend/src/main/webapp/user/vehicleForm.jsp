<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My Vehicles - VIMS</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: #f0f4f8;
            padding: 20px;
        }
        .container {
            max-width: 900px;
            margin: auto;
            background: white;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 0 20px rgba(0,0,0,0.05);
        }
        h2 {
            margin-bottom: 30px;
            color: #0d6efd;
        }
        .btn-update { background-color: #ffc107; color: white; }
        .btn-delete { background-color: #dc3545; color: white; }
    </style>
</head>
<body>

<c:set var="userId" value="${user.userId}" />
<div class="container">
    <h2>Manage Your Vehicles</h2>

    <!-- Success Alert -->
    <div id="alertBox"></div>

    <form id="vehicleForm" class="row g-3 mb-4">
        <input type="hidden" id="vehicleId">
        <input type="hidden" id="userId" value="${userId}">

        <div class="col-md-4">
            <label class="form-label">Make</label>
            <input type="text" class="form-control" id="make" required>
        </div>
        <div class="col-md-4">
            <label class="form-label">Model</label>
            <input type="text" class="form-control" id="model" required>
        </div>
        <div class="col-md-4">
            <label class="form-label">Type</label>
            <select class="form-select" id="type" required>
                <option value="">Select</option>
                <c:forEach var="vType" items="${vehicleTypes}">
                    <option value="${vType}">${vType}</option>
                </c:forEach>
            </select>
        </div>

        <div class="col-12">
            <button type="submit" class="btn btn-primary">Save Vehicle</button>
            <button type="reset" class="btn btn-secondary" onclick="resetForm()">Clear</button>
        </div>
    </form>

    <table class="table table-bordered">
        <thead class="table-light">
            <tr>
                <th>ID</th>
                <th>Make</th>
                <th>Model</th>
                <th>Type</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody id="vehicleTable">
            <!-- Populated via JS -->
        </tbody>
    </table>
</div>

<script>
    const userId = document.getElementById("userId").value;

    function showAlert(message, type = 'success') {
        document.getElementById("alertBox").innerHTML =
            `<div class="alert alert-${type} alert-dismissible fade show" role="alert">
                ${message}
                <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
             </div>`;
    }

    function fetchVehicles() {
        fetch(`/api/vehicles/user/${userId}`)
            .then(res => res.json())
            .then(data => {
                const table = document.getElementById("vehicleTable");
                table.innerHTML = '';
                data.forEach(v => {
                    table.innerHTML += `
                        <tr>
                            <td>${v.vehicleId}</td>
                            <td>${v.make}</td>
                            <td>${v.model}</td>
                            <td>${v.type}</td>
                            <td>
                                <button class="btn btn-sm btn-update" onclick='editVehicle(${JSON.stringify(v)})'>Edit</button>
                                <button class="btn btn-sm btn-delete" onclick="deleteVehicle(${v.vehicleId})">Delete</button>
                            </td>
                        </tr>`;
                });
            });
    }

    function resetForm() {
        document.getElementById("vehicleId").value = '';
        document.getElementById("make").value = '';
        document.getElementById("model").value = '';
        document.getElementById("type").value = '';
    }

    function editVehicle(v) {
        document.getElementById("vehicleId").value = v.vehicleId;
        document.getElementById("make").value = v.make;
        document.getElementById("model").value = v.model;
        document.getElementById("type").value = v.type;
    }

    function deleteVehicle(id) {
        if (confirm("Are you sure you want to delete this vehicle?")) {
            fetch(`/api/vehicles/${id}`, { method: 'DELETE' })
                .then(() => {
                    fetchVehicles();
                    showAlert("Vehicle deleted successfully!", "danger");
                });
        }
    }

    document.getElementById("vehicleForm").addEventListener("submit", function (e) {
        e.preventDefault();
        const id = document.getElementById("vehicleId").value;
        const vehicle = {
            userId: userId,
            make: document.getElementById("make").value,
            model: document.getElementById("model").value,
            type: document.getElementById("type").value
        };

        const method = id ? 'PUT' : 'POST';
        const url = id ? `/api/vehicles/${id}` : `/api/vehicles`;

        fetch(url, {
            method: method,
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(vehicle)
        }).then(() => {
            resetForm();
            fetchVehicles();
            showAlert(`Vehicle ${id ? 'updated' : 'added'} successfully!`);
        });
    });

    fetchVehicles();
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
