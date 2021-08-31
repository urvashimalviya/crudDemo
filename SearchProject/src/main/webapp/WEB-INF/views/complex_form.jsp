<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1"
	"shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">

		<div class="row">

			<div class="col-md-8 offset-md-2">

				<div class="card">

					<div class="card-body">

						<h3 class="text-center">Complex Form</h3>

						<div class="alert alert-danger" role="alert">
							<form:errors path="student.*" />
						</div>



						<form action="handleform" method="post">

							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Name
									:</label> <input type="text" name="name" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter name"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									name with anyone else.</small>
							</div>
							<div class="form-group">

								<label for="exampleInputEmail1" class="form-label">Id :</label>
								<input type="text" name="id" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter id">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">DOB :</label>
								<input type="text " name="date" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="dd/mm/yyyy">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Courses
									:</label> <select name="courses" class="form-control"
									id="exampleFormControlSelect1" multiple>

									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Django</option>
									<option>Spring Framework</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Gender :</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>

							</div>

							<div class="form-group">
								<label for="">Select Type </label> <select class="form-control"
									name="type">
									<option value="oldStudent">Old Student</option>
									<option value="normalStudent">Normal Student</option>
								</select>
							</div>
							<div class="card">
								<div class="card-body">
									<p>Your Address</p>
									<div class="form-group">
										<input type="text" class="form-control" name="address.street"
											placeholder="Enter street" />
									</div>
									<div class="form-group">

										<input type="text" class="form-control" name="address.city"
											placeholder="Enter city" />
									</div>
								</div>
							</div>


							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>

							</div>
						</form>
					</div>
				</div>

			</div>

		</div>
	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
    -->
</body>
</html>