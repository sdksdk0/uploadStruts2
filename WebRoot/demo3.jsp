<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>aa</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
  </head>
  
  <body>
    application:<s:property value="#application.p"/><br/>
    session:<s:property value="#session.p"/><br/>
   
   	 请求参数:<s:property value="#parameters.username"/><br/>
   	 取数据:<s:property value="#p"/><br/>
   	 取数据:<s:property value="#request.p"/><br/>
   	 查数据:<s:property value="#attr.p"/><br/>
		
		
		<s:debug></s:debug>
  </body>
</html>
