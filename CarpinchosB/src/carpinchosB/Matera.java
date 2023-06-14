package carpinchosB;

public class Matera extends Canasta {
	private final static int NIVEL_DE_CACHE = 100;

	public static int getNivelDeCache() {
		return NIVEL_DE_CACHE;
	}

	public int cuantoCacheTiene() {
		return getNivelDeCache();
	}
}
