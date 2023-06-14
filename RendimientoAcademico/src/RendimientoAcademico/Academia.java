package RendimientoAcademico;

import java.util.ArrayList;

public class Academia {

	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

	public void agregarEstudiante(Estudiante estudianteAgregar) {
		estudiantes.add(estudianteAgregar);
	}

	public ArrayList<Estudiante> losDeMayorPuntaje(int parametro) {
		ArrayList<Estudiante> estudiantesDeMayorPuntaje = new ArrayList<Estudiante>();
		for (Estudiante e : estudiantes) {
			if (e.superarParametro(parametro) == true) {
				estudiantesDeMayorPuntaje.add(e);
			}
		}
		return estudiantesDeMayorPuntaje;
	}

	public ArrayList<Estudiante> losViejosYLaburantes() {
		ArrayList<Estudiante> estudiantesViejosYLaburantes = new ArrayList<Estudiante>();
		for (Estudiante e : estudiantes) {
			if (e.esViejoYLaburante() == true) {
				estudiantesViejosYLaburantes.add(e);
			}
		}
		return estudiantesViejosYLaburantes;
	}
}
