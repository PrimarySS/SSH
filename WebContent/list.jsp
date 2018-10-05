<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%String context = request.getContextPath(); %>
<%@taglib uri="/struts-tags"  prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增收货地址</title>
</head>
<body>
	<table border="1">

		<tr>
			<td>编号</td>
			<td>收货人</td>
			<td>手机号</td>
			<td>收货地址</td>
			<td>详细地址</td>
		</tr>
		
		<s:iterator value="list" var="p">
			<tr>
				<td><s:property value="#p.id" /></td>
				<td><s:property value="#p.recipient" /></td>
				<td><s:property value="#p.mobilePhone" /></td>
				<td><s:property value="#p.address" /></td>
				<td><s:property value="#p.detailedAddress" /></td>

				<td>
				<a href="<%=context %>/FindAddressByIdspas.action?id=<s:property value="#p.id"/>">修改</a> 
				<a href="<%=context %>/deletespas.action?id=<s:property value="#p.id"/>">删除</a>
				</td>

			</tr>
		</s:iterator>
	</table>

</body>
</html>