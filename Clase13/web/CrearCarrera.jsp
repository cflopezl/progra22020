<%-- 
    Document   : CrearCarrera
    Created on : 18/10/2020, 03:22:50 PM
    Author     : chris
--%>

<%@page import="edu.umg.modelo.Carrera"%>
<%@page import="edu.umg.dao.CarreraDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <h1>Creación de Nueva Carrera</h1>
        
        <% 
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            if(codigo==null && nombre==null){
        %>
        
        <form action="CrearCarrera.jsp" method="POST">
            <div class="form-group">
              <label for="codigo">Código: </label>
              <input type="text" class="form-control" id="codigo" name="codigo" aria-describedby="emailHelp">              
            </div>            
            <div class="form-group">
              <label for="nombre">Nombre: </label>
              <input type="text" class="form-control" id="nombre" name="nombre" aria-describedby="emailHelp">
            </div>
            <button type="submit" class="btn btn-primary">Grabar</button>
        </form>
        <%
            }else{
                //1. Crear una instancia de CarreraDAO
                CarreraDAO carreraDao = new CarreraDAO();
                //2. Crear una instancia de Carrera
                Carrera carrera = new Carrera(Integer.parseInt(codigo), nombre);
                //3. Insertar en la DB la carrera
                carreraDao.saveCarrera(carrera);
            %>
            <div class="alert alert-success" role="alert">
                La carrera fue creada exitosamente <a href="ListaCarrera.jsp" class="alert-link">Ver Listado de Carreras</a>. 
            </div>
            <%
                }
                %>
        
        <form action="MenuCarrera.jsp">
          <button type="submit" class="btn btn-secondary">Regresar Menu</button>
        </form>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
