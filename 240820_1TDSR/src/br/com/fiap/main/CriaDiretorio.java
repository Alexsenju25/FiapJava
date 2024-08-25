package br.com.fiap.main;

import java.io.File;

public class CriaDiretorio {
    public static void main(String[] args) {
        try {
            File dir = new File("d:/Loja");
            if(!dir.exists()){
                dir.mkdir();
            }
            dir = new File("d:/Loja/site");
            if(!dir.exists()){
                dir.mkdir();
            }
            dir = new File("d:/Loja/site/imagens");
            if(!dir.exists()){
                dir.mkdir();
            }
            dir = new File("d:/Loja/site/videos");
            if(!dir.exists()){
                dir.mkdir();
            }
            dir = new File("d:/Loja/site/sons");
            if(!dir.exists()){
                dir.mkdir();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
