<%@ page import="br.com.projeto.bens.Usuario" %>
<%@ page import="br.com.projeto.redesocial.UsuarioDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="estilo.css"/>
<script type="text/javascript">
		function entrar(){
		location.href="LoginUsu.jsp" }
</script> 
<title> Cadastro </title>
</head>
<body id='entrarlogin'>
	
<%
	String snome = request.getParameter("nome_usuario");
	String ssenha = request.getParameter("senha");
	String sdata_nasc = request.getParameter("data_nascimento");
	String sdata_ciencia = request.getParameter("data_ciencia");
	String sestado = request.getParameter("estado");
	String scidade = request.getParameter("cidade");
	String ssalario = request.getParameter("salario");
	String snivelInstrucao = request.getParameter("nivelInstrucao");
	String sempresa = request.getParameter("empresa");
	
	Usuario usu = new Usuario();
	
	usu.setNome_usuario(snome);
	usu.setSenha(ssenha);
	usu.setData_nascimento(sdata_nasc);
	usu.setData_ciencia(sdata_ciencia);
	usu.setEstado(sestado);
	usu.setCidade(scidade);
	usu.setSalario(ssalario);
	usu.setNivelInstrucao(snivelInstrucao);
	usu.setEmpresa(sempresa);
	
	UsuarioDAO usuDao = new UsuarioDAO();
	usuDao.cadastro(usu);
%>

	<h1> Salvo com sucesso! </h1>
	<input type="button" value="Entrar" onClick="entrar()">

</body>
</html>