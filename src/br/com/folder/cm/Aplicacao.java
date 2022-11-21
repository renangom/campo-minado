package br.com.folder.cm;

import br.com.folder.modelo.Tabuleiro;
import br.com.folder.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(7,7,6);
		new TabuleiroConsole(tabuleiro);
	}
}
