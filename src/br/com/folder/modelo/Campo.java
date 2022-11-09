package br.com.folder.modelo;

public class Campo {
	private final int linha;
	private final int coluna;
	private boolean minado;
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
}
