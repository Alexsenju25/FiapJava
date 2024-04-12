package br.com.fiap;

import java.time.LocalDate;
import java.util.Scanner;

public class UsaEleitor2 {

	public static void main(String[] args) {
		
		String nome;
		int anoNascimento;
		int numTitulo;
		int zona;
		int secao;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			LocalDate dataAtual = LocalDate.now();
			int anoAtual = dataAtual.getYear();
			
			System.out.println("Digite seu nome: ");
			nome = scan.nextLine();
			System.out.println("Digite o ano de nascimento: ");
			anoNascimento = scan.nextInt();
			System.out.println("Digite o número de titulo de eleitor: ");
			numTitulo = scan.nextInt();
			System.out.println("Digite o número da zona: ");
			zona = scan.nextInt();
			System.out.println("Digite a seção: ");
			secao = scan.nextInt();
			
			Eleitor eleitor = new Eleitor();
			eleitor.setNome(nome);
			eleitor.setAnoNascimento(anoNascimento);
			eleitor.setNumTitulo(numTitulo);
			eleitor.setZona(zona);
			eleitor.setSecao(secao);
			
			System.out.println("Nome: " + eleitor.getNome()
			+ "\nAno de nascimento: " + eleitor.getAnoNascimento()
			+ "\nNumero de titulo de eleitor: " + eleitor.getNumTitulo()
			+ "\nZona: " + eleitor.getZona()
			+ "\nSeção: " + eleitor.getSecao()
			+ "\nIdade: " + eleitor.calcularIdade(anoAtual));

			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
