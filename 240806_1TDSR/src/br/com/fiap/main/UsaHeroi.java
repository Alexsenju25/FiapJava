package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class UsaHeroi {
    public static void main(String[] args) {
        SuperHeroi heroi;
        String aux, nome, idSecreta, escolha = "sim";
        String[] poderes, fraquezas;
        int qdte;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                nome = JOptionPane.showInputDialog("Digite nome do heroi");
                idSecreta = JOptionPane.showInputDialog("Identidade secreta: ");
                aux = JOptionPane.showInputDialog("Quantidade de poderes?");
                qdte = Integer.parseInt(aux);
                poderes = new String[qdte];
                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog("Poder " + (i + 1) + ": ");
                }
                aux = JOptionPane.showInputDialog("Quantidade de fraquezas?");
                qdte = Integer.parseInt(aux);
                fraquezas = new String[qdte];
                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog("Fraqueza " + (i + 1) + ": ");
                }
                heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                heroi.listaHeroi();
                escolha = JOptionPane.showInputDialog(null, "Você deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do programa. Até breve!");
    }
}
