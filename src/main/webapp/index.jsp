
<%@ page import="java.util.List" %>
<%@ page import="model.Noticias" %>
<%@ page import="dao.ListNoticias" %>
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
<!-- pagina principal -->
    <div class="contend">
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
        <!-- imagen principal -->
        <header class="showcase">
            <h1> Mario Fernando Castañeda Perez</h1>
            <h2> Ingenieria en Sistemas Progra2 A </h2>
            <a href="Noticias.jsp" >proyecto Noticiero<i class="fas fa-angle-double-right"> </i> </a>

        </header>

    </div>




</body>
</html>
