package laCasaDeLosPanales;

public class Electrodomestico {

	private String nombre;
	private int watts;
	private int horas;
	
	public Electrodomestico(String nombre, int watts, int horas) {
		this.nombre = nombre;
		this.watts = watts;
		this.horas = horas;
	}
	
	private Panel panel = new Panel(10, 10);
	
	public int Consumo() {
		return watts*horas;
	}
	
	public boolean tienePanelChicos() {
		if(Consumo()> panel.energiaPanel()) {
			return true;
		}
	 return false;
	}
	
	public int cuantoProduceSuPanel() {
		return panel.energiaPanel();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Panel getPanel() {
		return panel;
	}
	
}