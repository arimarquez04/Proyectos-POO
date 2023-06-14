package AlquilerDeVehiculos;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public void agregarVehiculo(Vehiculo vehiculoAgregar) {
		vehiculos.add(vehiculoAgregar);
	}

	public ArrayList<Vehiculo> losMasAccidentados() {
		ArrayList<Vehiculo> vehiculosConMasAccidentes = new ArrayList<>();
		int mayorCantidad = 0;
		for (Vehiculo v : vehiculos) {
			if (v.cantidadAccidentes() > mayorCantidad) {
				mayorCantidad = v.cantidadAccidentes();
			}
		}
		for (Vehiculo v : vehiculos) {
			if (v.cantidadAccidentes() == mayorCantidad) {
				vehiculosConMasAccidentes.add(v);
			}
		}
		return vehiculosConMasAccidentes;
	}

	public ArrayList<Vehiculo> losQueConsumenMenosQueElParametro(double parametro) {
		ArrayList<Vehiculo> vehiculosQueConsumenMenosQueElParametro = new ArrayList<>();
		for (Vehiculo v : vehiculos) {
			if (v.gasto() < parametro) {
				vehiculosQueConsumenMenosQueElParametro.add(v);
			}
		}
		return vehiculosQueConsumenMenosQueElParametro;
	}

	public ArrayList<Vehiculo> losDeMayorEficiencia() {
		ArrayList<Vehiculo> vehiculosDeMayorEficiencia = new ArrayList<>();
		double mayorCantidadDeEficiencia = 0;
		for (Vehiculo v : vehiculos) {
			if (v.coeficienteDeEficiencia() > mayorCantidadDeEficiencia) {
				mayorCantidadDeEficiencia = v.coeficienteDeEficiencia();
			}
		}
		for (Vehiculo v : vehiculos) {
			if (v.coeficienteDeEficiencia() == mayorCantidadDeEficiencia) {
				vehiculosDeMayorEficiencia.add(v);
			}
		}
		return vehiculosDeMayorEficiencia;
	}

	public int cantidadDePasajerosQueSePuedenTransportasACiertaVelocidad(int parametro) {
		int cantidadDePasajeros = 0;
		for (Vehiculo v : vehiculos) {
			if (v.velocidad() >= parametro) {
				cantidadDePasajeros = cantidadDePasajeros + v.pasajeros();
			}
		}
		return cantidadDePasajeros;

	}
}
