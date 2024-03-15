package br.com.fiap;

public class UsarArCondionado {

	public static void main(String[] args) {
		ArCondicionado arcondionado = new ArCondicionado();
		
		arcondionado.temperatura = 19;
		arcondionado.modo = "Resfriar";
		arcondionado.aumentarTemperatura();
		arcondionado.mostrar();

	}

}
