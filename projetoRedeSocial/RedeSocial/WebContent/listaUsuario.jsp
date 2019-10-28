<%@ page import="java.util.List" %>
<%@ page import="br.com.projeto.bens.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Atualizar dados </title>
</head>
<body>

<%
	List<Usuario> listaResultado = (List<Usuario>)request.getAttribute("lista");
%>

<table>

<%
	for(Usuario u:listaResultado){
%>
		<tr>
			<td> Nome de usuário </td>
			<td> <input type="text" name="nome_usuario" value="<%=u.getNome_usuario() %>" /> </td> 
		</tr>
		<tr>
			<td> Senha </td>
			<td> <input type="text" name="senha" value="<%=u.getSenha() %>" /> </td> 
		</tr>
		<tr>
			<td> Data nascimento </td>
			<td> <input type="text" name="data_nascimento" value="<%=u.getData_nascimento() %>" /> </td>
		</tr>
		<tr>
			<td> Data ciência </td>
			<td> <input type="text" name="data_ciencia"  value="<%=u.getData_ciencia() %>" /> </td>
		</tr>
		<tr>
			<td> Estado </td>
			<td> <input type="text" name="estado" value="<%=u.getEstado() %>" /> </td>
		</tr>
		<tr>
			<td> Cidade </td>
			<td> <input type="text" name="cidade" value="<%=u.getCidade() %>" /> </td>
		</tr>
		<tr>
			<td> Salário </td>
			<td> <input type="number" name="salario" value="<%=u.getSalario() %>" /> </td>
		</tr>
		<tr>
			<td> Nível de instrução </td>
			<td> <input type="text" name="nivelInstrucao" value="<%=u.getNivelInstrucao() %>" /> </td>
		</tr>
		<tr>
			<td> Empresa </td>
			<td> <input type="text" name="empresa" value="<%=u.getEmpresa() %>" /> </td>
		</tr>
		<tr>
			<td> <a href="UsuarioControllador?acao=alt&nome_usuario=<%=u.getNome_usuario()%>"> Alterar </a> </td>
		</tr>
<%
}
%>
</table>

</body>
</html>