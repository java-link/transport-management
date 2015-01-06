<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<h1>Transport management</h1>

<div>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    	<script>
		   	function Hello($scope, $http) {
		   	    $http.get('http://localhost:8080/transport-management/springcontent.json').
		   	        success(function(data) {
		   	            $scope.user = data;
		   	        });
		   	}
    	</script>

</div>

<div id="userDetail" align="right" ng-controller="Hello">
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h4>
			Welcome : {{user.userName}} (Id: {{user.id}}) | <a
				href="<c:url value="/j_spring_security_logout" />"> Logout</a>
		</h4>
		{{user.email}}
	</c:if>
</div>
