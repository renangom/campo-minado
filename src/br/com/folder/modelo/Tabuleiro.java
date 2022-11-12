package br.com.folder.modelo;

import java.util.ArrayList;
import java.util.Iterator;
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
		for (int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				campos.add(new Campo(i,j));
			}
			
		}
		
	}
}
