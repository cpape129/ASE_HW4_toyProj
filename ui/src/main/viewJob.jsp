<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Lookup Job by ID</h3>
        <form:form method="POST" action="/spring-mvc-xml/viewJob" modelAttribute="view">
              <form:label path="id">ID:</form:label>
              <form:input path="id"/>
             
        </form:form>
    </body>
</html>