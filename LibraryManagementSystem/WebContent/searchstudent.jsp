<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Search Student</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<!-- Custom CSS -->
<style>
body {
	background-image: url('https://wallpaperaccess.com/full/124383.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

.container {
	margin-top: 50px;
}

.form-group {
	margin-bottom: 30px;
}

h1 {
	text-align: center;
	margin-bottom: 30px;
	color: #fff;
	text-shadow: 2px 2px 4px #000;
}

h2 {
	text-align: center;
	margin-top: 50px;
	font-style: italic;
	font-size: 1.5rem;
	color: #fff;
	text-shadow: 2px 2px 4px #000;
}

label[for="bid"] {
	color: #fff;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Search Students</h1>
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<form action="./controller/searchstudent" method="post">
					<div class="form-group">
						<label for="bid">Student ID</label> <input type="text"
							class="form-control" name="sid" placeholder="Enter the student id" required="required">
					</div>
					<div class="form-group text-center">
						<button type="submit" class="btn btn-primary mr-2">Search</button>
						<a href="./managestudents.jsp" class="btn btn-secondary">Back</a>
					</div>
				</form>
			</div>
		</div>
		<h2>"A good book is an event in my life." - Stendhal</h2>
	</div>
	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>