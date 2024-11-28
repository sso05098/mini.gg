<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/mini.gg/resources/css/login.css">
<script src="/mini.gg/resources/js/jquery-3.7.1.min.js"></script>
<script src="/mini.gg/resources/js/myJS.js"></script>
<script>
    let checkForm = function() {
        let id = document.registerForm.id.value;
        let password = document.registerForm.password.value;
        let name = document.registerForm.name.value;
        let number = document.registerForm.number.value;

        if (checkBlank(id, 'ID를 입력하세요'))
            return false;

        if (checkBlank(password, 'PASSWORD를 입력하세요'))
            return false;

        if (checkBlank(name, '이름을 입력하세요'))
            return false;

        if (checkBlank(number, '전화번호를 입력하세요'))
            return false;

        return true;
    }

    function checkBlank(value, message) {
        if (value.trim() === "") {
            alert(message);
            return true;
        }
        return false;
    }
</script>
</head>

<body>
    <h2>회원가입</h2>
    <% if (request.getAttribute("errorMessage") != null) { %>
        <script>alert("<%= request.getAttribute("errorMessage") %>");</script>
    <% } %>
    <form name="registerForm" action="registerProcess.do" method="post" onsubmit="return checkForm()">
        <table>
            <tr>
                <th>아이디</th>
                <td><input type="text" name="id-name" placeholder="ID를 입력하세요" required></td>
            </tr>
            <tr>
                <th>비밀번호</th>
                <td><input type="password" name="pw-name" placeholder="PWD를 입력하세요" required></td>
            </tr>
            <tr>
                <th>이름</th>
                <td><input type="text" name="name" placeholder="이름을 입력하세요" required></td>
            </tr>
            <tr>
                <th>전화번호</th>
                <td><input type="text" name="number" placeholder="전화번호를 입력하세요" required></td>
            </tr>
        </table>
        <input type="submit" value="회원가입">
    </form>
</body>
</html>
