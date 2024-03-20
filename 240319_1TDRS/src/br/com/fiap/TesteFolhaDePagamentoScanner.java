package br.com.fiap;

import java.util.Scanner;

public class TesteFolhaDePagamentoScanner {

	public static void main(String[] args) {
		
		FolhaDePagamento folha = new FolhaDePagamento();
		Scanner scan;
		
		double salarioBruto, descontoINSS, valorPlanoDeSaude;
		int numeroDeDependentes;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do salário: ");
			salarioBruto = scan.nextDouble();
			System.out.println("Digite o numero de depedentes: ");
			numeroDeDependentes = scan.nextInt();
			System.out.println("Digite o desconto de INSS: ");
			descontoINSS = scan.nextDouble();
			System.out.println("Digite o valor do plano de saúde: ");
			valorPlanoDeSaude = scan.nextDouble();
			
			double salarioLiquido = folha.calcularSalarioLiquido();
			
			folha.salarioBruto = salarioBruto;
			folha.numeroDeDependentes = numeroDeDependentes;
			folha.descontoINSS = descontoINSS;
			folha.valorPlanoDeSaude = valorPlanoDeSaude;
			
			System.out.println("Salário Bruto: " + folha.salarioBruto
					+ "\nNúmero de dependentes: " + folha.numeroDeDependentes
					+ "\nDesconto de INSS: " + folha.numeroDeDependentes
					+ "\nValor do plano de saúde: " + folha.valorPlanoDeSaude
					+ "\nSalário Líquido: " + salarioLiquido);
			
		} catch (Exception e) {
			System.out.println("Numero inválido, tente novamente.");
		}

	}

}
