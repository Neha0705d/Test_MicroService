<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</head>
<body>
	<div class="container">
<h2>Insert Record here</h2>
<form action="addproduct" method="post">
			<input type="text" name="pname" placeholder="Enter Name here" class="form-control"> <br> <br>
			<input type="text" name="screensize" placeholder="Enter screensize" class="form-control"> <br> <br>
			<input type="text" name="ram" placeholder="Enter ram" class="form-control"> <br> <br>
			<input type="text" name="cpu" placeholder="Enter cpu" class="form-control"> <br> <br>
			
			<input type="submit" value="submit" id="submitBtn" class="btn btn-primary">
		</form>
		</div>
</body>
</html>