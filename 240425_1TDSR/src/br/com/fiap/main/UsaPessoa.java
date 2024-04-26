package br.com.fiap.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Pessoa;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa p1;
		String aux, nome, dataNasc;
		LocalDate minhaData;
		try {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			aux = JOptionPane.showInputDialog("Digite data de nascimento");
			
			// 0 1 2 3 4 5 6 7 8 9
			// d d / M M / y y y y
			// usando método substring para alterar data em exibição brasileira para americano
			
			dataNasc = aux.substring(6, 10);
			dataNasc += "-" + aux.substring(3, 5);
			dataNasc += "-" + aux.substring(0, 2);
			minhaData = LocalDate.parse(dataNasc);
			p1 = new Pessoa(nome, minhaData);
			
			JOptionPane.showMessageDialog(null, p1.getDataNascimento());
			
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			// minhaData = LocalDate.parse(aux, dft); outro jeito de formatar data
			
			JOptionPane.showMessageDialog(null, "Dados pessoais:"
					+ "\nNome: " + p1.getNome()
					+ "\nData de Nascimento: " + p1.getDataNascimento().format(dft)
					+ "\nIdade: " + p1.calculaIdade() + " anos");
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
