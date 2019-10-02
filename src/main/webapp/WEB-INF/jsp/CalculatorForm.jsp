<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10/1/2019
  Time: 10:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Calculator Form</title>
</head>
<body>

        <c:if test="${errors != null}">

            <ul>
                <c:forEach var="error" items="${errors}">
                    <li>${error}</li>
                </c:forEach>
            </ul>

        </c:if>

<form action="calcculate" method="post">
    <input type="text" name="add1" size="2" value="${form.num1}"/>
    +
    <input type="text" name="add2" value="${form.num2}" size="2"/>
    =
    <input type="text" name="sum" value="${form.sum}" size="2" readonly/>
    <br/>

    <input type="text" name="mult1" value="${form.num3}" size="2"/>
    *
    <input type="text" name="mult2" value="${form.num4}" size="2"/>
    =
    <input type="text" name="product" value="${form.product}" size="2" readonly/>
    <br/>
    <input type="submit" value="Submit"/>

</form>

</body>
</html>
