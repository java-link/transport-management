<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html ng-app>
	<head>
		<title>Spring MVC + AngularJS Demo</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    	<script>
    	function Hello($scope, $http) {
    	    $http.get('http://localhost:8080/transport-management/springcontent.json').
    	        success(function(data) {
    	            $scope.user = data;
    	        });
    	}
    	</script>
	</head>
	<body>
		<div ng-controller="Hello">
			<h2>Spring MVC + AngularJS Demo</h2>
			
			<c:if test="${pageContext.request.userPrincipal.name != null}">
	   			<h2>Welcome : ${pageContext.request.userPrincipal.name} 
           		| <a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>  
			</c:if>
			
			<p>User Id : {{user.id}} </p>
			<p>User Name : {{user.userName}}</p>
			<p>EMail Id : {{user.emailId}}</p>
		</div>
		
	</body>
</html>