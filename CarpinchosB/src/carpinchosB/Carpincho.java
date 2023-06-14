package carpinchosB;

public class Carpincho {
	private String nombre;
	private int indiceDeAgradoPorElMate;
	private Canasta canasta = new Canasta();

	public void agregarCanasta(Canasta canastaAgregar) {
		this.canasta = canastaAgregar;
	}
	public int cacheDeSuCanasta() {
		return canasta.cuantoCacheTiene();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIndiceDeAgradoPorElMate() {
		return indiceDeAgradoPorElMate;
	}

	public void setIndiceDeAgradoPorElMate(int indiceDeAgradoPorElMate) {
		this.indiceDeAgradoPorElMate = indiceDeAgradoPorElMate;
	}

}
