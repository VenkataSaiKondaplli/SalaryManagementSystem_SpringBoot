<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Home - HDFC BANK</title>
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
      width: 50%;
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
      background-image: url('home.jpg');
      background-size: cover;
      background-repeat: no-repeat;
      opacity: 0.5; /* Adjust the opacity as needed */
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

    h2 {
      color: red;
      text-align: center;
    }

    p {
      text-align: justify;
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
    <h2>About HDFC Bank</h2>
    <p>
      HDFC Bank is one of India's leading private sector banks, providing a wide range of banking and financial services to millions of customers. With a strong presence in both urban and rural areas, we strive to deliver exceptional banking experiences to our clients.
    </p>
    <p>
      Our bank offers various services, including new account openings, balance inquiries, deposits, withdrawals, fund transfers, and more. We are committed to maintaining the highest standards of security, transparency, and customer satisfaction.
    </p>
    <p>
      At HDFC Bank, we continuously innovate and leverage technology to provide our customers with seamless banking solutions. Our dedicated team of professionals ensures that your banking needs are met with efficiency and care.
    </p>
    <p>
      Thank you for choosing HDFC Bank as your trusted financial partner. If you have any questions or need assistance, feel free to contact us using the information provided on our website.
    </p>
  </div>
</body>
</html>
