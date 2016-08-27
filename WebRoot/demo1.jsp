<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@  taglib uri="/struts-tags"  prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title>My JSP 'demo1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
  <body>
  	<!-- 相当于jstl中的c:out，作用是把value中的表达式的值输出到页面上 -->
    	<s:property  value="'abcdf'.length()"/> <br />
    	<s:property  value="'abcdf'.charAt(2)"/> <br />
    	
    	<s:property  value="@java.lang.Integer@MAX_VALUE"/> <br />
    	<s:property  value="@java.lang.Math@abs(-100)"/> <br />
    	
    	<!-- 创建List或者Map对象 -->
    	<s:radio  list="{'男','女'}"  name="gender"  label="性别"  /><br />
    	
    	<s:radio list="#{0:'女',1:'男' }"   name="姓名"></s:radio>
    	
  </body>
</html>
