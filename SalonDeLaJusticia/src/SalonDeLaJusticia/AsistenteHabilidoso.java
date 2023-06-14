package SalonDeLaJusticia;

public class AsistenteHabilidoso extends Asistente {

	private String habilidad;
	private static final int INCREMENTAR = 20;

	public double salario() {
		return getSueldoBase() + cuantoIncrementar();
	}

	public double cuantoIncrementar() {

		return (getSueldoBase() * INCREMENTAR) / 100;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public static int getIncrementar() {
		return INCREMENTAR;
	}

}
