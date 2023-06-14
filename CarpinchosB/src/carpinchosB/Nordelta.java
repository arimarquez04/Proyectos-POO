package carpinchosB;

import java.util.ArrayList;

public class Nordelta {

	private ArrayList<Carpincho> carpinchos = new ArrayList<Carpincho>();

	public void agregarCarpincho(Carpincho carpinchoAgregar) {
		carpinchos.add(carpinchoAgregar);
	}

	public int numeroTotalDeCache() {
		int totalDeCache = 0;
		for (Carpincho c : carpinchos) {
			totalDeCache = totalDeCache + c.cacheDeSuCanasta();
		}
		return totalDeCache;
	}
	
	public boolean estamosEnLaBristol() {
		if((numeroTotalDeCache()/100)>80) {
			return true;
		}
		else {
			return false;
		}
	}
}
