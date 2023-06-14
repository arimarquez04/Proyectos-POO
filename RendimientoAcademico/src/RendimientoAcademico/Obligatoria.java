package RendimientoAcademico;

public class Obligatoria extends Materia {

	

	private int puntajeBase;
	public Obligatoria(String materiaALaQuePertenece, int a�oDeCarrera, boolean recurso, int puntajeBase) {
		super(materiaALaQuePertenece, a�oDeCarrera, recurso);
		this.puntajeBase = puntajeBase;
	}
	
	public Obligatoria(int puntajeBase, boolean recurso, int a�oDeCarrera) {
		super(recurso, a�oDeCarrera);
		this.puntajeBase = puntajeBase;
	}
	public Obligatoria() {
		
	}
	
	public int puntaje() {
		int puntaje = 0;
		if (isRecurso() == false) {
			puntaje = getA�oDeCarrera() * puntajeBase;
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
