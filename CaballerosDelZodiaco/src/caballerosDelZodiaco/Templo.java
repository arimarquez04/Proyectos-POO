package caballerosDelZodiaco;

import java.util.ArrayList;

public class Templo {

	private ArrayList<Caballero> caballeros = new ArrayList<Caballero>();

	void agregarCaballero(Caballero caballeroParaAgregar) {
		caballeros.add(caballeroParaAgregar);
	}

	public double caballerosPrecocesPorcentaje() {
		int cantidadDePersonajesPrecoces = 0;
		for (Caballero c : caballeros) {
			if (c.esPrecoz() == true) {
				cantidadDePersonajesPrecoces = cantidadDePersonajesPrecoces + 1;
			}
		}
		double porcentajeDeCaballerosPrecoces = 0;
		porcentajeDeCaballerosPrecoces = cantidadDePersonajesPrecoces * 100 / caballeros.size();
		return porcentajeDeCaballerosPrecoces;
	}

	public ArrayList<Caballero> caballerosPoderosos() {
		ArrayList<Caballero> caballerosPrecoces = new ArrayList<Caballero>();
		for (Caballero c : caballeros) {
			if (c.esPoderoso() == true) {
				caballerosPrecoces.add(c);
			}
		}
		return caballerosPrecoces;
	}

	public Caballero posibleHades() {
		Caballero posibleHades = null;
		int maldadEncubierta = 0;
		for (Caballero c : caballeros) {
			if (c.getNivelDeMaldadEncubierta() > maldadEncubierta) {
				posibleHades = c;
			}
		}
		return posibleHades;

	}

	public ArrayList<Constelacion> constelacionesCercanasAlSol(){
		ArrayList<Constelacion> constelacionesCercanasAlSol = new ArrayList<Constelacion>();
		for(Caballero c : caballeros) {
			if(c.getConstelacionAsociada().estaCercanaAlSol()==true) {
				constelacionesCercanasAlSol.add(c.getConstelacionAsociada());
			}
		}
		return constelacionesCercanasAlSol;
	}
}
