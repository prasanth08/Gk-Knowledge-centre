<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
    <%@ taglib prefix="s" uri="/struts-tags"%>  
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Attendence calculator</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker({ dateFormat: "yy-mm-dd" });
    $( "#datepicker1" ).datepicker({ dateFormat: "yy-mm-dd" });
   
  } );
  </script>
</head>
<body>
 <s:form action="acalc">
  <s:textfield name="sid" label="sid"></s:textfield> 
 From: <input type="text" id="datepicker" name="fdate">
 To: <input type="text" id="datepicker1" name="edate">

 <s:submit value="submit" ></s:submit>
 </s:form>

</body>
</html>