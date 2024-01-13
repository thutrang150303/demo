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
<form:form action="" >
    <div class="form-group">
        Ma sinh vien: <input name="maSinhVien">
        <button type="submit">Search</button>
    </div>
</form:form>
        </br>
     <button><a href="/sinh-vien/view-add">Add sinh vien</a></button>
<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Ma sinh vien</th>
        <th scope="col">Ho ten</th>
        <th scope="col">Tuoi</th>
        <th scope="col">Dia chi</th>
        <th scope="col">Gioi tinh</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lists}" var="sinhVien" varStatus="i">
        <tr>
            <td>${i.index +1}</td>
            <td>${sinhVien.maSinhVien}</td>
            <td>${sinhVien.hoTen}</td>
            <td>${sinhVien.tuoi}</td>
            <td>${sinhVien.diaChi}</td>
            <td>${sinhVien.gioiTinh}</td>
            <td>
                <a class="btn btn-primary" href="/sinh-vien/remove/${sinhVien.maSinhVien}">Remove</a>
                <a class="btn btn-primary" href="/sinh-vien/view-update/${sinhVien.maSinhVien}">Update</a>
                <a class="btn btn-primary" href="/sinh-vien/detail/${sinhVien.maSinhVien}">Detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>