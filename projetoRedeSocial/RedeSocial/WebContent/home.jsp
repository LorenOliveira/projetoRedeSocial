<%@ page import="br.com.projeto.bens.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="estilo.css"/>
<title> Rede+Cientista </title>
</head>
<body>
<!-- <h1> @<% Usuario usu = new Usuario();
		System.out.println(usu.getNome_usuario());
	  %> 
	</h1> -->
    <aside id='asideperfil'>
    <figure>
        <img src="image/image.jpeg" alt="foto_perfil" width="250px" height="250px">	
        <figcaption>Adicione sua foto de perfil!</figcaption>
    </figure>
    <section>
        <h2> Recomenda��es: </h2>
        <button name="button"> Recomendar Perfil </button>
    </section>    
    </aside>    
    <nav>
      <ul>
        <li><a href="home.jsp">P�gina Inicial</a></li>
        <li><a href="UsuarioControllador?acao=lis">Amigos</a></li>
        <li><a href="UsuarioControllador?acao=lis">Atualizar Dados</a></li>
        <li><a href="LoginUsu.jsp"> Sair </a></li>
      </ul>
    </nav>
    <section>
    	<h1> Seja bem vindo(a) a uma rede social dedicada a voc�! </h1>
        <h2> Publica��es: </h2>
    </section>
</body>
</html>