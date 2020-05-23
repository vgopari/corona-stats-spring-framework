<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>corona Cases</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<style>
h2 {
	text-align: center;
}
</style>
</head>
<body>
	<div class="container">
		<div id="counters">
			<div class="container">
				<div class="container">

					<center>
						<h2
							style="text-transform: uppercase !important; background: -webkit-linear-gradient(#e1a9fc, #ff9ee6); -webkit-background-clip: text; -webkit-text-fill-color: transparent;">
							#Stayhome</h2>
					</center>

					<center>
						<h2>Corona virus worldwide</h2>
						<h5>Last updated : ${worlddetails.statistic_taken_at}</h5>
					</center>
					<div class="row">
						<div class="col-sm">
							<h3 class="h3">Worldwide</h3>
							Cases
						</div>

						<div class="col-sm">
							<h3 class="h3">${worlddetails.world_total.total_cases}</h3>
							<hr>
							New Cases
						</div>

						<div class="col-sm">
							<h3 class="death">${worlddetails.world_total.total_deaths}</h3>
							<hr>
							Total Death
						</div>

						<div class="col-sm">
							<h3>${worlddetails.world_total.active_cases}</h3>
							<hr>
							Active Cases
						</div>

						<div class="col-sm">
							<h3 class="recover">${worlddetails.world_total.total_recovered}</h3>
							<hr>
							Recovered
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div id="counters">
			<div id="container">

				<div id="content">
					<center>
						<table>
							<tr>
								<th>Country</th>
								<th>Cases</th>
								<th>Deaths</th>
								<th>Total Recovered</th>
								<th>New Cases</th>
								<th>Active Cases</th>
								<th>Critical Condition</th>
								<th>Total Tests</th>

								<c:forEach var="stats" items="${worlddetails.countries_stat}">

									<tr class="scroll">
										
										<td>${stats.country_name}</td>
										<td>${stats.cases}</td>
										<td>${stats.deaths}</td>
										<td>${stats.total_recovered}</td>
										<td>${stats.new_cases}</td>
										<td>${stats.active_cases}</td>
										<td>${stats.serious_critical}</td>
										<td>${stats.total_tests }</td>

									</tr>

								</c:forEach>
							</tr>
						</table>
						
					</center>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
























