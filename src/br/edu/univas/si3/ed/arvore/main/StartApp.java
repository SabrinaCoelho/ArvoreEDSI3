package br.edu.univas.si3.ed.arvore.main;

import br.edu.univas.si3.ed.arvore.model.ArvoreBinariaV1;
import br.edu.univas.si3.ed.arvore.model.Entidade;
import br.edu.univas.si3.ed.arvore.model.No;

public class StartApp {
public static void main(String[] args) {
		
		//árvore vazia
		ArvoreBinariaV1 arvore = new ArvoreBinariaV1();
		System.out.println("Teste 01");
		arvore.imprimir();

		//Cria o nó B
		Entidade entidadeB = new Entidade("B");
		No noB = arvore.criarNovoNo(entidadeB);
		//
		Entidade entidadeD = new Entidade("D");
		No noD = arvore.criarNovoNo(entidadeD);
		arvore.criarSubArvore(entidadeB, null, noD);
		
		arvore.imprimirPreOrdem(noB, "BD");
		//
		//Cria o nó C
		Entidade entidadeC = new Entidade("C");
		No noC = arvore.criarNovoNo(entidadeC);
		//
		Entidade entidadeE = new Entidade("E");
		No noE = arvore.criarNovoNo(entidadeE);
		
		Entidade entidadeF = new Entidade("F");
		No noF = arvore.criarNovoNo(entidadeF);
		
		arvore.criarSubArvore(entidadeC, noE, noF);
		//
		
		//Cria o nó A
		Entidade entidadeA = new Entidade("A");
		arvore.criarRaiz(entidadeA, noB, noC);
		System.out.println("Teste 02");
		arvore.imprimir();
		
//		Entidade entidadeD = new Entidade("D");
//		No noD = arvore.criarNovoNo(entidadeD);
		
		//arvore.criarSubArvore(entidadeD, null, null);
		//arvore.criarSubArvore(entidadeB, null, noD);
//		System.out.println("Teste xuxa");
//		Entidade xuxa = new Entidade("X");
//		No noX = arvore.criarNovoNo(xuxa);
//		arvore.imprimirPreOrdem(noX, "*");
	}
}
