package br.com.fiap.bean;

public class Calculadora {
    private float numero1;
    private float numero2;

    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float adicao() {
        return numero1 + numero2;
    }
    public float subtracao() {
        return numero1 - numero2;
    }
    public float multiplicacao() {
        return numero1 * numero2;
    }
    public float divisao() throws ArithmeticException{
        if (numero2 == 0){
            throw new ArithmeticException ("Numero 2 não pode ser igual a 0");
        }
        return numero1 / numero2;
    }
}
