package br.com.fiap;

import javax.swing.JOptionPane;

public class TesteFolhaDePagamentoJOption {
	
	public static void main(String[] args) {
		FolhaDePagamento folha = new FolhaDePagamento();
		double salarioBruto, descontoINSS, valorPlanoDeSaude, salarioLiquido;
		int numeroDeDependentes;
		String aux;
		
		try {
			//lendo informações digitadas pelo usuário
			aux = JOptionPane.showInputDialog("Digite o valor do salário bruto");
			salarioBruto = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite o numero de depedentes: ");
			numeroDeDependentes = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o desconto de INSS: ");
			descontoINSS = Double.parseDouble(aux);
			aux = JOptionPane.showInputDialog("Digite o valor do plano de saúde: ");
			valorPlanoDeSaude = Double.parseDouble(aux);
			
			//atribuindo valores ao objetos de classe
			folha.salarioBruto = salarioBruto;
			folha.numeroDeDependentes = numeroDeDependentes;
			folha.descontoINSS = descontoINSS;
			folha.valorPlanoDeSaude = valorPlanoDeSaude;
			
			salarioLiquido = folha.calcularSalarioLiquido();
			
			//exibir os valores e resultado
			JOptionPane.showMessageDialog(null, "Salário Bruto: " + folha.salarioBruto
					+ "\nNúmero de dependentes: " + folha.numeroDeDependentes
					+ "\nDesconto de INSS: " + folha.numeroDeDependentes
					+ "\nValor do plano de saúde: " + folha.valorPlanoDeSaude
					+ "\nSalário Líquido: " + salarioLiquido);
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}
		
		
		
	}

}
