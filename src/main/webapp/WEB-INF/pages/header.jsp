<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<div id="userDetail" align="right" ng-controller="Hello">
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h4>
			Welcome : {{user.id}} - {{user.userName}} | <a
				href="<c:url value="/j_spring_security_logout" />"> Logout</a>
		</h4>
	</c:if>
</div>
