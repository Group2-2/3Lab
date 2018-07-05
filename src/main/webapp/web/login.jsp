<%--
  Created by IntelliJ IDEA.
  User: kudrya
  Date: 29.06.18
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script>
            function clickButton() {
                var loginText = document.getElementById('textAreaLogin').value;
                var passwordText = document.getElementById('textAreaPassword').value;
                $.ajax({
                    type: "post",
                    url: 'login',
                    data: { login: loginText, password : passwordText} ,
                    dataType: "json",
                    complete: [
                        function (response) {
                            var obj = $.parseJSON(response.responseText);
                            var status = obj.status;
                            if (status) {
                                window.open("/search","_self");
                            } else {
                                alert('Error authorisation');
                            }
                        }
                    ]
                });
            }
        </script>
    </head>
    <body>
        <p>Login: <textarea rows="1" cols="45" name="text" id="textAreaLogin"></textarea></p>
        <p>Password: <textarea rows="1" cols="45" name="text" id="textAreaPassword"></textarea></p>
        <p><input id="button" value="Send" onclick="clickButton()" type="button"></p>
    </body>
</html>
