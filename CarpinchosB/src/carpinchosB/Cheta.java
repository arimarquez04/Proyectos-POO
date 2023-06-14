package carpinchosB;

public class Cheta extends Canasta {

	private int gramosDeJamonCrudo;

	public int cuantoCacheTiene() {
		return ((100 - getLitrosDeAgua()) * gramosDeJamonCrudo);
	}

	public int getGramosDeJamonCrudo() {
		return gramosDeJamonCrudo;
	}

	public void setGramosDeJamonCrudo(int gramosDeJamonCrudo) {
		this.gramosDeJamonCrudo = gramosDeJamonCrudo;
	}

}
