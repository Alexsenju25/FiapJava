package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class SuperHeroi {
    private String nome;
    private String isSecreta;
    private ArrayList<String> poderes;
    private ArrayList<String> fraquezas;

    public SuperHeroi() {
    }

    public SuperHeroi(String nome, String isSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
        this.nome = nome;
        this.isSecreta = isSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsSecreta() {
        return isSecreta;
    }

    public void setIsSecreta(String isSecreta) {
        this.isSecreta = isSecreta;
    }

    public ArrayList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<String> poderes) {
        this.poderes = poderes;
    }

    public ArrayList<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(ArrayList<String> fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void listaHeroi() {
        String exibe = "Nome do Super-Herói: " + nome + "\nIdentidade Secreta: " + isSecreta;
        exibe += "\nPoderes: ";
        int cont = 1;
        Collections.sort(poderes);
        for (String i : poderes) {
            exibe += "\nPoder"+ cont + ":" + i;
            cont++;
        }
        Collections.sort(fraquezas);
        for (String i : fraquezas) {
            exibe += "\nFraqueza" + cont + ":" + i;
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
}
