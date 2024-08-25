// Nome: Alexsandro de Macedo de Jesus RM: 557068
// Nome: Matheus de Lima Martins RM: 556572

package br.com.fiap;

public class DespesaFamiliar {
	
	public double rendaFamiliar;
	public int numeroDeMoradores;
	public double gastoComLuz;
	public double gastoComAgua;
	public double gastoComInternet;
	public double valorMensalidadeDaAcademia;
	
	public double calcularTotalDeDespesa() {
		
		double restoRendaFamiliar, gastoTotalAcademia;
		
		gastoTotalAcademia = valorMensalidadeDaAcademia * numeroDeMoradores;
		restoRendaFamiliar = rendaFamiliar - (gastoComLuz + gastoComAgua + gastoComInternet + gastoTotalAcademia);
		return restoRendaFamiliar;
		
	}
	

}
