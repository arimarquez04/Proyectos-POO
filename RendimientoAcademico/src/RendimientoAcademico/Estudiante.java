package RendimientoAcademico;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private boolean regularidad;
	private boolean trabaja;
	private int a�oIngreso;
	private ArrayList<Materia> materiasAprobadas = new ArrayList<>();

	public Estudiante(String nombre, boolean regularidad, boolean trabaja, int a�oIngreso) {
		this.nombre = nombre;
		this.regularidad = regularidad;
		this.trabaja = trabaja;
		this.a�oIngreso = a�oIngreso;
	}

	public Estudiante(boolean trabaja, int a�oIngreso) {
		this.trabaja = trabaja;
		this.a�oIngreso = a�oIngreso;
	}
	public Estudiante(boolean regularidad) {
		this.regularidad = regularidad;
	}
	public void agregarMaterias(Materia materiaAgregar) {
		if (regularidad == true) {
			materiasAprobadas.add(materiaAgregar);
		}
	}

	public boolean esViejoYLaburante() {
		if ((trabaja == true) && (a�oIngreso < 2012)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean superarParametro(int parametro) {
		if (contarPuntaje() > parametro) {
			return true;
		} else {
			return false;
		}
	}

	public int contarPuntaje() {
		int puntajeTotal = 0;
		for (Materia m : materiasAprobadas) {
			puntajeTotal = puntajeTotal + m.puntaje();
		}
		return puntajeTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isRegularidad() {
		return regularidad;
	}

	public void setRegularidad(boolean regularidad) {
		this.regularidad = regularidad;
	}

	public boolean isTrabaja() {
		return trabaja;
	}

	public void setTrabaja(boolean trabaja) {
		this.trabaja = trabaja;
	}

	public int getA�oIngreso() {
		return a�oIngreso;
	}

	public void setA�oIngreso(int a�oIngreso) {
		this.a�oIngreso = a�oIngreso;
	}

}
