package alicia;

public class Personaje {
	private String nombre;
	private int locura;
	private int secretos;
	private int ubicacion;
	private static int maximoLocura;

	public Personaje(String nombre, int locura, int secretos, int ubicacion){
		this.nombre = nombre;
		this.locura = locura;
		this.secretos = secretos;
		this.ubicacion = ubicacion;
	}
	
	public void embellecer(int nuevovalor) {

		locura = locura + nuevovalor;
		secretos -= 10;
	}

	public boolean esLindo() {
		if ((locura > maximoLocura * 0.75) && (esMaravilla() == true)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esMaravilla() {
		if (ubicacion < 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esNormal() {
		if ((locura < 10) && (secretos >= 500)) {
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

	public final int getLocura() {
		return locura;
	}

	public final void setLocura(int locura) {
		this.locura = locura;
	}

	public final int getSecretos() {
		return secretos;
	}

	public final void setSecretos(int secretos) {
		this.secretos = secretos;
	}

	public final int getUbicacion() {
		return ubicacion;
	}

	public final void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion;
	}
	public static final int getMaximoLocura() {
		return maximoLocura;
	}
	public static final void setMaximoLocura(int maximoLocura) {
		Personaje.maximoLocura = maximoLocura;
	}
}