package br.com.elo7;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrar")
public class CadastroJogadores extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String time = req.getParameter("time");
		
		Jogador jogador = new Jogador(nome, time);
		
		JogadoresDAO.adicionaJogador(jogador);
		
		res.sendRedirect("lista");
		
	}

}
