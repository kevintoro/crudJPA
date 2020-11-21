<%--
  Created by IntelliJ IDEA.
  User: kevint
  Date: 17/11/20
  Time: 6:09 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Empleado</title>
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
  <div class="card">
    <div class="card-body">
      <c:if test="${empleado != null}">
      <form action="update" method="post">
        </c:if>
        <c:if test="${empleado == null}">
        <form action="insert" method="post">
          </c:if>
          <caption>
            <h2 class="mb-3">
              <c:if test="${empleado != null}">
                Editar Empleado
              </c:if>
              <c:if test="${empleado == null}">
                Agregar Empleado
              </c:if>
            </h2>
          </caption>
          <div class="form-group row">
            <label for="codigo" class="col-md-2 col-sm-12 col-form-label">Codigo:</label>
            <div class="col-sm-12 col-md-10">
              <input type="text" id="codigo" name="codigo" required class="form-control"
                     value="<c:out value="${empleado.getCodigo()}"/>">
            </div>
          </div>
          <div class="form-group row">
            <label for="cedula" class="col-md-2 col-sm-12 col-form-label">Cedula:</label>
            <div class="col-sm-12 col-md-10">
              <input type="text" id="cedula" name="cedula" required class="form-control"
                     value="<c:out value="${empleado.getCedula()}"/>">
            </div>
          </div>
          <div class="form-group row">
            <label for="nombre" class="col-md-2 col-sm-12 col-form-label">Nombre:</label>
            <div class="col-sm-12 col-md-10">
              <input type="text" id="nombre" name="nombre" required class="form-control"
                     value="<c:out value="${empleado.getNombre()}"/>">
            </div>
          </div>
          <div class="form-group row">
            <label for="fechaNacimiento" class="col-md-2 col-sm-12 col-form-label">Fecha de nacimiento:</label>
            <div class="col-sm-12 col-md-10">
              <input class="form-control" type="date" id="fechaNacimiento" name="fechaNacimiento" required
                     value="<c:out value="${empleado.getFechanacimiento()}"/>">
            </div>
          </div>
          <div class="form-group row">
            <label for="fechaIngreso" class="col-md-2 col-sm-12 col-form-label">Fecha de ingreso:</label>
            <div class="col-sm-12 col-md-10">
              <input class="form-control" type="date" id="fechaIngreso" name="fechaIngreso" required
                     value="<c:out value="${empleado.getFechaingreso()}"/>">
            </div>
          </div>
          <div class="form-group row">
            <label for="fechaRetiro" class="col-md-2 col-sm-12 col-form-label">Fecha de retiro:</label>
            <div class="col-sm-12 col-md-10">
              <input class="form-control" type="date" id="fechaRetiro" name="fechaRetiro" required
                     value="<c:out value="${empleado.getFecharetiro()}"/>">
            </div>
          </div>
          <div class="row">
            <button type="submit" class="btn btn-outline-success ml-5">
              <c:if test="${empleado == null}">
                Registrar
              </c:if>
              <c:if test="${empleado != null}">
                Actualizar
              </c:if>
            </button>
            <a href="<%=request.getContextPath()%>/list" class="btn btn-outline-primary ml-5">Volver</a>
          </div>
        </form>
    </div>
  </div>
</div>
</body>
</html>
