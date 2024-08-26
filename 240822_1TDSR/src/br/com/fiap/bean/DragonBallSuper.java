package br.com.fiap.bean;

import java.io.*;

public class DragonBallSuper implements IDBSuper {
    private String nome;
    private String kI;
    private String tecnicas;
    private String velocidade;
    private String transformacoes;

    public DragonBallSuper() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getkI() {
        return kI;
    }

    public void setkI(String kI) {
        this.kI = kI;
    }

    public String getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getTransformacoes() {
        return transformacoes;
    }

    public void setTransformacoes(String transformacoes) {
        this.transformacoes = transformacoes;
    }

    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + "/" +
                nome + ".txt"));
        nome = br.readLine();
        kI = br.readLine();
        tecnicas = br.readLine();
        velocidade = br.readLine();
        transformacoes = br.readLine();
        br.close();
        return this;
    }
    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()){
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
            pw.println(nome);
            pw.println(kI);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(transformacoes);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso!";
        } catch (IOException e){
            return "Falha ao gravar o arquivo!\n" + e.getMessage();
        }
    }
}
