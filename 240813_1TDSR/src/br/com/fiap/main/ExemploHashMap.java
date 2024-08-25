package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();
        do {
            try {
                String nome, tipo;
                do {
                    nome = JOptionPane.showInputDialog("Digite o nome de um Pokemon ou digite \"FIM\" para encerrar").toUpperCase();
                    if (!nome.equals("FIM")) {
                        tipo = JOptionPane.showInputDialog("Digite o tipo do Pokemon informado anteriormente.");
                        if (mapa.containsKey(nome)) { // Método que procura chave no obj
                            JOptionPane.showMessageDialog(null, "Este Pokemon já foi cadastrado!");
                        } else {
                            mapa.put(nome, tipo);
                        }
                    }
                } while (!nome.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite o tipo de um Pokemon a sua escolha").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "Os tipos de Pokemon com este elemento é:" + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de Pokemon não cadastrado!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}
