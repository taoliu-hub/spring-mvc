<!-- addProduct.jsp 文件需在WebContent目录下 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addProduct</title>
</head>
<body>
	<form action="addProduct">
		产品名称 ：<input type="text" name="name" value=""><br /> 
		产品价格： <input type="text" name="price" value=""><br /> 
		<input type="submit" value="增加商品">
	</form>
</body>
</html>