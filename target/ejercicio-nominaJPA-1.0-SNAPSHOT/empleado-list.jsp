<%--
  Created by IntelliJ IDEA.
  User: kevint
  Date: 17/11/20
  Time: 6:10 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Empleados</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<header>
  <nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div>
      <a href="https://www.github.com/kevintoro" target="_blank" class="navbar-brand">
        Empleados
      </a>
    </div>
    <ul class="navbar-nav nav">
      <li><a href="<%=request.getContextPath()%>/list" class="nav-link">listar</a></li>
    </ul>
  </nav>
</header>
<div class="container mt-4">
  <div class="col-md-12">
    <h3 class="text-center">
      Empleados
    </h3>
    <hr>
    <div class="container text-left">
      <div class="row">
        <a href="<%=request.getContextPath()%>/new" class="btn btn-outline-success">
          Registrar Empleado
        </a>
        <form class="form-inline my-2 my-lg-0 ml-4" method="post" action="search">
          <input class="form-control mr-sm-2"
                 type="search"
                 placeholder="Codigo"
                 aria-label="Search"
                 name="codigo"
                 required
          >
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </div>
    <table class="table table-bordered mt-4">
      <thead>
      <tr>
        <th>Codigo</th>
        <th>Cedula</th>
        <th>Nombre</th>
        <th>Fecha de Nacimiento</th>
        <th>Fecha de ingreso</th>
        <th>Fecha de retiro</th>
        <th>Actions</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var="empleado" items="${empleados}">
        <tr>
          <td>
            <c:out value="${empleado.getCodigo()}"/>
          </td>
          <td>
            <c:out value="${empleado.getCedula()}"/>
          </td>
          <td>
            <c:out value="${empleado.getNombre()}"/>
          </td>
          <td>
            <c:out value="${empleado.getFechanacimiento()}"/>
          </td>
          <td>
            <c:out value="${empleado.getFechaingreso()}"/>
          </td>
          <td>
            <c:out value="${empleado.getFecharetiro()}"/>
          </td>
          <td>
            <a href='edit?codigo=<c:out value="${empleado.getCodigo()}"/>'>edit</a>&nbsp;
            <a href='delete?codigo=<c:out value="${empleado.getCodigo()}"/>'>delete</a>
          </td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>
