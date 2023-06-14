package AlquilerDeVehiculos;

public class Auto extends Vehiculo {
	private int pasajeros;
	private int velocidadMaxima;
	private static final int GASTO_CADA_100 = 20;

	// Constructores
	public Auto(int pasajeros, int velocidadMaxima) {
		this.pasajeros = pasajeros;
		this.velocidadMaxima = velocidadMaxima;
	}

	// Metodos Generales
	public double velocidad() {
		return velocidadMaxima;
	}

	public double gasto() {
		return GASTO_CADA_100 + (pasajeros * 10);
	}

	public int pasajeros() {
		return pasajeros;
	}

	// Getters y Setters
	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public static int getGastoCada100() {
		return GASTO_CADA_100;
	}

}
