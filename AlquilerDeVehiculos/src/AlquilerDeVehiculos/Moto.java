package AlquilerDeVehiculos;

public class Moto extends Vehiculo {
	private boolean puedeIrPorLaRuta;
	private int cilindrado;
	private static final int GASTO_CADA_100 = 50;
//Constructores
	public Moto() {	
	}
	public Moto(boolean puedeIrPorLaRuta, int cilindradro) {
		this.puedeIrPorLaRuta = puedeIrPorLaRuta;
		this.cilindrado = cilindradro;
	}
	public Moto(int cilindrado) {
		this.cilindrado = cilindrado;
	}
	
	// Metodos Generales
	public double velocidad() {
		return cilindrado / 2;
	}

	public double gasto() {
		return GASTO_CADA_100 + (cilindrado / 2);
	}

	public int pasajeros() {
		if (cilindrado <= 75) {
			return 1;
		} else {
			return 2;
		}
	}

	public boolean isPuedeIrPorLaRuta() {
		return puedeIrPorLaRuta;
	}

	public void setPuedeIrPorLaRuta(boolean puedeIrPorLaRuta) {
		this.puedeIrPorLaRuta = puedeIrPorLaRuta;
	}

	public int getCilindrado() {
		return cilindrado;
	}

	public void setCilindrado(int cilindrado) {
		this.cilindrado = cilindrado;
	}

	public static int getGastoCada100() {
		return GASTO_CADA_100;
	}

}
