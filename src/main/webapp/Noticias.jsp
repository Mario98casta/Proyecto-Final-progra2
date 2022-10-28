<%@ page import="dao.ListNoticias" %>
<%@ page import="model.Noticias" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: Fernando
  Date: 25/10/2022
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta NAME="viewport" content="width=device-width,initial-scale=1.0">
  <title> Proyecto Noticiero </title>
  <!-- tipo de letra-->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@200&display=swap" rel="stylesheet">
  <!-- Custom CSS -->
  <link rel="stylesheet" href="Vistaweb.css">
  <!-- font aweson -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
</head>
<body>
<div class="contend">
  <!-- navegacion -->
  <nav class="=nav-main">
    <img src="img/logo.jpg" alt="logoUMG" class="nav-bus" >
    <ul class="nav-menu">
      <li>
        <a href="#">Inicio</a>
      </li>
      <li>
        <a href="#">Farandula</a>
      </li>
      <li>
        <a href="#">Deportes</a>
      </li>
      <li>
        <a href="#">Ciencia</a>
      </li>
      <li>
        <a href="#">Economia</a>
      </li>
    </ul>
    <ul class="nav-menu-lupa">
      <li>
        <a href="#">
          <i class="fas fa-search ">
          </i>
        </a>
      </li>

    </ul>

  </nav>
  <hr>
  <!--  mostrarnoticias -->
  <div class = "Noticajas">


    <%
      int i=0;
      ListNoticias Nootis = new ListNoticias();

      List<Noticias> nootiiton= Nootis.getALLDB();



      for (Noticias n: nootiiton){
        i=i+1;
    %>
    <div>

      <img src="img/imagen<%=i%>.jpg" alt="NEWS<%=i%>">
      <h2><%=n.getTitle() %></h2>
      <p><%=n.getByline()%> </p>
      <h4><%=n.getTexto()%></h4>
      <a href="Comentarios.jsp?var=<%=i%>" >Ver Noticia <i class="fas fa-angle-double-right"></i>

      </a>
    </div>

    <%
      }
    %>


  </div>
  <!-- <div class = "top3Noticias">

    <%
       int cont=0;
      do {


      Random MiAleatorio = new Random();
      int N = MiAleatorio.nextInt (30);

      int it=0;

      ListNoticias Nootis3 = new ListNoticias();
      List<Noticias> nootiiton3= Nootis.getALLDB();



      for (Noticias n3: nootiiton3) {

        it=it+1;
          if (it==N){

    %>

    <div>

      <img src="img/imagen<%=it%>.jpg" alt="NEWS<%=it%>">
      <h2><%=n3.getTitle() %></h2>
      <p><%=n3.getByline()%> </p>
      <h4><%=n3.getTexto()%></h4>

    </div>

    <%

          }

        }
        cont++;
      }while (cont != 3);
    %>



  </div>   -->
  <!-- enlace para regresar -->
  <a href="index.jsp" >Regresar<i class="fas fa-angle-double-right"> </i> </a>




</div>



</body>
</html>
