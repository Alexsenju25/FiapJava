package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Pessoa {
	// atributos
	private String nome;
	private LocalDate dataNascimento;
	// construtores 
	public Pessoa() {}
	// gcuf
	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		setDataNascimento(dataNascimento);
	}
	// metodos getters & setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		try {
			LocalDate inicio = LocalDate.parse("1899-12-31"); // incluir data para dentro do "LocalDate"
			LocalDate fimDosTempos = LocalDate.now().plusDays(1); // LocalDate com dia de amanhã
			if (dataNascimento.isAfter(inicio) && 
					dataNascimento.isBefore(fimDosTempos)) {// comparar data com outra
				this.dataNascimento = dataNascimento;
			} else {
				throw new Exception("Data fora da faixa permitida");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); // encerra programa após erro 
		}
	}
	
	public int calculaIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period idade = Period.between(dataNascimento, dataAtual);
		return idade.getYears();
	}

}
