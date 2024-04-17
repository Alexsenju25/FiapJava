package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaTelevisor {

	public static void main(String[] args) {
		Televisor televisor1;
		String aux;
		int volume, canal, escolha;

		try {
			aux = JOptionPane.showInputDialog("Escolha o volume");
			volume = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Escolha um canal");
			canal = Integer.parseInt(aux);

			televisor1 = new Televisor(volume, canal);

			JOptionPane.showMessageDialog(null,"Volume: " + televisor1.getVolume()
					+ "\nCanal: " + televisor1.getCanal());

			aux = JOptionPane.showInputDialog("Escolha uma opção:" 
					+ "\n(1) Aumentar volume"
					+ "\n(2) Diminuir volume"
					+ "\n(3) Trocar canal");
			escolha = Integer.parseInt(aux);
			
			switch (escolha) {
			case 1:
				televisor1.aumentarVolume();				
				break;
			case 2:
				televisor1.diminuirVolume();
				break;
			case 3:
				aux = JOptionPane.showInputDialog("Ecolha uma estação");
				canal = Integer.parseInt(aux);
				televisor1.setCanal(canal);
				break;
			default:	
			}
			
			JOptionPane.showMessageDialog(null,"Volume: " + televisor1.getVolume()
			+ "\nCanal: " + televisor1.getCanal());


		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
