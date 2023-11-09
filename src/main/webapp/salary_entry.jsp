<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

   



<!DOCTYPE html>

<html>

<head>

    <title>Salary Entry</title>

    <style>

        body {

            font-family: Arial, sans-serif;

            background-color: #f2f2f2;

            margin: 0;

            padding: 0;

        }



        h1 {

            text-align: center;

        }



        form {

            max-width: 400px;

            margin: 0 auto;

            background-color: #fff;

            padding: 20px;

            border-radius: 5px;

            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);

        }



        label, input {

            display: block;

            margin-bottom: 10px;

        }



        input[type="text"], select {

            width: 100%;

            padding: 10px;

            border: 1px solid #ccc;

            border-radius: 4px;

            box-sizing: border-box;

        }



        input[type="submit"] {

            background-color: #4CAF50;

            color: white;

            margin-top:10px;

            padding: 10px 20px;

            border: none;

            border-radius: 4px;

            cursor: pointer;

        }



        input[type="submit"]:hover {

            background-color: #45a049;

        }

    </style>

</head>

<body>

<h1>Salary Entry</h1>

    <form action="salaryservlet" method="get">

        

        <label for="name">Employee Name:</label>

        <input type="text" id="name" name="name" required>



        <label for="salary">Salary:</label>

        <input type="text" id="salary" name="salary" required>



        <label for="month">Month:</label>
      <!--   <input type="text" id="month" name="month" required>
 -->
       <select id="month" name="month" required>

            <option value="January">January</option>

            <option value="February">February</option>

            <option value="March">March</option>

            <option value="April">April</option>

            <option value="May">May</option>

            <option value="June">June</option>

            <option value="July">July</option>

            <option value="August">August</option>

            <option value="September">September</option>

            <option value="October">October</option>

            <option value="November">November</option>

            <option value="December">December</option>

        </select>



        <input type="submit" value="Submit Salary">

    </form>

</body>

</html>