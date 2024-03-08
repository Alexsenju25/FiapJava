package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1ComJanela {
	
	public static void main(String[] args) {
		double prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
		String leitura;
		
		try {
			leitura = JOptionPane.showInputDialog("Digite um número inteiro: ");
			prova1 = Integer.parseInt(leitura);
			
			leitura = JOptionPane.showInputDialog("Digite um número inteiro: ");
			prova2 = Integer.parseInt(leitura);
			
			leitura = JOptionPane.showInputDialog("Digite um número inteiro: ");
			prova3 = Integer.parseInt(leitura);
			
			leitura = JOptionPane.showInputDialog("Digite um número inteiro: ");
			prova4 = Integer.parseInt(leitura);
			
			JOptionPane.showMessageDialog(null, "A média é: " + ((prova1 + prova2 + prova3 + prova4)/4));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}
		
	}

}
