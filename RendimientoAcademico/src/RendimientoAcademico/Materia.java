package RendimientoAcademico;

public abstract class Materia {

	private String materiaALaQuePertenece;
	private int a�oDeCarrera;
	private boolean recurso;

	public Materia() {
	}

	public Materia(boolean recurso, int a�oDeCarrera) {
		this.recurso = recurso;
		this.a�oDeCarrera = a�oDeCarrera;
	}

	public Materia(String materiaALaQuePertenece, int a�oDeCarrera, boolean recurso) {
		this.materiaALaQuePertenece = materiaALaQuePertenece;
		this.a�oDeCarrera = a�oDeCarrera;
		this.recurso = recurso;
	}

	public abstract int puntaje();

	public String getMateriaALaQuePertenece() {
		return materiaALaQuePertenece;
	}

	public void setMateriaALaQuePertenece(String materiaALaQuePertenece) {
		this.materiaALaQuePertenece = materiaALaQuePertenece;
	}

	public int getA�oDeCarrera() {
		return a�oDeCarrera;
	}

	public void setA�oDeCarrera(int a�oDeCarrera) {
		this.a�oDeCarrera = a�oDeCarrera;
	}

	public boolean isRecurso() {
		return recurso;
	}

	public void setRecurso(boolean recurso) {
		this.recurso = recurso;
	}

}
