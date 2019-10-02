<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10/1/2019
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Calculator Result</title>
</head>
<body>

<form>
    <input type="text" name="add1" size="2" value="${result.num1}"/>
    +
    <input type="text" name="add2" value="${result.num2}" size="2"/>
    =
    <input type="text" name="sum" value="${result.sum}" size="2" readonly/>
    <br/>

    <input type="text" name="mult1" value="${result.num3}" size="2"/>
    *
    <input type="text" name="mult2" value="${result.num4}" size="2"/>
    =
    <input type="text" name="product" value="${result.product}" size="2" readonly/>
    <br/>
    <input type="submit" value="Submit"/>

</form>

</body>
</html>
