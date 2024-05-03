package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

public class CalculaArea {
	public static void main(String[] args) {
		String aux, escolha = "sim";
		float area, lado, altura;
		int opcao;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Qual área deseja calcular?"
						+ "\n(1) Quadrado \n(2) Retângulo \n(3) Triângulo");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1:
					aux = JOptionPane.showInputDialog("Qual o valor de lado");
					lado = Float.parseFloat(aux);
					Quadrado quad = new Quadrado(lado);
					area = quad.calcularArea();
					JOptionPane.showMessageDialog(null, "Area do Quadrado: " + area);
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Qual o valor de lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Qual o valor da altura");
					altura = Float.parseFloat(aux);
					Retangulo ret = new Retangulo(lado, altura);
					area = ret.calcularArea();
					JOptionPane.showMessageDialog(null, "Area do Retangulo: " + area);
					break;
				case 3:
					aux = JOptionPane.showInputDialog("Qual o valor de lado");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Qual o valor da altura");
					altura = Float.parseFloat(aux);
					Triangulo tri = new Triangulo(lado, altura);
					area = tri.calcularArea();
					JOptionPane.showMessageDialog(null, "Area do Triangulo: " + area);
					break;
				default:
					throw new Exception("Escolha incorreta");
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar? ");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		JOptionPane.showMessageDialog(null, "Fim de programa");
	}
	
	
}
