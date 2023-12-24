<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
</head>

   <div>
       <a href="${pageContext.request.contextPath}/book/toAddBook">添加书籍</a>
   </div>
<center>
<body>
    <div>
        <table>
            <tr>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍详情</th>
                <th>操作</th>
            </tr>
            <c:forEach var="book" items="${list}">
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/book/toUpdate?bookId=${book.bookID}">修改书籍</a>
                        <a href="${pageContext.request.contextPath}/book/deletebook?id=${book.bookID}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</center>
</html>
