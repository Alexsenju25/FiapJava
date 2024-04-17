package br.com.fiap;

import javax.swing.JOptionPane;

// arrumar indentação (CTRL + SHIFT + f)

public class UsaRadio {

	public static void main(String[] args) {
		Radio radio1; // declarando classe
		String aux; // variável para guardar string do JOptionPane
		float estacao;
		int volume, escolha;
		try {
			aux = JOptionPane.showInputDialog("Escolha o volume"); // showInputDialog para ler texto do usuário
			volume = Integer.parseInt(aux); // Integer.parseInt transforma a String em Int
			aux = JOptionPane.showInputDialog("Escolha a estação");
			estacao = Float.parseFloat(aux);
			
			radio1 = new Radio(volume, estacao); // instanciando classe
			
			JOptionPane.showMessageDialog(null, "Estação: " + radio1.getEstacao()
					+ "\nVolume: " + radio1.getVolume());
			
			aux = JOptionPane.showInputDialog("Escolha uma opção:"
					+ "\n(1) Aumentar volume"
					+ "\n(2) Diminuir volume"
					+ "\n(3) Trocar estação");
			escolha = Integer.parseInt(aux);
			
			switch (escolha) {
			case 1:
				radio1.aumentarVolume();			
				break;
			case 2:
				radio1.diminuirVolume();
				break;
			case 3:
				aux = JOptionPane.showInputDialog("Escolha nova estação");
				estacao = Float.parseFloat(aux);
				radio1.setEstacao(estacao);
				break;
			default:
				throw new Exception("Opção inválida (1-3)");
			}
			
			JOptionPane.showMessageDialog(null, "Estação: " + radio1.getEstacao()
			+ "\nVolume: " + radio1.getVolume());
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		

	}

}
