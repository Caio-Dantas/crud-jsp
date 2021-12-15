package br.com.elo7;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alterar")
public class AlteraJogador extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nomeAntigo = req.getParameter("nomeAntigo");
		String nomeNovo = req.getParameter("nomeNovo");
		String time = req.getParameter("time");
		
		
		JogadoresDAO.atualizaJogadorPeloNome(nomeAntigo, nomeNovo, time);
		
		resp.sendRedirect("lista");
		
		
		
	}

}
