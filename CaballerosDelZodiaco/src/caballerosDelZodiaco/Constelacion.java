package caballerosDelZodiaco;

public class Constelacion {

	private String nombre;
	private boolean bandaCeleste;
	private int distanciaAlsol;
	private static final int DISTANCIA_MINIMA_PARA_ESTAR_CERCANA_AL_SOL = 1000000000;
	
	
	public Constelacion(String nombre, boolean bandaCeleste, int distanciaAlSol) {
		this.nombre = nombre;
		this.bandaCeleste = bandaCeleste;
		this.distanciaAlsol = distanciaAlSol;
	}
	public Constelacion(boolean bandaCeleste) {
		this.bandaCeleste = bandaCeleste;
	}
	public Constelacion(int distanciaAlsol) {
		this.distanciaAlsol = distanciaAlsol;
	}

	public boolean estaCercanaAlSol() {
		if(distanciaAlsol<DISTANCIA_MINIMA_PARA_ESTAR_CERCANA_AL_SOL) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public final boolean isBandaCeleste(){
		return bandaCeleste;
	}

	public final void setBandaCeleste(boolean bandaCeleste) {
		this.bandaCeleste = bandaCeleste;
	}
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public final int getDistanciaAlsol() {
		return distanciaAlsol;
	}
	public final void setDistanciaAlsol(int distanciaAlsol) {
		this.distanciaAlsol = distanciaAlsol;
	}
	public static final int getDistanciaMinimaParaEstarCercanaAlSol() {
		return DISTANCIA_MINIMA_PARA_ESTAR_CERCANA_AL_SOL;
	}
	
}
