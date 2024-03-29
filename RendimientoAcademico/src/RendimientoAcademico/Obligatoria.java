package RendimientoAcademico;

public class Obligatoria extends Materia {

	

	private int puntajeBase;
	public Obligatoria(String materiaALaQuePertenece, int aņoDeCarrera, boolean recurso, int puntajeBase) {
		super(materiaALaQuePertenece, aņoDeCarrera, recurso);
		this.puntajeBase = puntajeBase;
	}
	
	public Obligatoria(int puntajeBase, boolean recurso, int aņoDeCarrera) {
		super(recurso, aņoDeCarrera);
		this.puntajeBase = puntajeBase;
	}
	public Obligatoria() {
		
	}
	
	public int puntaje() {
		int puntaje = 0;
		if (isRecurso() == false) {
			puntaje = getAņoDeCarrera() * puntajeBase;
		} else {
			puntaje = puntajeBase;
		}
		return puntaje;
	}

	public int getPuntajebase() {
		return puntajeBase;
	}

	public void setPuntajebase(int puntajebase) {
		this.puntajeBase = puntajebase;
	}

}
