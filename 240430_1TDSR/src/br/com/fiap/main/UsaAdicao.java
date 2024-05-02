package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Adicao;

public class UsaAdicao {

	public static void main(String[] args) {
		Adicao adicao = new Adicao();	
		String aux, escolha = "sim";
		int opcao, numInteiro1, numInteiro2;
		double numReal1, numReal2;
		try {
			while (escolha.equalsIgnoreCase("sim")) { // equalIgnoreCase, ela ignora maiuscula e minuscula
				try {
					aux = JOptionPane.showInputDialog("Adição com número real ou inteiro?"
							+ "\n(1) Inteiro"
							+ "\n(2) Real");
					
							
					opcao = Integer.parseInt(aux);
					switch (opcao) {
					case 1:
						aux = JOptionPane.showInputDialog("Digite primeiro valor");
						numInteiro1 = Integer.parseInt(aux);
						aux = JOptionPane.showInputDialog("Digite primeiro valor");
						numInteiro2 = Integer.parseInt(aux);
						adicao.soma(numInteiro1, numInteiro2);
						break;
					case 2:
						aux = JOptionPane.showInputDialog("Digite primeiro valor");
						numReal1 = Double.parseDouble(aux);
						aux = JOptionPane.showInputDialog("Digite primeiro valor");
						numReal2 = Double.parseDouble(aux);
						adicao.soma(numReal1, numReal2);
						break;
					default:
						throw new Exception("Escolha incorreta");
					}
					escolha = JOptionPane.showInputDialog("Deseja continuar? (sim ou não)");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
