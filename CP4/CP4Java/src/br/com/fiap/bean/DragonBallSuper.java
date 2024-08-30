// Alexsandro de Macedo de Jesus RM: 557068
package br.com.fiap.bean;

import java.io.*;
/**
 *     @Autor Alexsandro de Macedo de Jesus
 *     @Version 1.0
 *     Esta classe faz uma leitura e gravação de arquivos de texto
 */

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
    /**
     * @Autor Alexsandro de Macedo de Jesus
     * @params path String - caminho do arquivo
     * @return String - mensagem de sucesso ou falha
     * @throws IOException - exceção de entrada e saída
     * Este método faz a leitura de um arquivo de texto
     */
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
    /**
     * @Autor Alexsandro de Macedo de Jesus
     * @params path String - caminho do arquivo
     * @return String - mensagem de sucesso ou falha
     * Este método faz a gravação de um arquivo de texto
     */
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
