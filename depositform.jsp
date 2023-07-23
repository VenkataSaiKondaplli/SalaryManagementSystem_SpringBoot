<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ATM Receipt</title>

<style>
  body {
    font-family: Arial, sans-serif;
  }
  
  .card {
    border: 1px solid #ccc;
    box-shadow: 6px 4px 15px black;
    width: 400px;
    padding: 20px;
    margin: 90px auto;
    background-color: #f2f2f2;
    
  }
  
  .card h1 {
    color: green;
    text-align: center;
    margin: 10px 0;
  }
  
  .card h4 {
    margin: 5px 0;
    text-align: center;
  }
</style>

</head>
<body style="background-color:gray">
<div class="card">
  <h1> Heyy..! <span style="color:red">${fullname}</span></h1>
  <h4><strong>beforeDeposite:</strong> ${beforeDeposit}</h4>
  <h4><strong>depositAmount:</strong> ${depositedAmount}</h4>
  <h4><strong style="color:red">afterDeposit:</strong> <span style="color:blue">${afterDeposit}</span> </h4>
  <h4><strong>Mobile Number:</strong> ${mobile}</h4>
</div>

</body>
</html>






