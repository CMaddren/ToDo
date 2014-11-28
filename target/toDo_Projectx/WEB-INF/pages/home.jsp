<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<%--// need to include stylesheet-- include the tag library from above?--%>
<%--is the link relative to root of project or WEB_INF or something else?--%>
<head>
    <link rel="stylesheet" href= "style.css" type='text/css'/>

    <title>toDoList</title>
</head>
<body>
<h1>${message}</h1>

<p id="para">Adding a paragraph***************

    <a href="/toDo/create">link to the create page</a>

</p>
<div>
    <a href="toDo/item">Link to item view</a>
</div>

<div id="table1">
<table>
    <tr>
        <td>Column1</td>
        <td> Column2</td>
        <td>Column3</td>
    </tr>
    <tr>
        <td>row1,column1</td>
        <td>row1,column2</td>
        <td>row1,column3</td>
    </tr>
</table>
</div>
<%@ include file="footer.jsp" %>
</body>
