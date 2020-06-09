<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Map Environment</title>
</head>
<body>
	<pre>
App-Name: <select name="appName">
			<option></option>
			</select>
Environment: <select>
	<option>  </option>	
	<option>DEV</option>
	<option>SIT</option>
	<option>UAT</option>

			</select>
Alias:<input type="text" name="alias">
URL'S:<input type="text" name="Url">
Type: <select>
	<option>  </option>		
	<option>WEB</option>
	<option>DB</option>
	<option>CLOUD</option>
	</select>	
Decommission:<select>
  			<option>  </option>	
			<option>Active</option>
			<option>Inactive</option>
			</select>
</pre>

</body>
</html>