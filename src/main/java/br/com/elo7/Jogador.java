package br.com.elo7;

public class Jogador {
	
	private String nome;
	private String time;
	
	public Jogador(String nome, String time) {
		this.nome = nome;
		this.time = time;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
