package br.com.elo7;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lista")
public class ListaJogadores extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Jogador> jogadores = JogadoresDAO.getJogadores();
		
		RequestDispatcher rd = req.getRequestDispatcher("lista-jogadores.jsp");
		req.setAttribute("jogadores", jogadores);
		rd.forward(req, resp);
	}
}
