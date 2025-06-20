<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard - VIMS</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome for icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" />
    <style>
        body {
            background-color: #f7fbff;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .sidebar {
            height: 100vh;
            background-color: #0d6efd;
            padding-top: 40px;
            position: fixed;
            left: 0;
            top: 0;
            width: 240px;
            box-shadow: 2px 0 10px rgba(0,0,0,0.1);
        }

        .sidebar a {
            color: #fff;
            padding: 15px 25px;
            display: block;
            font-size: 16px;
            text-decoration: none;
            transition: all 0.2s ease-in-out;
        }

        .sidebar a:hover {
            background-color: #0a58ca;
            text-decoration: none;
        }

        .sidebar .logo {
            font-size: 22px;
            font-weight: bold;
            padding: 0 25px;
            color: #ffffff;
            margin-bottom: 40px;
        }

        .content {
            margin-left: 260px;
            padding: 40px 20px;
        }

        .card {
            background: white;
            border: none;
            border-radius: 12px;
            padding: 30px;
            box-shadow: 0 4px 20px rgba(0,0,0,0.05);
            transition: transform 0.3s ease;
        }

        .card:hover {
            transform: translateY(-3px);
        }

        .card h4 {
            font-weight: 600;
            color: #0d6efd;
        }

        .logout {
            position: absolute;
            bottom: 30px;
            left: 25px;
        }
    </style>
</head>
<body>

    <!-- Sidebar -->
    <div class="sidebar">
        <div class="logo">VIMS Admin</div>
        <a href="/viewUsers"><i class="fas fa-users me-2"></i>View Users</a>
        <a href="/manageProposals"><i class="fas fa-file-signature me-2"></i>Manage Proposals</a>
        <a href="/viewPayments"><i class="fas fa-credit-card me-2"></i>View Payments</a>
        <a href="/logout" class="logout"><i class="fas fa-sign-out-alt me-2"></i>Logout</a>
    </div>

    <!-- Main Content -->
    <div class="content">
        <div class="container">
            <div class="row g-4">
                <div class="col-md-6">
                    <div class="card text-center">
                        <h4>Users Overview</h4>
                        <p class="text-muted">Manage registered users and access their profile and proposal history.</p>
                        <a href="/viewUsers" class="btn btn-outline-primary mt-3">Go to Users</a>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card text-center">
                        <h4>Proposals</h4>
                        <p class="text-muted">Review, approve or reject submitted insurance proposals.</p>
                        <a href="/manageProposals" class="btn btn-outline-success mt-3">Manage Proposals</a>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card text-center">
                        <h4>Payments</h4>
                        <p class="text-muted">Monitor and validate payments received from users.</p>
                        <a href="/viewPayments" class="btn btn-outline-info mt-3">View Payments</a>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card text-center">
                        <h4>Reports</h4>
                        <p class="text-muted">Generate and download monthly performance and claim reports.</p>
                        <a href="/generateReports" class="btn btn-outline-warning mt-3">View Reports</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
