<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html  ng-app>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div align="center">
		<table border="1" cellpadding="2" cellspacing="2" align="center"
			style="width: 950px; height: 780px;">
			<tr style="height: 10%;">
				<td colspan="2"><tiles:insertAttribute name="header" /></td>
			</tr>
			<tr style="height: 90%;">
				<td style="width: 20%;" valign="top" align="left">
					<tiles:insertAttribute name="menu" />
				</td>
				<td valign="top" align="left">
					<div style="padding-left: 15px; padding-top: 25px;">
						<tiles:insertAttribute name="body" />
					</div>
				</td>
			</tr>
			<tr style="height: 3%;">
				<td colspan="2" align="center">
					<tiles:insertAttribute name="footer" />
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
