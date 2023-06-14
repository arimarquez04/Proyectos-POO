package CarpinchosA;

import java.util.ArrayList;

public class Nordelta {

	private ArrayList<Carpincho> carpinchos = new ArrayList<>();

	public void agregarCarpincho(Carpincho carpinchoAgregar) {
		carpinchos.add(carpinchoAgregar);
	}

	public ArrayList<Carpincho> losMasMatero() {
		ArrayList<Carpincho> carpinchosMasMateros = new ArrayList<>();
		int indiceMasAlto = 0;
		for (Carpincho c : carpinchos) {
			if (c.getIndiceDeAgradoPorElMate() > indiceMasAlto) {
				indiceMasAlto = c.getIndiceDeAgradoPorElMate();
			}
		}
		for (Carpincho c : carpinchos) {
			if (c.getIndiceDeAgradoPorElMate() == indiceMasAlto) {
				carpinchosMasMateros.add(c);
			}
		}
		return carpinchosMasMateros;
	}

	public ArrayList<Carpincho> losQueTomanMateTodoElDia() {
		ArrayList<Carpincho> carpinchosQueTomanMateTodoElDia = new ArrayList<>();
		for (Carpincho c : carpinchos) {
			if (c.tomaMateTodoElDia() == true) {
				carpinchosQueTomanMateTodoElDia.add(c);
			}
		}
		return carpinchosQueTomanMateTodoElDia;
	}

	public int cantidadDeCarpinchosQueTomanMateTodoElDia() {
		return losQueTomanMateTodoElDia().size();
	}

	public boolean yaNoSePuedeDescansarLaVista() {
		if (cantidadDeCarpinchosQueTomanMateTodoElDia() > cuantosCarpinchosHay() * 100 / 7) {
			return true;
		} else {
			return false;
		}
	}

	public int cuantosCarpinchosHay() {
		return carpinchos.size();
	}
}
