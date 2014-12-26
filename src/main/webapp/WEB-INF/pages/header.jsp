<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<html ng-app>
<head>

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script>
	function Hello($scope, $http) {
		$http
				.get(
						'http://localhost:8080/transport-management/springcontent.json')
				.success(function(data) {
					$scope.user = data;
				});
	}
</script>
</head>
<body>
	<h1>Transport management</h1>


	<div ng-controller="Hello">
		<div id="userDetail" align="right">
			<c:if test="${pageContext.request.userPrincipal.name != null}">
					<p>Welcome : </p> 
					<p>{{user.id}} </p> - <p>{{user.userName}}</p> | <a
						href="<c:url value="/j_spring_security_logout" />"> Logout</a>
			</c:if>

		</div>
	</div>
</body>
</html>