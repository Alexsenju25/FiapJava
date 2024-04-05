package br.com.fiap;

public class UsaPessoa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Alex");
		pessoa1.setAnoNascimento(1990);
		int idade = pessoa1.calcularIdade(2024);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Ano de NAscimento: " + pessoa1.getAnoNascimento());
		System.out.println("Idade: " + idade + " anos");		

	}

}
