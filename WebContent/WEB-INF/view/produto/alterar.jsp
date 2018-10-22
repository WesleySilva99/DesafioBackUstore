<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alteração dos dados do Produtos</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.min.css" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="../nav.jsp" />

<center>
	<h1>Alterar Dados do Produto</h1>
	<form action="inserir" method="post" enctype="multipart/form-data">
		<p>
			Código: <br /> <input type="text" name="codigo" />
		</p>
		<p>
			Descrição: <br /> <input type="text" name="descricao" />
		</p>
		<p>
			Preco de Custo: <br /> <input type="text" name="precoCusto" />
		</p>
		<p>
			Preco de Denda: <br /> <input type="text" name="precoVenda" />
		</p>
		<p>
			Garantia: <br /> <input type="text" name="garantia" />
		</p>
		<p>
			Quantidade: <br /> <input type="text" name="quantidade" />
		</p>
		<p>
			Foto do Produto: <br /> <input class="form-control-file" type="file" name="file">
		</p>
		<a href="listarProduto" class="btn btn-danger" role="button">Cancelar</a>
		&nbsp;
		<button type="reset" class="btn btn-default">&nbsp; Limpar
			&nbsp;</button>
		&nbsp;
		<button type="submit" class="btn btn-primary">&nbsp; Inserir
			&nbsp; </ button>
	</form>
</center>
</body>
</html>