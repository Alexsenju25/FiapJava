package br.com.fiap;

import java.util.Scanner;

public class TesteArCondicionadoEncapsulado {

	public static void main(String[] args) {
		
		ArCondicionadoEncapsulado ac = new ArCondicionadoEncapsulado();
		Scanner scan;
		int escolha = 0;
		try {
			scan = new Scanner(System.in);
			System.out.println("Escolha um modo");
			ac.setModo(scan.next());
			System.out.println("Escolha uma tempetura");
			ac.setTemperatura(scan.nextInt());
			System.out.println("Faça sua escolha: "
					+ "\n(1) Mudar modo"
					+ "\n(2) Aumentar temperatura"
					+ "\n(3) Diminuir temperatura");
			escolha = scan.nextInt();
			if (escolha == 1) {
				ac.trocarModo(scan.next());
			} else if (escolha == 2){
				ac.aumentarTemperatura();
			} else if (escolha == 3){
				ac.diminuirTemperatura();
			} else {
				System.out.println("Formato incorreto");				
			}
			ac.mostrar();
			
		} catch (Exception e) {
			System.out.println("Formato incorreto");
		}
	}

}
