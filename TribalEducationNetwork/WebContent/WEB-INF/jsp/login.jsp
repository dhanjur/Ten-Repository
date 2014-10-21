<!DOCTYPE html>
<html>
<head>
	<title>Tribal Education Network Login</title>
</head>
<body>
	<form method="POST" action="j_security_check" >
	  <table border="1">
	    <tr>
	      <th align="right">Username:</th>
	      <td align="left"><input type="text" name="j_username"></td>
	    </tr>
	    <tr>
	      <th align="right">Password:</th>
	      <td align="left"><input type="password" name="j_password"></td>
	    </tr>
	    <tr>
	      <td align="right"><input type="submit" value="Log In"></td>
	      <td align="left"><input type="reset"></td>
	    </tr>
	  </table>
	  <input type="hidden" name="originalUrl"/>
</form>
</body>
</html>