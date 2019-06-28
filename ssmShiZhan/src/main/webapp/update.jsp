<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <h1>修改页面</h1>
  <form action="${pageContext.request.contextPath}/student/update.do" method="post">

      <input name="id" type="hidden" value="${stu.id}">
     
    学生姓名：<input type="text" name="name" value="${stu.name}" ><br/>
    学生性别：

     <%-- <select name="sex">
          <option value="0" <c:if test="${stu.sex ==0}"> selected</c:if> >男</option>
          <option value="1" <c:if test="${stu.sex ==1}"> selected</c:if> >女</option>
      </select>--%>
      男<input type="radio" name="sex" value="0" <c:if test="${stu.sex ==0}"> checked</c:if>>

      女<input type="radio" name="sex" value="1" <c:if test="${stu.sex ==1}"> checked</c:if>>

      <br/>
    学生年龄：<input type="text" name="age" value="${stu.age}"><br/>
    学生地址：<input type="text" name="address" value="${stu.address}"><br/>
    <button type="submit">修改</button>
  </form>
</body>
</html>
