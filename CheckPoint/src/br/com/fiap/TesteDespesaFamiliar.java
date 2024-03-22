// Nome: Alexsandro de Macedo de Jesus RM: 557068
// Nome: Matheus de Lima Martins RM: 556572

package br.com.fiap;

import java.util.Scanner;

public class TesteDespesaFamiliar {

	public static void main(String[] args) {
		DespesaFamiliar despesa = new DespesaFamiliar();
		double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia, totalGastos;
		int numeroDeMoradores;
		
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			
			System.out.println("Digite o valor da sua renda familiar: ");
			rendaFamiliar = scan.nextDouble();
			System.out.println("Digite o número de moradores da sua casa: ");
			numeroDeMoradores = scan.nextInt();			
			System.out.println("Digite o gasto com luz: ");
			gastoComLuz = scan.nextDouble();
			System.out.println("Digite o gasto com água: ");
			gastoComAgua = scan.nextDouble();
			System.out.println("Digite o gasto com internet: ");
			gastoComInternet = scan.nextDouble();
			System.out.println("Digite o valor da mensalidade da academia: ");
			valorMensalidadeDaAcademia = scan.nextDouble();
			
			despesa.rendaFamiliar = rendaFamiliar;
			despesa.numeroDeMoradores = numeroDeMoradores;
			despesa.gastoComLuz = gastoComLuz;
			despesa.gastoComAgua = gastoComAgua;
			despesa.gastoComInternet = gastoComInternet;
			despesa.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;
			
			double restoRendaFamiliar = despesa.calcularTotalDeDespesa();
			
			totalGastos = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
			
			
			System.out.println("Renda familiar: " + despesa.rendaFamiliar
					+ "\nTotal dos gastos: " + totalGastos
					+ "\nValor da renda que sobrará: " + restoRendaFamiliar);
			
		} catch (Exception e) {
			System.out.println("Numero inválido, tente novamente.");
		}

	}

}
