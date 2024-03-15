package br.com.fiap;

public class UsarFolhaDePagamento {
	public static void main(String[] args) {
		
		FolhaDePagamento folha = new FolhaDePagamento();
		
		folha.salarioBruto = 1500;
		folha.valorPlanoDeSaude = 100;
		folha.numeroDeDependentes = 2;
		folha.descontoINSS = 10;
		
		System.out.println("Com os descontos da sua folha de pagamento o seu salário é: R$" + folha.calcularSalarioLiquido());
		
	}

}
