package laCasaDeLosPanales;

public class Panel {

	private int cantCeldas;
	private int tamaņoCeldas;
	private int energia;
	private Electrodomestico electrodomestico;
	
	public Panel(int cantCeldas, int tamaņoCeldas ) {
		this.cantCeldas = cantCeldas;
		this.tamaņoCeldas = tamaņoCeldas;
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
	public int getTamaņoCeldas() {
		return tamaņoCeldas;
	}
	public void setTamaņoCeldas(int tamaņoCeldas) {
		this.tamaņoCeldas = tamaņoCeldas;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
}