package laCasaDeLosPanales;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Package;

public class Casa {

	private ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

	public void agregarElectrodomestico(Electrodomestico agregar) {
		electrodomesticos.add(agregar);
	}

	public ArrayList<Panel> losPanelesChicos() {
		ArrayList<Panel> loschicos = new ArrayList<Panel>();
		for (Electrodomestico e : electrodomesticos) {
			if (e.tienePanelChicos() == true) {
				loschicos.add(e.getPanel());
			}
		}
		return loschicos;
	}

	public Electrodomestico elElectroQueMasConsume() {
		Electrodomestico electro = null;
		for (Electrodomestico e : electrodomesticos) {
			if (e.Consumo() > electro.Consumo()) {
				electro = e;
			}
		}
		return electro;
	}
}