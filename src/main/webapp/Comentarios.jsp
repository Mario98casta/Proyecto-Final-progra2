<%@ page import="model.Noticias" %>
<%@ page import="dao.ListNoticias" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Comentarios" %>
<%@ page import="java.util.ArrayList" %>


<%--
  Created by IntelliJ IDEA.
  User: Fernando
  Date: 24/10/2022
  Time: 20:25
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
<div class="contende">
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
    <!-- selecionar noticias y sus comentarios -->
    <div class="noti-select" >


        <%

            String ID = request.getParameter("var");



            int i;
            i = Integer.parseInt(ID);




            ListNoticias Nootis = new ListNoticias();

            Noticias n= Nootis.MostrarNoticia(i);



        %>
        <div>

            <img src="img/imagen<%=i%>.jpg" alt="NEWS<%=i%>">
            <h2><%=n.getTitle() %></h2>
            <p><%=n.getByline()%> </p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid assumenda at dignissimos doloremque et, iusto laboriosam laborum molestiae non odio omnis pariatur placeat praesentium rem repellendus sed similique vero! Minus?</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio dolor eligendi esse fugiat natus reiciendis repudiandae sunt ut voluptates. Consequuntur cumque hic ipsum iste obcaecati quidem recusandae rem sapiente, suscipit!</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium asperiores culpa ducimus fugiat incidunt maxime quis recusandae vel? Deserunt, fuga iusto modi nihil quisquam repellendus similique tenetur voluptate. Laborum, officia!</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam, aut blanditiis, culpa dignissimos doloribus eius fugiat ipsum labore, nostrum officiis perferendis porro quaerat quod quos reiciendis rem repudiandae soluta tempora.</p>
            <h4><%=n.getTexto()%> </h4>
        </div>
        <!--obtener lista de comentarios para cada Noticia  -->
        <div class="container-comments">
            <%
                String na = request.getParameter("nombre");
                String me = request.getParameter("mensaje");

                int ins=0;
                ListNoticias comentarioss = new ListNoticias();


                List<Comentarios> comentaris = comentarioss.getALLDBS();

                if (na == null|me ==null){
                    System.out.println("esta vacial"+na);
                    System.out.println("esta vacial"+me);
                }else {
                    String idecoment = String.valueOf(i);
                    comentarioss.insertar(new Comentarios(idecoment,na,me));

                }

                for (Comentarios c2:comentaris ){
                    int idcoment = Integer.parseInt(c2.getIdcomentarios());
                    ins=ins+1;
                    if (idcoment==i){
            %>

            <div class="comments">
                <div class="photo-perfil">
                    <img src="img/fotoPerfilC.jpg" alt="img">
                </div>
                <div class="info-comments">
                    <div class="header">
                        <h4><%=c2.getNombre() %></h4>
                    </div>
                    <p><%=c2.getComentarios()%> </p>
                </div>
            </div>
            <%
                    }
                }
            %>
        </div>
        <form id="formulario" method="post">

            <div class="container-data">
                <div class="photo-input" >
                    <div class="perfil-photo">
                        <img src="img/mclovin.jpg" alt="sa">
                    </div>
                    <input type="text" name="nombre" placeholder="ingrese su nombre">
                </div>
                 <textarea class="mensaje" name="mensaje" id="mensaje" cols="30" rows="10"  placeholder="Ingrese su Comentario"></textarea>
                <button class="btn-comment"  type="submit" name="action">Comentar</button>

            </div>
        </form>





        <a href="Noticias.jsp" >Regresar<i class="fas fa-angle-double-right"> </i> </a>
    </div>





</div>

</body>
</html>
