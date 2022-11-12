package br.com.folder.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	private void sortearMinas() {
		// TODO Auto-generated method stub
		
	}

	private void associarVizinhos() {
		// TODO Auto-generated method stub
		
	}

	private void gerarCampos() {
		// TODO Auto-generated method stub
		
	}
}
