<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

    

    

    <!DOCTYPE html>

<html>

<head>

    <title>Leave Request</title>

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



        label, input, textarea {

            display: block;

            margin-bottom: 10px;

        }
        
         name ,input,phone{
        
            width: 100%;

            padding: 10px;

            border: 1px solid #ccc;

            border-radius: 4px;

            box-sizing: border-box;}



        input[type="date"],

        textarea {

            width: 100%;

            padding: 10px;

            border: 1px solid #ccc;

            border-radius: 4px;

            box-sizing: border-box;

        }



        input[type="submit"] {

            background-color: #4CAF50;

            color: white;

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

    <h1>Leave Request</h1>

    <form action="leaveservlet" method="get">
    
    
        <label for="name">Name</label>   
        <input type="text" id="name" name="name"required> 
        
        <label for="phone">Phone no</label>   
        <input type="number" id="phone" name="phone"required> 

        <label for="startdate">Start Date:</label>
        <input type="date" id="startdate" name="startdate" required>



        <label for="enddate">End Date:</label>
        <input type="date" id="enddate" name="enddate" required>



        <label for="reason">Reason for Leave:</label>
        <textarea id="reason" name="reason" rows="4" cols="50" required></textarea>



        <input type="submit" value="Submit Leave Request">

    </form>

</body>

</html>