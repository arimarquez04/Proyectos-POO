package RendimientoAcademico;

public class Optativa extends Materia {

	private int indiceDeDificultad;
	private int duracionEnHoras;

	public Optativa(String materiaALaQuePertenece, int añoDeCarrera, boolean recurso, int indiceDeDificultad, int duracionEnHoras){
		super(materiaALaQuePertenece, añoDeCarrera, recurso);
		this.setRecurso(recurso);
		this.setDuracionEnHoras(duracionEnHoras);
	}
	public Optativa(int indiceDeDificultad,int duracionEnHoras) {
		this.indiceDeDificultad=indiceDeDificultad;
		this.duracionEnHoras = duracionEnHoras;
	}
	public int puntaje() {

		return indiceDeDificultad * duracionEnHoras;
	}

	public int getIndiceDeDificultad() {
		return indiceDeDificultad;
	}

	public void setIndiceDeDificultad(int indiceDeDificultad) {
		this.indiceDeDificultad = indiceDeDificultad;
	}

	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}

	public void setDuracionEnHoras(int duracionEnHoras) {
		if ((duracionEnHoras > 0) && (duracionEnHoras < 4)) {
			this.duracionEnHoras = duracionEnHoras;
		}
	}

}
