<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="bakehouse" uri="http://www.mangofactory.com/bakehouse" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<bakehouse:resource src="angular.js" cdn="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.3/angular.min.js"/>
		<bakehouse:resources configuration="javascript" type="text/javascript">
			<bakehouse:resource src="file1.js"/>
			<bakehouse:resource src="file2.js"/>
		</bakehouse:resources>
		
		<bakehouse:resources configuration="less" type="text/css">
			<bakehouse:resource src="stylesheet.less"/>
		</bakehouse:resources>
		<bakehouse:resources configuration="typescript" type="text/javascript">
			<bakehouse:resource src="typescript.ts"/>
		</bakehouse:resources>
	</head>
<body>
Hello, World
</body>
</html>