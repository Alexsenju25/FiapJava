package br.com.fiap;

public class ArCondicionadoEncapsulado {
	
	private int temperatura;
	private String modo;
	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		try {
			if (temperatura >= 15 && temperatura <= 26) {
				this.temperatura = temperatura;
			} else {
				this.temperatura = 15;
				throw new Exception("Temperatura inválida (15-26°)");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getModo() {
		return modo;
	}
	public void setModo(String modo) {
		try {
			if (modo.equals("Ventilar") || modo.equals("Aquecer")
					|| modo.equals("Resfriar")) {
				this.modo = modo;
			} else {
				throw new Exception("Modo inálido! "
						+ "(Ventilar, Aquecer ou Resfriar");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void aumentarTemperatura() {
		if (temperatura < 26) {
			temperatura++;
		}
	}
	public void diminuirTemperatura() {
		if (temperatura > 15) {
			temperatura--;
		}
	}
	public void trocarModo(String modo) {
		setModo(modo);
	}
	public void mostrar() {
		System.out.println("Temperatura: " + temperatura
				+ "\nModo: " + modo);
	}
}
