<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2023/11/27
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
</head>
   <center>
        <body>
          <div>
              <form action="${pageContext.request.contextPath}/book/AddBook" method="post">
                     <table>
                         <tr>
                             <td>书籍名称</td>
                             <td>
                                 <input type="text" name="bookName"/>
                             </td>
                         </tr>
                         <tr>
                             <td>书籍数量</td>
                             <td>
                                 <input type="text" name="bookCounts"/>
                             </td>
                         </tr>
                         <tr>
                             <td>书籍详情</td>
                             <td>
                                 <input type="text" name="detail"/>
                             </td>
                         </tr>

                         <tr>
                             <td><input type="submit" value="添加"/>添加书籍</td>
                         </tr>
                     </table>
              </form>
          </div>
        </body>
   </center>
</html>
