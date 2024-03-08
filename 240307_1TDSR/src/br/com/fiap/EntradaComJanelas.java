package br.com.fiap;

import javax.swing.JOptionPane;

public class EntradaComJanelas {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		String auxiliar;
		try {
			auxiliar = JOptionPane.showInputDialog("Digite um número inteiro: ");
			num1 = Integer.parseInt(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite outro número inteiro");
			num2 = Integer.parseInt(auxiliar);
			JOptionPane.showMessageDialog(null, "Valor 1: " + num1
					+ "\nValor 2: " + num2 + "\nSomatória: " + (num1+num2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto");
		}

	}

}
