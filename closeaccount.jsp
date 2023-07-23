<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>add user</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f2f2f2;
  }

  header {
    background-color: gray;
    padding: 15px;
    text-align: center;
    margin-bottom: 10px;
  }

  nav {
    background-color: green;
    overflow: hidden;
    width: 51%;
    margin-left: 370px;
  }

  nav a {
    float: left;
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
  }

  nav a:hover {
    background-color: yellow;
  }

  .background-image {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-image: url('path/to/your/background-image.jpg');
    background-size: cover;
    background-repeat: no-repeat;
    opacity: 0.5;
    z-index: -1;
  }

  .container {
    position: relative;
    max-width: 800px;
    margin: 20px auto;
    padding: 20px;
    background-color: rgba(255, 255, 255, 0.8);
    border-radius: 8px;
  }

  h1 {
    color: red;
    text-align: center;
  }

  h3 {
    color: blue;
    text-align: center;
  }

  form {
    max-width: 300px;
    margin: 0 auto;
  }

  form label {
    display: block;
    margin-bottom: 8px;
  }

  form input[type="text"],
  form input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 16px;
    border: 1px solid #ccc;
    border-radius: 4px;
  }

  form input[type="submit"] {
    padding: 12px;
    background-color: #4CAF50;
    color: #ffffff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }

  form input[type="submit"]:hover {
    background-color: #45a049;
  }
</style>
</head>

<body>
<div class="background-image"></div>
  <header>
    <h1>HDFC BANK</h1>
    <h3>Extraordinary Services</h3>
  </header>
  <nav>
    <a href="/">Home</a>
    <a href="/newaccount">New Account</a>
    <a href="/balance">Balance</a>
    <a href="/deposit">Deposit</a>
    <a href="/withdraw">Withdraw</a>
    <a href="/transfer">Transfer</a>
    <a href="/closeacc">Close A/C</a>
    <a href="/aboutus">About Us</a>
  </nav>
  <div class="container">
    <form action="/closeAccount" method="post">
      <h2 style="color:red" align="center">Close Account</h2>
      <h3 style="color:red" align="center">${close}</h3>
      <label for="no">Enter Your Account Number:</label>
      <input type="text" id="no" name="accountNumber" required><br><br>

      <label for="fname">Full Name:</label>
      <input type="text" id="fname" name="fullName" required><br><br>

      <label for="sub1">Password:</label>
      <input type="password" id="sub1" name="password" required><br><br>

      <input type="submit" value="Close Account">
    </form>
  </div>
</body>
</html>
