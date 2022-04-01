<%--
  Created by IntelliJ IDEA.
  User: tranvantrong
  Date: 01/04/2022
  Time: 00:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Create Email</h3>
<form:form method="POST" action="create" modelAttribute="mailbox">
    <table>
        <tr>
            <td><form:label path="langueges">Langueges: </form:label></td>
            <td><form:select  items="${languegesList}"  path="langueges"></form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size: </form:label></td>
            <td><form:select  items="${pageSizeList}" path="pageSize" /></td>
        </tr>
        <tr>
            <td><form:label path="spamrfilter">Spamrfilter: </form:label></td>
            <td><form:checkbox path="spamrfilter"/></td>
        </tr>
        <tr>
            <td><form:label path="singnatune">Singnatune: </form:label></td>
            <td><form:textarea path="singnatune"/></td>
        </tr>
        <tr>
            <td><a href="#">Edit</a></td>
        </tr>
    </table>
</form:form>
</body>
</html>
