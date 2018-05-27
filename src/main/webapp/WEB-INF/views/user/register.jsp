<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Twitter App - Register user</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/jspf/header.jspf"%>

	<form:form method="post" modelAttribute="userData">
		<div>Username: <form:input path="username" /> <form:errors path="username" element="div" /></div>
		<div>Password: <form:password path="password" /> <form:errors path="password" element="div" /></div>
		<div>Email: <form:input type="email" path="email" /> <form:errors path="email" element="div" /></div>
		<div><input type="submit" /></div>
	</form:form>

	<%@ include file="/WEB-INF/views/jspf/footer.jspf"%>
</body>
</html>