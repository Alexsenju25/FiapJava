//Nome: Alexsandro de Macedo de Jesus RM: 557068

package br.com.fiap;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class UsaAluno {
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		String aux, nome;
		int rm, anoNascimento;
		
		try {
			Aluno aluno1 = new Aluno();
			aluno1.setRm(557068);
			aluno1.setNome("Alexsandro");
			aluno1.setAnoNascimento(2002);
			
			aluno1.calcularIdade(anoAtual);
			
			JOptionPane.showMessageDialog(null, "Nome: " + aluno1.getNome()
			+ "\nRM: " + aluno1.getRm()
			+ "\nIdade: " + aluno1.calcularIdade(anoAtual));
			
			Aluno aluno3 = new Aluno();
			aluno3.setRm(151545);
			aluno3.setNome("Felipe");
			aluno3.setAnoNascimento(2002);
			
			aluno3.calcularIdade(anoAtual);
			
			JOptionPane.showMessageDialog(null, "Nome: " + aluno3.getNome()
			+ "\nRM: " + aluno3.getRm()
			+ "\nIdade: " + aluno3.calcularIdade(anoAtual));
			
			
			aux = JOptionPane.showInputDialog("Qual o seu RM?");
			rm = Integer.parseInt(aux);
			nome = JOptionPane.showInputDialog("Qual o seu nome?");
			aux = JOptionPane.showInputDialog("Qual o seu ano de nascimento?");
			anoNascimento = Integer.parseInt(aux);
			
			Aluno aluno2 = new Aluno(rm, nome, anoNascimento);
	
			JOptionPane.showMessageDialog(null, "Nome: " + aluno2.getNome()
					+ "\nRM: " + aluno2.getRm()
					+ "\nIdade: " + aluno2.calcularIdade(anoAtual));
			
			aux = JOptionPane.showInputDialog("Qual o seu RM?");
			rm = Integer.parseInt(aux);
			nome = JOptionPane.showInputDialog("Qual o seu nome?");
			aux = JOptionPane.showInputDialog("Qual o seu ano de nascimento?");
			anoNascimento = Integer.parseInt(aux);
			
			Aluno aluno4 = new Aluno(rm, nome, anoNascimento);
	
			JOptionPane.showMessageDialog(null, "Nome: " + aluno4.getNome()
					+ "\nRM: " + aluno4.getRm()
					+ "\nIdade: " + aluno4.calcularIdade(anoAtual));
			
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
		}
		
	}

}
