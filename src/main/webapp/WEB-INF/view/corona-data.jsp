<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CoronaVirus Data</title>
<style type="text/css">
img {
	display: block;
	margin-left: auto;
	margin-right: auto
}

a {
	text-align: center;
	float: right;
	margin-left: 20px;
}

h3 {
	text-align: center;
	margin-left: 120px;
}

p, h2 {
	text-align: center;
}

.column {
	float: inherit;
	width: 33.33%;
	padding: 5px;
}

/* Clear floats after image containers */
.row {
	clear: both;
	display: flex;
}
</style>
</head>
<body>
	
	<h2>Coronavirus Data</h2>
	<a href="${pageContext.request.contextPath}/showForm">select a
		country</a>

	<h3>country: ${details.report.country.toUpperCase()}</h3>

	<img src="${details.report.flag}">
	<p>
		<strong> cases: ${details.report.cases} <br> <br>
			deaths: ${details.report.deaths} <br> <br> recovered:
			${details.report.recovered}
		</strong>
	</p>

	<hr>

</body>
</html>