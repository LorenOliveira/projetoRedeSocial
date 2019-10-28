<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="estilo.css"/>
		
		
		<title> Login </title> 
    </head>
    <body>
        <h1 id='nomepagina'> Rede+Cientistas </h1> 
            <aside id='asidelogin'>
        	<h2> Uma rede social dedicada exclusivamente para você: Cientista de Dados! </h2>
        	<h2> O Data Science Social te ajuda a se conectar com todos os cientistas de dados no Brasil!</h2>
        
	        <figure id='conexao'>
	        <img src="image/conexao.jpeg" alt="conexao" width="300px" height="300px"'>	
	    	</figure>
	    </aside>
           <section id='linkcadastro'>
           
        	<h2> Já é cadastrado? </h2>
        	<form action="autenticador" method="POST">
        		<label> Nome de Usuário </label> </br>
        		<input type="text" name="nome_usuario" /></br></br>
        		<label> Senha </label> </br>
        		<input type="password" name="senha"> </br></br>
        		<input type="submit" value="Entrar" />
       		</form>
       		
       		<h2> Não possui cadastro? Junte-se a nós!</h2> 
       		<h3> Selecione uma opção:</h3>
       	   <a href="UsuarioControllador?acao=cad"> <input type="button" value="Cadastro Gratuito" /> </a>
       	   <a href="UsuarioControlladorDois?acao=cadPago"> <input type="button" value="Cadastro Pago" /> </a>
       	   </section>
    </body>
</html>
