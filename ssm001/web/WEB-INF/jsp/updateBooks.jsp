
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/book/updateBooks" method="post">
        <table>
            <tr>
                <td>书籍id</td>
                <td><input type="text" name="bookID" value="${Qbook.bookID}" required ></td>
            </tr>
            <tr>
                <td>书籍名称</td>
                <td><input type="text" name="bookName" value="${Qbook.bookName}" required ></td>
            </tr>
            <tr>
                <td>书籍数量</td>
                <td><input type="text" name="bookCounts" value="${Qbook.bookCounts}" required></td>
            </tr>
            <tr>
                <td>书籍详情</td>
                <td><input type="text" name="detail" value="${Qbook.detail}" required/></td>
            </tr>
            
            <tr>
                <td><input type="submit" value="修改"/>修改书籍</td>
            </tr>
        </table>
    </form>
</body>
</html>
