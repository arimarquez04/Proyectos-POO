package RendimientoAcademico;

public class OptativaConTP extends Optativa {

	public OptativaConTP(String materiaALaQuePertenece, int añoDeCarrera, boolean recurso, int indiceDeDificultad,
			int duracionEnHoras) {
		super(materiaALaQuePertenece, añoDeCarrera, recurso, indiceDeDificultad, duracionEnHoras);
	}
	public OptativaConTP(int duracinEnHoras, int indiceDeDificultad) {
		super(indiceDeDificultad, duracinEnHoras);
	}

	public int puntaje() {
		return super.puntaje() + 10;
	}
}
