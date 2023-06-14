package RendimientoAcademico;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private boolean regularidad;
	private boolean trabaja;
	private int añoIngreso;
	private ArrayList<Materia> materiasAprobadas = new ArrayList<>();

	public Estudiante(String nombre, boolean regularidad, boolean trabaja, int añoIngreso) {
		this.nombre = nombre;
		this.regularidad = regularidad;
		this.trabaja = trabaja;
		this.añoIngreso = añoIngreso;
	}

	public Estudiante(boolean trabaja, int añoIngreso) {
		this.trabaja = trabaja;
		this.añoIngreso = añoIngreso;
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
		if ((trabaja == true) && (añoIngreso < 2012)) {
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

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

}
