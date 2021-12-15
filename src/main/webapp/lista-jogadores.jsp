<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.elo7.*" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>

	<ul>
		<c:forEach items="${jogadores}" var="jogador">
			<li>${jogador.nome} que joga em ${jogador.time}</li>
		</c:forEach>
	</ul>
	
</body>
</html>