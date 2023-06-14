package caballerosDelZodiaco;

public class Caballero {

	private String nombre;
	private int edadALaQueSeHizoCaballero;
	private int nivelDeMaldadEncubierta;
	private Constelacion constelacionAsociada;

	public Caballero(String nombre, int edadALaQueSeHizoCaballero, int nivelDeMaldadEncubierta,
			Constelacion constelacionAsociada) {
		this.nombre = nombre;
		this.edadALaQueSeHizoCaballero = edadALaQueSeHizoCaballero;
		this.nivelDeMaldadEncubierta = nivelDeMaldadEncubierta;
		this.constelacionAsociada = constelacionAsociada;
	}

	public Caballero(Constelacion constelacionAsociada) {
		this.constelacionAsociada = constelacionAsociada;
	}

	public Caballero(int edadALaQueSeHizoCaballero) {
		this.edadALaQueSeHizoCaballero = edadALaQueSeHizoCaballero;
	}

	public Caballero(Constelacion constelacionAsociada, int edadALaQueSeHizoCaballero) {
		this.constelacionAsociada = constelacionAsociada;
		this.edadALaQueSeHizoCaballero = edadALaQueSeHizoCaballero;
	}

	public boolean esOro() {
		if (constelacionAsociada.isBandaCeleste() == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esPrecoz() {
		if (edadALaQueSeHizoCaballero < 12) {
			return true;
		} else {
			return false;
		}

	}

	public boolean esPoderoso() {
		if ((esOro() == true) && (esPrecoz() == true)) {
			return true;
		} else {
			return false;
		}
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final int getEdadALaQueSeHizoCaballero() {
		return edadALaQueSeHizoCaballero;
	}

	public final void setEdadALaQueSeHizoCaballero(int edadALaQueSeHizoCaballero) {
		this.edadALaQueSeHizoCaballero = edadALaQueSeHizoCaballero;
	}

	public final int getNivelDeMaldadEncubierta() {
		return nivelDeMaldadEncubierta;
	}

	public final void setNivelDeMaldadEncubierta(int nivelDeMaldadEncubierta) {
		this.nivelDeMaldadEncubierta = nivelDeMaldadEncubierta;
	}

	public final Constelacion getConstelacionAsociada() {
		return constelacionAsociada;
	}

	public final void setConstelacionAsociada(Constelacion constelacionAsociada) {
		this.constelacionAsociada = constelacionAsociada;
	}

}
