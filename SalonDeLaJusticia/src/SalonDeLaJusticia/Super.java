package SalonDeLaJusticia;

import java.util.ArrayList;

public class Super {
	private String nombre;
	private double presupuesto;

	private ArrayList<Asistente> asistentes = new ArrayList<Asistente>();

	public void agregarAsistente(Asistente asistenteAgregar) {
		asistentes.add(asistenteAgregar);
	}

	public double cuantoPagaEnSalarios() {
		double totalAPagar = 0;
		for (Asistente a : asistentes) {
			totalAPagar = totalAPagar + a.salario();
		}
		return totalAPagar;
	}

	public boolean llegaAFinDeMes() {
		if (presupuesto >= cuantoPagaEnSalarios()) {
			return true;
		} else {
			return false;
		}
	}

	public double cuantoParaLaVaquita() {
		double agregar = 0;
		if (llegaAFinDeMes() == true) {
			agregar = presupuesto - cuantoPagaEnSalarios();
		} else {
			agregar = 0;
		}
		return agregar;
	}

	public int cuantosAsistentesRicosTiene() {
		int cantidadDeAsistentesRicos = 0;
		for (Asistente a : asistentes) {
			if (a.esRico() == true) {
				cantidadDeAsistentesRicos++;
			}
		}
		return cantidadDeAsistentesRicos;
	}

	

	public int cuantosAsistentesTiene() {
		return asistentes.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public ArrayList<Asistente> getAsistentes() {
		return asistentes;
	}

}
