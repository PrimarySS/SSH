<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增收货地址</title>
</head>
<body>

	<form action="savespas.action" method="post">
		<h3>新增收货地址</h3>
		收货人 <input type="text" size="21" value="收货人姓名" name="recipient"><br>
		手机号 <input type="text" size="21" value="请填写收货手机号" name="mobilePhone"><br>
		收货地址 <input type="text" size="21" value="请选择省/市/县（区）" name="address"><br>
		详细地址<input type="text" size="35" value="请输入详细的地址信息（街道、楼牌号等）" name="detailedAddress"><br>
		<input type="submit" value="保存" >
	</form>
	
	
</body>
</html>