<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>userList List</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="UserDashboardController?command=displayDashboard">User Dashboard</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          	<a class="nav-link" href="UserDashboardController?command=Editprofile">Edit Profile</a>
        </li>
        <li class="nav-item">
	         <a class="nav-link" href="SessionLogout">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
	
	<div class="container-sm">
		
		<h1 class="display-5">Passbook</h1>
		
		<br>
		
		<form action="UserDashboardController">
			<div class="d-flex">
				<div class="p-2">
					<label for="fromDate"><b>From Date </b></label><br>
					<input type="date" id="fromDate" name="fromDate"  class="form-control-sm border-dark">
				</div>
				<div class="p-2">
					<label for="toDate" class=""><b>To Date</b></label><br>
					<input type="date" id="toDate" name="toDate"  class="form-control-sm border-dark">
				</div>	
			</div>
				<input type="hidden" class="form-control" name="command" value="searchDate"><br>
				<input type="submit" class="btn btn-dark mx-2" value="Search">
			<br>
		</form>
		<hr>
			<c:if test="${transactionList == null}">
				<p class="display-6">No records found</p>
			</c:if>
		
		<table class="table table-hover">
			<tr>
				<th>Transaction ID</th>
				<th>Transaction Type</th>
				<th>Date</th>
				<th>Amount</th>
				<th>Balance</th>

			</tr>

			<c:forEach var="transaction" items="${transactionList}">

				<tr>
					<td>${transaction.transactionId}</td>
					<td>${transaction.transactionType}</td>
					<td>${transaction.transactionDate}</td>
					<td>${transaction.transactionAmount}</td>
					<td>${transaction.balance}</td>




				</tr>


			</c:forEach>

		</table>
		
		<input type="button" class="btn btn-dark" value="print" onClick="window.print()"/> 

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>