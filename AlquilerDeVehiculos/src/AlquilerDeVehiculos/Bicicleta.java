package AlquilerDeVehiculos;

public class Bicicleta extends Vehiculo {
	private int rodado;
	private static final int GASTO_CADA_100 = 1;
	private static final int PASAJEROS = 1;

	// Constructores
	public Bicicleta() {
	}

	public Bicicleta(int rodado) {
		this.rodado = rodado;
	}

	public Bicicleta(int rodado, int kilometraje) {
		super(kilometraje);
		this.rodado = rodado;
	}

	// Metodos Generales
	public double velocidad() {
		return rodado * 1.2;
	}

	public double gasto() {
		return GASTO_CADA_100;
	}

	public int pasajeros() {
		return PASAJEROS;
	}

	// Getters y Setters
	public int getRodado() {
		return rodado;
	}

	public void setRodado(int rodado) {
		this.rodado = rodado;
	}

	public static int getGastoCada100() {
		return GASTO_CADA_100;
	}

	public static int getPasajeros() {
		return PASAJEROS;
	}
}
