package br.com.fiap.bean;

public class Quadrado {
	// atributo
	private float lado;
	// construtor vazio
	public Quadrado() {}
	// construtor com parâmetros
	public Quadrado(float lado) {
		this.lado = lado;
	}
	// métodos getters & setters
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	// métodos da classe
	public float calcularArea() {
		return lado * lado;
	}
	
}
