<%--
  Created by IntelliJ IDEA.
  User: kudrya
  Date: 30.06.18
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script>
            function clickButton() {
                var loginText = document.getElementById('textAreaLogin').value;
                var passwordText = document.getElementById('textAreaPassword').value;
                var textFirstName = document.getElementById('textFirstName').value;
                var textLastName = document.getElementById('textLastName').value;
                var textPhone = document.getElementById('textPhone').value;
                var textEmail = document.getElementById('textEmail').value;
                $.ajax({
                    type: "post",
                    url: 'registration',
                    data: { login: loginText, password : passwordText, firstname: textFirstName, secondname: textLastName, phone: textPhone, email: textEmail} ,
                    dataType: "json",
                    complete: [
                        function (response) {
                            var obj = $.parseJSON(response.responseText);
                            var status = obj.status;
                            if (status) {
                                window.open("/search","_self")
                            } else {
                                alert('Error authorisation')
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
        <p>First name: <textarea rows="1" cols="45" name="text" id="textFirstName"></textarea></p>
        <p>Last name: <textarea rows="1" cols="45" name="text" id="textLastName"></textarea></p>
        <p>Phone: <textarea rows="1" cols="45" name="text" id="textPhone"></textarea></p>
        <p>Email: <textarea rows="1" cols="45" name="text" id="textEmail"></textarea></p>
        <p><input id="button" value="Send" onclick="clickButton()" type="button"></p>
    </body>
</html>
