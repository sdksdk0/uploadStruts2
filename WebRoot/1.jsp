<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>单文件上传</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">

  </head>
  
  <body>
  	<s:fielderror></s:fielderror>
  	<s:actionerror/>
    <s:form action="upload" enctype="multipart/form-data">
    	<s:textfield name="name" label="姓名"></s:textfield>
    	<s:file name="photo" ></s:file>
    	<s:submit value="上传"></s:submit>
    </s:form>
  </body>
</html>
