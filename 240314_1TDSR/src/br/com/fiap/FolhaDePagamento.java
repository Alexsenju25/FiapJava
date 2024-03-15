package br.com.fiap;

public class FolhaDePagamento {
	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;
	
	public double calcularSalarioLiquido() {
		
		double calculoDescontoINSS = (descontoINSS / 100) * salarioBruto;
		
		double descontoPlanoDeSaude = valorPlanoDeSaude * (numeroDeDependentes + 1);
		
		double salarioLiquido = salarioBruto - ( calculoDescontoINSS + descontoPlanoDeSaude);
		
		return salarioLiquido;
		
		
	}
	
		

}
