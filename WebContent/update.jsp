<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%String context = request.getContextPath(); %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增收货地址</title>
</head>
<body>

	<form action="<%=context %>/updatespas.action" method="post">
		<h3>修改收货地址</h3>
		编号<input type="text" size="21" value="<s:property value="#updateAddress.id" />" name="id"><br>
		收货人 <input type="text" size="21" value="<s:property value="#updateAddress.recipient" />" name="recipient"><br>
		手机号 <input type="text" size="21" value="<s:property value="#updateAddress.mobilePhone" />" name="mobilePhone"><br>
		收货地址 <input type="text" size="21" value="<s:property value="#updateAddress.address" />" name="address"><br>
		<input type="text" size="35" value="<s:property value="#updateAddress.detailedAddress" />" name="detailedAddress"><br>
		<input type="submit" value="保存" >
	</form>

</body>
</html>