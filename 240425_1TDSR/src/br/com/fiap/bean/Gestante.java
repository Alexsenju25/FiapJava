package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Gestante {
	
	private String nome;
	private LocalDate dataDaGestacao;
	
	public Gestante() {}
	
	public Gestante(String nome, LocalDate dataDaGestacao) {
		this.nome = nome;
		this.dataDaGestacao = dataDaGestacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDaGestacao() {
		return dataDaGestacao;
	}

	public void setDataDaGestacao(LocalDate dataDaGestacao) {
		try {
			LocalDate inicio = LocalDate.now().minusMonths(9); // incluir data com 9 meses atras
			LocalDate fim = LocalDate.now().plusDays(1); // incluir data para dentro do "LocalDate"
		
			if (dataDaGestacao.isAfter(inicio) && 
					dataDaGestacao.isBefore(fim)) {// comparar data com outra
				this.dataDaGestacao = dataDaGestacao;
			} else {
				throw new Exception("Data fora da faixa permitida");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); // encerra programa após erro 
		}
		
	}
	
	public int tempoDeGestacao() {
		LocalDate dataAtual = LocalDate.now();
		Period tempoGestacao = Period.between(dataDaGestacao, dataAtual);
		return tempoGestacao.getMonths();
	}
	

}
