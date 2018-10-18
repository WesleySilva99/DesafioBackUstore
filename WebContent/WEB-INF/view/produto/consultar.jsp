<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consulta de produtos com TagLib</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.min.css" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<c:import url="../nav.jsp" />

	<table class="table">
		<tr>
			<th>Id</th>
			<th>Codigo</th>
			<th>Descrição</th>
			<th>Preço de Custo</t>
			<th>Preço de venda</th>
			<th>Garantia</th>
			<th>Quantidade</th>
			<th>Imagem</th>
			<th>Ações</th>
		</tr>

		<c:forEach var="produto" items="${listaProduto}">
			<tr>
				<td>${produto.id}</td>
				<td>${produto.codigo}</td>
				<c:choose>
					<c:when test="${not empty produto.descricao}">
						<td>${produto.descricao}</td>
					</c:when>
					<c:otherwise>
						<td>Descrição não informada.</td>
					</c:otherwise>
				</c:choose>
				<td>${produto.precoCusto}</td>
				<td>${produto.precoVenda}</td>
				<td><fmt:formatDate value="${produto.garantia}" pattern="dd/MM/yyyy" /></td>
				<td>${produto.quantidade}</td>
				<c:choose>
					<c:when test="${not empty produto.imagem}">
						<td><img
							src="<%=request.getContextPath()%>/resources//img/${produto.imagem}"
							height="300" width="300"></td>
					</c:when>
					<c:otherwise>
						<td>Imagem não cadastrada.</td>
					</c:otherwise>
				</c:choose>
				<td>
				<a href="exbirAlterar?id=${produto.id}">
					<button class="btn btn-warning btn-sm">
						Alterar
					</button>
				</a>
				<a href="deletar?id=${produto.id}">
					<button class="btn btn-danger btn-sm">
						Alterar
					</button>
				</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>