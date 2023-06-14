package RendimientoAcademico;

public abstract class Materia {

	private String materiaALaQuePertenece;
	private int añoDeCarrera;
	private boolean recurso;

	public Materia() {
	}

	public Materia(boolean recurso, int añoDeCarrera) {
		this.recurso = recurso;
		this.añoDeCarrera = añoDeCarrera;
	}

	public Materia(String materiaALaQuePertenece, int añoDeCarrera, boolean recurso) {
		this.materiaALaQuePertenece = materiaALaQuePertenece;
		this.añoDeCarrera = añoDeCarrera;
		this.recurso = recurso;
	}

	public abstract int puntaje();

	public String getMateriaALaQuePertenece() {
		return materiaALaQuePertenece;
	}

	public void setMateriaALaQuePertenece(String materiaALaQuePertenece) {
		this.materiaALaQuePertenece = materiaALaQuePertenece;
	}

	public int getAñoDeCarrera() {
		return añoDeCarrera;
	}

	public void setAñoDeCarrera(int añoDeCarrera) {
		this.añoDeCarrera = añoDeCarrera;
	}

	public boolean isRecurso() {
		return recurso;
	}

	public void setRecurso(boolean recurso) {
		this.recurso = recurso;
	}

}
