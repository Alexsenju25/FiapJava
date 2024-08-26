package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;

public class UsaEquipe {

    public static void main(String[] args) {
        Equipe grupo;
        String aux, nome, escolha = "sim";
        String[] integrantes;
        int qdte;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                nome = JOptionPane.showInputDialog("Digite nome da equipe");
                aux = JOptionPane.showInputDialog("Quantidade de integrantes?");
                qdte = Integer.parseInt(aux);
                integrantes = new String[qdte];
                for (int i = 0; i < integrantes.length; i++) {
                    integrantes[i] = JOptionPane.showInputDialog("Integrante " + (i + 1) + ": ");
                }
                grupo = new Equipe(integrantes, nome);
                grupo.listaEquipe();
                escolha = JOptionPane.showInputDialog(null, "Você deseja continuar?");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do programa. Até breve!");
    }
}
