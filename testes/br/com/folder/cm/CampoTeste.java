package br.com.folder.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.folder.modelo.Campo;

class CampoTeste {
	private Campo campo;
	
	//instancia um objeto da classe campo para cada teste
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRealDistancia1Esquerda() {
		Campo vizinho = new Campo(3,2);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia1Direita() {
		Campo vizinho = new Campo(3,4);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoRealDistancia1EmCima() {
		Campo vizinho = new Campo(2,3);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDistancia1EmBaixo() {
		Campo vizinho = new Campo(4,3);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDistancia1Diagonal() {
		Campo vizinho = new Campo(2,2);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void testeVizinhoRealDistancia2() {
		Campo vizinho = new Campo(3,5);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
}
