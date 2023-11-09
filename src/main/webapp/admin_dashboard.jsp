<!DOCTYPE html>

<html>

<head>

    <title>Admin Dashboard</title>

    <style>

        body {

            font-family: Arial, sans-serif;

            background-color: #f2f2f2;

            margin: 0;

            padding: 0;

        }



        .header {

            background-color: #333;

            color: #fff;

            text-align: center;

            padding: 20px;

        }



        h1 {

            margin: 0;

        }



        .navbar {

            text-align: center;

        }



        .navbar li {

            display: inline;

        }



        .navbar a {

            text-decoration: none;

            display: inline-block;

            background-color: #007bff;

            color: #fff;

            padding: 10px 20px;

            border: none;

            border-radius: 5px;

            cursor: pointer;

            margin: 0 10px; /* Add margin between buttons */

        }



        .navbar a:hover {

            background-color: #0056b3;

        }

    </style>

</head>

<body>

    <div class="header">

        <h1>Welcome, Admin!</h1>

    </div>

    <ul class="navbar">

        <li><a href="EmployeeDetailsServlet">Employee Details</a></li>

        <li><a href="salaryentry">Salary</a></li>

        <li><a href="leave_request">Leave</a></li>

        <li><a href="addEmployee">Add Employee</a></li>

        

    </ul>

</body>

</html>

