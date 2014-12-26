<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page session="true"%>

<h1>Transport management</h1>

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script>
    	function Hello($scope, $http) {
    	    $http.get('http://localhost:8080/transport-management/springcontent.json').
    	        success(function(data) {
    	            $scope.user = data;
    	        });
    	}
    	</script>

<div id="userDetail" align="right">
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Welcome : ${pageContext.request.userPrincipal.name} | <a
				href="<c:url value="/j_spring_security_logout" />"> Logout</a>
		</h2>
	</c:if>

</div>