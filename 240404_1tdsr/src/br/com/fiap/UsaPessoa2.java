package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {

	public static void main(String[] args) {

		Pessoa pessoa2 = new Pessoa();
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.print("Digite seu nome: ");
			pessoa2.setNome(scan.next());
			System.out.println("Digite o ano de nascimento: ");
			pessoa2.setAnoNascimento(scan.nextInt());
			int idade = pessoa2.calcularIdade(2024);
			
			System.out.println("Nome: " + pessoa2.getNome());
			System.out.println("Ano de NAscimento: " + pessoa2.getAnoNascimento());
			System.out.println("Idade: " + idade + " anos");

		} catch (Exception e) {
			System.out.println("Algo deu errado");
		}

	}

}
