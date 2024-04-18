package br.com.fiap;

public class TesteFolha {

	public static void main(String[] args) {
		
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.salarioBruto = 80000;
		folha.numeroDeDependentes = 9;
		folha.descontoINSS = 25;
		folha.valorPlanoDeSaude = 700;
		
		double salarioLiquido = folha.calcularSalarioLiquido(); //Jogar para uma variável, uma boa prática.
		
		System.out.println("Salário: " + salarioLiquido);
	}

}
