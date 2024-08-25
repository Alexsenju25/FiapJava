package br.com.fiap.bean;
/**
 * Classe para objetos do tipo ContaPoupanca
 * @author Alexsandro Macedo
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {
	
	
	// atributos
	private int numConta;
	private float saldo;
	// construtor vazio
	public ContaPoupanca() {}
	
	public int getNumConta() {
		return numConta;
	}
	// métodos getters e setters
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	// métodos da classe
	/**
	 * Método sacar que permite sacar o valor informado.
	 * Valor a ser sacado não pode ser superior ao valor do saldo.
	 * @author Alexsandro Macedo
	 * @param float valor -  valor indicado a ser sacado
	 * @return float saldo - saldo acrescentado do valor
	 */
	public float sacar(float valor) {
		try {
			if (valor <= saldo) {
				saldo -= valor;
			} else {
				throw new Exception("Saldo insuficiente");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return saldo;
	}
	/**
	 * Método depositar que permite depositar o valor informado.
	 * @author Alexsandro Macedo
	 * @param float valor - valor indicado para ser depositado
	 * @return float saldo - valor do saldo (atualizado)
	 */
	public float depositar(float valor) {
		return saldo += valor;
	}

}
