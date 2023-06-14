package laCasaDeLosPanales;

public class Panel {

	private int cantCeldas;
	private int tamañoCeldas;
	private int energia;
	private Electrodomestico electrodomestico;
	
	public Panel(int cantCeldas, int tamañoCeldas ) {
		this.cantCeldas = cantCeldas;
		this.tamañoCeldas = tamañoCeldas;
	}
	
	//METODOS
	public int energiaPanel() {
		return cantCeldas*energia;
	}
	
	public int consumoElectro() {
		return this.electrodomestico.Consumo();
		}
	
	public int getCantCeldas() {
		return cantCeldas;
	}
	public void setCantCeldas(int cantCeldas) {
		this.cantCeldas = cantCeldas;
	}
	public int getTamañoCeldas() {
		return tamañoCeldas;
	}
	public void setTamañoCeldas(int tamañoCeldas) {
		this.tamañoCeldas = tamañoCeldas;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
}