package AlquilerDeVehiculos;

import java.util.ArrayList;

public abstract class Vehiculo {
	private String marca;
	private String patente;
	private int a�oDeFabricacion;
	private int kilometraje;
	private ArrayList<Accidente> accidentes = new ArrayList<>();
	private Conductor conductor = new Conductor();

	// Constructores
	public Vehiculo() {
	}

	public Vehiculo(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	// Metodos para agregar
	public void agregarAccidente(Accidente accidenteAgregar) {
		accidentes.add(accidenteAgregar);
	}

	public void asignarConductor(Conductor conductorAsignar) {
		conductor = conductorAsignar;
	}

	// Metodos Generales
	public abstract double velocidad();

	public abstract double gasto();

	public abstract int pasajeros();

	public int cantidadAccidentes() {
		return accidentes.size();
	}

	public double coeficienteDeEficiencia() {
		return (pasajeros() * velocidad()) / gasto();
	}

	public int cuantosTransportaSiSupera(int parametro) {
		if (velocidad() > parametro) {
			return pasajeros();
		} else {
			return 0;
		}
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getA�oDeFabricacion() {
		return a�oDeFabricacion;
	}

	public void setA�oDeFabricacion(int a�oDeFabricacion) {
		this.a�oDeFabricacion = a�oDeFabricacion;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

}
