package laCasaDeLosPanales;

public class Panel {

	private int cantCeldas;
	private int tama�oCeldas;
	private int energia;
	private Electrodomestico electrodomestico;
	
	public Panel(int cantCeldas, int tama�oCeldas ) {
		this.cantCeldas = cantCeldas;
		this.tama�oCeldas = tama�oCeldas;
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
	public int getTama�oCeldas() {
		return tama�oCeldas;
	}
	public void setTama�oCeldas(int tama�oCeldas) {
		this.tama�oCeldas = tama�oCeldas;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
}