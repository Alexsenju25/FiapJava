package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Adicao {
	// atributos
	private int numInteiro1;
	private int numInteiro2;
	private double numReal1;
	private double numReal2;
	// construtor vazio
	public Adicao() {}
	// getters & setters
	public int getNumInteiro1() {
		return numInteiro1;
	}
	public void setNumInteiro1(int numeroInteiro1) {
		this.numInteiro1 = numeroInteiro1;
	}
	public int getNumInteiro2() {
		return numInteiro2;
	}
	public void setNumInteiro2(int numeroInteiro2) {
		this.numInteiro2 = numeroInteiro2;
	}
	public double getNumReal1() {
		return numReal1;
	}
	public void setNumReal1(double numReal1) {
		this.numReal1 = numReal1;
	}
	public double getNumReal2() {
		return numReal2;
	}
	public void setNumReal2(double numReal2) {
		this.numReal2 = numReal2;
	}
	
	public void soma (int numInteiro1, int numInteiro2) {
		setNumInteiro1(numInteiro1);
		setNumInteiro2(numInteiro2);
		int soma = numInteiro1 + numInteiro2;
		JOptionPane.showMessageDialog(null, "Resultado da soma é:" + soma);
	}
	
	public void soma (double numReal1, double numReal2) {
		setNumReal1(numReal1);
		setNumReal2(numReal2);
		double soma = numReal1 + numReal2;
		JOptionPane.showMessageDialog(null, "Resultado da soma é:" + soma);
	}
	
	
}
