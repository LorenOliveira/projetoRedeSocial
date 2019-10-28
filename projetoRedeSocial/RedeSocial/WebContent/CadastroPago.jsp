<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="estilo.css"/>
<script type="text/javascript" src="validacao.js"> </script>
<title> Cadastro Pago </title>
</head>
<body>
<h1 id='nomepagina'> Rede+Cientistas - Cadastro Pago </h1>
    <article id='formulario'>
        <form name="formUsuario" action="SalvoCadastroPago.jsp" method="POST" onSubmit="return validaPago();">
            <fieldset>
                <legend id='legend'>Cadastre-se:</legend> </br>
                    <label> Nome de Usuário </label> </br>
                    <input id="input1" class="cor" type="text" name="nome_usuario" /> </br>
                    <label> Senha: </label> </br>
                    <input  id="input2" class="cor" type="password" name="senha"><br>
                    <label> Data de Nascimento </label> </br>
                    <input id="input3" class="cor" type="text" name="data_nascimento"> <br>
                    <label> Data de Início em Ciência de Dados </label> </br>
                    <input id="input4" class="cor" type="text" name="data_ciencia"> <br>
                    <label> Estado </label> </br>
                    <input id="input5" class="cor" type="text" name="estado"> </br>
                    <label> Cidade </label> </br>
                    <input id="input6" class="cor" type="text" name="cidade"> </br>
                    <label> Salario </label> </br>
                    <input id="input7" class="cor" type="number" name="salario"> </br>
                    <label> Nível de Instrução </label> </br>
                    <input id="input8" class="cor" type="text" name="nivelInstrucao"> </br>
                    <label> Empresa Atual </label> </br>
                    <input id="input9" class="cor" type="text" name="empresa"> </br></br>
            </fieldset>
            <fieldset>
            	<legend id='legend'> Informações de Pagamento </legend>
            	<label> Número do cartão </label> </br>
                <input id="input10" class="cor" type="text" name="num_cartao"> </br>
                <label> Nome do responsável </label> </br>
                <input id="input11" class="cor" type="text" name="nome_resp"> </br></br>
                <label> Data de validade </label> </br>
                <input id="input12" class="cor" type="text" name="dt_validade"> </br>
            	<label> CVC </label> </br>
                <input id="input13" class="cor" type="text" name="cvc"> </br></br>	
            	<input type="submit" value="Enviar" onclick="validaPago();" />
            </fieldset>
         </form>
         
	</article>

</body>
</html>