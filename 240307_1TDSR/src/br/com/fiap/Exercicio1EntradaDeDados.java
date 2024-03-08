package br.com.fiap;

import java.util.Scanner;

public class Exercicio1EntradaDeDados {

	public static void main(String[] args) {
		double prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o número da prova 1: ");
			
			
		} catch (Exception e) {
			System.out.println("Valor incorreto, digite algo maior que 0 e menor do que 10");
		}

	}

}
