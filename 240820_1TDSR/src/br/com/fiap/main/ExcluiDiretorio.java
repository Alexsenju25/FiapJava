package br.com.fiap.main;

import java.io.File;

public class ExcluiDiretorio {
    public static void main(String[] args) {
        try {
            File dir = new File("d:/Loja");
            String msg = "";
            if (dir.isDirectory()) {
                if (dir.delete()) {
                    msg = dir.getName() + " excluido com sucesso!";
                } else {
                    if (excluirFilhos(dir)) {
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

    private static boolean excluirFilhos(File dir) {
        if (dir.isDirectory()) {
            String[] conteudo = dir.list();
            for (String item : conteudo) {
                boolean sucesso = excluirFilhos(new File(dir, item));
                if (sucesso){
                    System.out.println("Excluido: " + item);
                } else {
                    System.out.println("Falha ao excluir: " + item);
                    return false;
                }
            }
        }
        return dir.delete();
    }
}
