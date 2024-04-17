package br.com.fiap;

public class Televisor {
	private int volume;
	private int canal;
	public Televisor() { // construtor vazio
		
	}
	public Televisor(int volume, int canal) { // construtor com parâmetros
		setVolume(volume);
		setCanal(canal);
	}
	public int getVolume() { 
		return volume;
	}
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 10) {
				this.volume = volume;				
			} else {
				throw new Exception("Volume fora da faixa permitida (0-10)");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		try {
			if (canal == 2 || canal == 4 || canal == 5 || canal == 13) {
				this.canal = canal;
			} else {
				this.canal = 2;
				throw new Exception("Canal inválido (2-4-5-13)");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void aumentarVolume() {
		if (volume < 10) {
			volume++;			
		}
	}
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	
	
	

}
