package br.com.fiap;

public class UsarTelevisor {
	public static void main(String[] args) {
		
		Televisor tv= new Televisor();
		tv.volume = 5;
		tv.canal = 10;
		tv.aumentarVolume();
		tv.trocarCanal(11);
		tv.mostrar();
		tv.trocarCanal(9);
		tv.diminuirVolume();
		tv.mostrar();
		
	
	}
}
