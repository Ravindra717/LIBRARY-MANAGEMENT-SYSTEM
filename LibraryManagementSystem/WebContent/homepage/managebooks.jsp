<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Books</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
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
        .options {
  display: flex;
  flex-direction: column;
  margin-bottom: 30px;
}

.btn {
  margin: 10px 0;
  padding: 10px 20px;
  border-radius: 20px;
  color: #fff;
  background-color: #e61db7;
  transition: all 0.3s ease-in-out;
  width: 100px;
  text-align: center;
}

.btn:hover {
  text-decoration: none;
  background-color: #e61d60;
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
    </style>
</head>
<body>
    <div class="container">
        <h1>Manage Books</h1>
        <div class="options">
           <a href="../searchbook.jsp" class="btn">Search</a>
           <a href="../addbook.jsp" class="btn">Add</a>
           <a href="../updatebook.jsp" class="btn">Update</a>
           <a href="../deletebook.jsp" class="btn">Delete</a>
           <a href="../homepage.jsp" class="btn">Back</a>
        </div>
        <h2>"A library is a hospital for the mind." - Neil Gaiman</h2>
    </div>
    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
