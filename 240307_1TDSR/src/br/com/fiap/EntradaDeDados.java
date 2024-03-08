package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner scan; //declaração de um obj da classe
		try {
			scan = new Scanner(System.in); //instanciação
			System.out.println("Digite 2 números inteiros");
			num1 = scan.nextInt(); //onde está acontecendo a leitura do valor
			num2 = scan.nextInt();
			System.out.println("Valor 1: " + num1 + "\nValor 2: " 
					+ num2 + "\nSomatória: " + (num1 + num2));
		} catch (Exception e) {
			System.out.println("Formato de número incorreto, o formato de número é um inteiro");
		}
		
		

	}

}
