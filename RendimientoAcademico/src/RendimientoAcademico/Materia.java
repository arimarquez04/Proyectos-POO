package RendimientoAcademico;

public abstract class Materia {

	private String materiaALaQuePertenece;
	private int aņoDeCarrera;
	private boolean recurso;

	public Materia() {
	}

	public Materia(boolean recurso, int aņoDeCarrera) {
		this.recurso = recurso;
		this.aņoDeCarrera = aņoDeCarrera;
	}

	public Materia(String materiaALaQuePertenece, int aņoDeCarrera, boolean recurso) {
		this.materiaALaQuePertenece = materiaALaQuePertenece;
		this.aņoDeCarrera = aņoDeCarrera;
		this.recurso = recurso;
	}

	public abstract int puntaje();

	public String getMateriaALaQuePertenece() {
		return materiaALaQuePertenece;
	}

	public void setMateriaALaQuePertenece(String materiaALaQuePertenece) {
		this.materiaALaQuePertenece = materiaALaQuePertenece;
	}

	public int getAņoDeCarrera() {
		return aņoDeCarrera;
	}

	public void setAņoDeCarrera(int aņoDeCarrera) {
		this.aņoDeCarrera = aņoDeCarrera;
	}

	public boolean isRecurso() {
		return recurso;
	}

	public void setRecurso(boolean recurso) {
		this.recurso = recurso;
	}

}
