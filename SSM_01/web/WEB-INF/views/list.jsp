<%--
  Created by IntelliJ IDEA.
  User: YRH
  Date: 2019/10/26
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
    <c:if test="${empty requestScope.items}">
        暂时没有商品信息
    </c:if>
    <c:if test="${!empty requestScope.items}">
        <table border="1" cellpadding="10" cellspacing="0">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Pic</th>
                <th>Createtime</th>
                <th>Detail</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>

            <c:forEach items="${requestScope.items}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.price}</td>
                    <td>${item.pic}</td>
                    <td>${item.createtime}</td>
                    <td>${item.detail}</td>
                    <td><a href="">Edit</a></td>
                    <td><a class="delete" href="">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>
