package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {

	public static void main(String[] args) {
		
		Pessoa p1;
		Scanner scan;
		String nome;
		int anoNascimento;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome e seu ano de nascimento ");
			//nome = scan.nextLine();
			//anoNascimento = scan.nextInt();
			
			p1 = new Pessoa(scan.nextLine(), scan.nextInt());//forma fácil de fazer
			int idade = p1.calculaIdade(2024);
			
			System.out.println("Nome: " + p1.getNome());
			System.out.println("Idade: " + idade + " anos");

			
			
		} catch (Exception e) {
			System.out.println("Nome ou Ano de Nascimento inválido(s)!");
		}

	}

}
