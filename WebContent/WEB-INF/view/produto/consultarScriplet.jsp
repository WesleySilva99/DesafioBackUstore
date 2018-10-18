<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="br.com.ustore.gerenciador.model.entities.Produto"%>
<%@ page import="br.com.ustore.gerenciador.model.dao.ProdutoDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consulta com Scriplet</title>
</head>
<body>
	<%
		ProdutoDao dao = new ProdutoDao();
		List<Produto> listaProduto = dao.listar();
		for (Produto produto : listaProduto) {
	%>
	
		<li><%=produto.getCodigo()%> | <%=produto.getDescricao()%> | <%=produto.getPrecoCusto()%></li>
	
	<%
		}
	%>
</body>
</html>