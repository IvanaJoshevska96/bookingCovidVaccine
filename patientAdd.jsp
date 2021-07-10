<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>COVID 19</h1>
<h1 >Book or Manage your coronavirus vaccination</h1>
<form action="Register" method="post" style="">
<table>
<tr><td>First Name:</td><td><input type="text" name="firstname"></td></tr>
<tr><td>Last Name:</td><td><input type="text" name="lasttname"></td></tr>
<tr><td>ID Number:</td><td><input type="text" name="idNum"></td></tr>
<tr><td>Age:</td><td><input type="text" name="age"></td></tr>
<tr><td>Address::</td><td><input type="text" name="address"></td></tr>
<tr><td>Municipality:</td><td><input type="text" name="municipality"></td></tr>
<tr><td>Mobile:</td><td><input type="text" name="mobile"></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
<tr><td></td><td><input type="submit" value="Make a Reservation"></td></tr>

</table>
</form>
<h4>*All fields are mandatory</h4>
<h4>*ID number must be unique</h4>
</br><h4>If you have changed your mind about the vaccine, enter your ID and click here</h4>
<form action="Delete" method="post" >
<tr><td>ID Number:</td><td><input type="text" name="idNum"></td></tr>
<tr><td></td><td><input type="submit" value="Cancel"></td></tr>
</form>

 
</br>
</h4>
</body>
</html>