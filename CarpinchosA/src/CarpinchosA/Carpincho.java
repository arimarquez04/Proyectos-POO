package CarpinchosA;

public class Carpincho {
	private String nombre;
	private int indiceDeAgradoPorElMate;
	private Canasta canasta = new Canasta();

	public Carpincho(int indiceDeAgradoPorElMate) {
		this.indiceDeAgradoPorElMate = indiceDeAgradoPorElMate;
	}

	public Carpincho(int indiceDeAgradoPorElMate, String nombre) {
		this.indiceDeAgradoPorElMate = indiceDeAgradoPorElMate;
		this.nombre = nombre;
	}

	public Carpincho() {

	}

	public boolean tomaMateTodoElDia() {
		if (canasta.alcanzaParaTodoElDia() == true) {
			return true;
		} else {
			return false;
		}
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
