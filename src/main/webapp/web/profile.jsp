<%--
  Created by IntelliJ IDEA.
  User: kudrya
  Date: 30.06.18
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script>
        $.ajax({
            type: "post",
            url: 'profile',
            dataType: "json",
            complete: [
                function (response) {
                    var obj = $.parseJSON(response.responseText);
                    var object = obj.object;
                    $("#firstName").val(object.firstName);
                    $("#lastName").val(object.lastName);
                    $("#phone").val(object.phone);
                    $("#email").val(object.email);
                }
            ]
        });
    </script>
</head>
<body>
    <p>FirstName: <input type="text" id="firstName" value="" /></p>
    <p>LastName: <input type="text" id="lastName" value="" /></p>
    <p>Email: <input type="text" id="email" value="" /></p>
    <p>Phone: <input type="text" id="phone" value="" /></p>
    <p><a href="/orders">Orders</a></p>
</body>
</html>
