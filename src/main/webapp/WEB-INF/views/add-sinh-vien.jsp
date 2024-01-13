<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Title</title>
</head>
<body class="container">
<form:form action="/sinh-vien/add" method="post">
    <div class="form-group">
        Ma sinh vien: <input name="maSinhVien">
        </br>
        Ho ten: <input name="hoTen">
        </br>
        Tuoi: <input name="tuoi">
        </br>
        Dia chi: <input name="diaChi">
        </br>
        Giới tính:
        <input type="radio" name="gioiTinh" checked value="true"/>Nam
        <input type="radio" name="gioiTinh" value="false"/>Nữ
        <br/>

        <button type="submit">Add</button>
    </div>
</form:form>
</br>
</body>
</html>