package br.com.fiap;

import java.time.LocalDate;

public class Pessoa {
	//atributo encapsulados
	private String nome;
	private int anoNascimento;
	
	//construtores
	
	//construtor vazio (CTRL+3 -> gcfs)
	public Pessoa() {
	
	}
	//construtor com passagem de parâmetros (CTRL+3 -> gcuf)
	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	//métodos getters & setters (CTRL+3 -> ggas)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		try {
			LocalDate dataAtual = LocalDate.now();
			int anoAtual = dataAtual.getYear();
			
			if (anoNascimento >= 1900 && anoNascimento <= anoAtual ) {
				this.anoNascimento = anoNascimento;
			} else {
				throw new Exception("Valor inválido! (1900-Ano Atual)");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	
	
}
