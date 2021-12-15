package br.com.elo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class JogadoresDAO {
	
	private static List<Jogador> jogadores = new ArrayList<>();
	
	public static void adicionaJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public static List<Jogador> getJogadores() {
		return Collections.unmodifiableList(jogadores);
	}
	
	public static void removeJogadorPeloNome(String nome) {
		Optional<Jogador> jogadorToRemove = jogadores
				.stream()
				.filter(jogador -> jogador.getNome().equals(nome))
				.findFirst();

		if(jogadorToRemove.isPresent()) {
			jogadores.remove(jogadorToRemove.get());
		}
	}

	public static void atualizaJogadorPeloNome(String nomeAntigo, String nomeNovo, String time) {
		Optional<Jogador> jogadorToUpdate = jogadores
				.stream()
				.filter(jogador -> jogador.getNome().equals(nomeAntigo))
				.findFirst();
		
		if(jogadorToUpdate.isPresent()) {
			if(!nomeNovo.equals("")) jogadorToUpdate.get().setNome(nomeNovo);
			if(!time.equals("")) jogadorToUpdate.get().setTime(time);
		}
	}

}
