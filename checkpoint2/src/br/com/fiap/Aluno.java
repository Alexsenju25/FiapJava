//Nome: Alexsandro de Macedo de Jesus RM: 557068

package br.com.fiap;

import java.time.LocalDate;

public class Aluno {
	private int rm;
	private String nome;
	private int anoNascimento;
	// construtores (CTRL+3 -> vazio->gcfs | parâmetros->gcuf)
	public Aluno() {
		
	}
	public Aluno(int rm, String nome, int anoNascimento) {
		setRm(rm);
		this.nome = nome;
		setAnoNascimento(anoNascimento);
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		try {
			if (rm >= 87001 && rm <= 559500) {
				this.rm = rm;
			} else {
				throw new Exception("Rm inválido");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
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
			
			if (anoNascimento >= 1900 && anoNascimento <= anoAtual) {
				this.anoNascimento = anoNascimento;
			} else {
				throw new Exception("Valor inválido! (1900-Ano Atual)");
			}
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
		}
		
	}
	
	public int calcularIdade (int anoAtual) {
		return anoAtual - anoNascimento;		
	}
	
	
}
