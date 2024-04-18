package br.com.fiap;

import java.time.LocalDate;

public class UsaEleitor1 {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		Eleitor eleitor = new Eleitor();
		eleitor.setNome("Alexsandro");
		eleitor.setAnoNascimento(2002);
		eleitor.setNumTitulo(544466244);
		eleitor.setZona(45);
		eleitor.setSecao(4456);
		
		System.out.println("Nome: " + eleitor.getNome()
							+ "\nAno de nascimento: " + eleitor.getAnoNascimento()
							+ "\nNumero de titulo de eleitor: " + eleitor.getNumTitulo()
							+ "\nZona: " + eleitor.getZona()
							+ "\nSeção: " + eleitor.getSecao()
							+ "\nIdade: " + eleitor.calcularIdade(anoAtual));
		

	}

}
