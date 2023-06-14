package laDesolacionDeHoracio;

public class Lesion {

	public static final String LESION_CRONICA = "cronica";
	public static final String LESION_TRANSITORIA = "transitoria";
	private String tipoDeLesion;

	public boolean esCronica() {
		return LESION_CRONICA.equalsIgnoreCase(tipoDeLesion);
	}
	public boolean esTransitoria() {
		return LESION_TRANSITORIA.equalsIgnoreCase(tipoDeLesion);
	}

	public String getTipoDeLesion() {
		return tipoDeLesion;
	}

	public void setTipoDeLesion(String tipoDeLesion) {
		this.tipoDeLesion = tipoDeLesion;
	}
}
