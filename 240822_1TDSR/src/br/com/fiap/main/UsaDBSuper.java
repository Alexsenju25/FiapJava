package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class UsaDBSuper {
    public static void main(String[] args) {
        String aux, nome, kI, tecnicas, velocidade, transformacoes, path;
        int opcao;
        DragonBallSuper dbs;
        do {
            try {
                aux = JOptionPane.showInputDialog("""
                        Escolha
                        1.Cadastrar
                        2.Consultar""");
                opcao = Integer.parseInt(aux);
                path = JOptionPane.showInputDialog("Digite o caminho da pasta");
                dbs = new DragonBallSuper();
                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o nome");
                        kI = JOptionPane.showInputDialog("Digite o KI");
                        tecnicas = JOptionPane.showInputDialog("Digite as técnicas");
                        velocidade = JOptionPane.showInputDialog("Digite a velocidade");
                        transformacoes = JOptionPane.showInputDialog("Digite as transformações");
                        dbs.setNome(nome);
                        dbs.setkI(kI);
                        dbs.setTecnicas(tecnicas);
                        dbs.setVelocidade(velocidade);
                        dbs.setTransformacoes(transformacoes);
                        JOptionPane.showMessageDialog(null, dbs.gravar(path));
                    case 2:
                        nome = JOptionPane.showInputDialog("Digite o nome");
                        dbs.setNome(nome);
                        dbs = dbs.ler(path);
                        if (dbs == null){
                            JOptionPane.showMessageDialog(null, "Caminho não encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Exibindo Dados"
                                    + "\nCaminho:" + path
                                    + "\nNome: " + dbs.getNome()
                                    + "\nKI: " + dbs.getkI()
                                    + "\nTécnicas: " + dbs.getTecnicas()
                                    + "\nVelocidade: " + dbs.getVelocidade()
                                    + "\nTransformações: " + dbs.getTransformacoes());
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha incorreta");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de Convensão!\n " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Acessar o Arquivo " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}
