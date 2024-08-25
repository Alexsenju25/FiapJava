package br.com.fiap.bean;

import java.io.File;

public class Diretorio {
    private File dir;

    public Diretorio() {
    }

    public File getDir() {
        return dir;
    }

    public void setDir(File dir) {
        this.dir = dir;
    }

    public boolean criaDiretorio(String path) {
        try {
            dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void listaDiretorio(String path) {
        try {
            dir = new File(path);
            if (dir.isDirectory()) {
                System.out.println("Conteúdo da pasta: " + path);
                String[] lista = dir.list();
                if (lista != null) {
                    for (String item : lista) {
                        System.out.println(item);
                    }
                }
            } else {
                System.out.println("Caminho informado incorreto!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void excluiDiretorio(String path) {
        try {
            dir = new File(path);
            String msg = "";
            if (dir.isDirectory()) {
                if (dir.delete()) {
                    msg = dir.getName() + " excluido com sucesso!";
                } else {
                    if (excluiDiretorio(dir)) {
                        msg = dir.getName() + " excluido com sucesso!";
                    } else {
                        msg = "Falha ao excluir a pasta: " + dir.getName();
                    }
                }
                System.out.println(msg);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
