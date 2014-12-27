<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<h1>Transport management</h1>
<div id="userDetail" align="right" ng-controller="Hello">
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h4>
			Welcome : {{user.userName}} (Id: {{user.id}}) | <a
				href="<c:url value="/j_spring_security_logout" />"> Logout</a>
		</h4>
		{{user.emailId}}
	</c:if>
</div>
