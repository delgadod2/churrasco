<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produto</title>
</head>
	<body>
		<p> ${sucesso} </p>
		<p> ${falha} </p>
		<form:form action="${spring:mvcUrl('PC#salvar').build()}"
			method="post" commandName="produto" enctype="multipart/form-data">
			<div>
				<label>Nome:</label> 
				<form:input path="nome"/>
				<form:errors path="nome" />
			</div>
			<div>
				<label>Código:</label>
				<form:input path="codigo"/> 
				<form:errors path="codigo" />
			</div>
			<div>
				<label>Descrição</label>
				<form:textarea rows="10" cols="20" path="descricao"/>
				<form:errors path="descricao"/>
			</div>
	
			<div>
				<label>Preço</label> 
				<form:input type="text" path="preco"/>
				<form:errors path="preco"/>
			</div>
			<div>
				<label>Quantidade</label> 
				<form:input type="text" path="quantidade"/>
				<form:errors path="quantidade"/>
			</div>
			<div>
				<form:select path="tipoProduto">
					<form:option value="NONE" label="Selecione" />
					<form:options path="${tipoProduto}" />
				</form:select>
			</div>
			<div>
				<form:select path="unidadeMedida">
					<form:option value="NONE" label="Selecione" />
					<form:options path="${unidadeMedida}" />
				</form:select>
			</div>
	
			<button type="submit">Cadastrar</button>
		</form:form>
	</body>
</html>