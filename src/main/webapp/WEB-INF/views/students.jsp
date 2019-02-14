<%--
  Created by IntelliJ IDEA.
  User: leolopez94
  Date: 2019-02-11
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-lg-6">
                <h1>Alumnos</h1>
                <form action="${pageContext.request.contextPath}/students/create" method="post">
                    <div class="form-group">
                        <label for="code">Código</label>
                        <input class="form-control" id="code" name="code" placeholder="11111111">
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="form-group">
                                <label for="apePaterno">Apellido paterno</label>
                                <input class="form-control" id="apePaterno" name="apePaterno">
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="form-group">
                                <label for="apeMaterno">Apellido materno</label>
                                <input class="form-control" id="apeMaterno" name="apeMaterno">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="form-group">
                                <label for="name">Nombre</label>
                                <input class="form-control" id="name" name="name">
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="form-group">
                                <label for="birth">Fecha nacimiento</label>
                                <input class="form-control" id="birth" name="birthDate">
                            </div>
                        </div>
                    </div>
                    <button class="btn btn-primary" type="submit">Agregar</button>
                </form>
            </div>
            <div class="col-lg-6">
                <h1>Alumno agregado</h1>
                <h4>${student}</h4>
            </div>
        </div>
    </div>
</body>
</html>
