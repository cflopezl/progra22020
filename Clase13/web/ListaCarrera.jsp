<%-- 
    Document   : ListaCarrera
    Created on : 18/10/2020, 02:31:01 PM
    Author     : chris
--%>

<%@page import="java.util.List"%>
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
        <h1>Lista de Carreras</h1>
        <table class="table table-striped">
            <thead class="thead-dark">
              <tr>
                <th scope="col">#</th>
                <th scope="col">Código</th>
                <th scope="col">Nombre</th>
              </tr>
            </thead>
            <tbody>
              <%
              //1. Crear una instancia DAO correpondiente a las carreras
              CarreraDAO carreraDao = new CarreraDAO();
              //2. Obtener todas las carreras de la base de datos
              List<Carrera> carreras = carreraDao.getDBCarreras();
              //3. Iterar todas las carreras
              int i=0;
              for( Carrera carrera : carreras){
              //4. Pintar el HTML que correponde a cada carrera
                i++;
              %>
              <tr>
                <th scope="row"><%=i%></th>
                <td><%=carrera.getCodigo()%></td>
                <td><%=carrera.getNombre()%></td>
              </tr>
              <% 
               }
              %>              
            </tbody>
          </table>
        <form action="MenuCarrera.jsp">
          <button type="submit" class="btn btn-secondary">Regresar Menu</button>
        </form>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
