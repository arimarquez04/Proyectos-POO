package tdj;
import java.util.ArrayList;

public class Libro {
	private ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
	/*.
	2. insectos: Determina los participantes que tienen fuerza de combate por debajo de 500.
	3. losChuckNorris: Se deberán encontrar los contrincantes que podrían ganarle a Jean
	Claude.
	4. hayUnJiuJitsu : Determinar si existe al menos un contrincante que practique JiuJitsu,
	estilo al cual JC le teme por su torpeza en la lucha en el piso.
	5. laCantidadDeJiuJitsus : Determina la cantidad de contrincantes que practican JiuJitsu.*/
	public void agregarPersonaje(Luchador personaAgregar) {
		luchadores.add(personaAgregar);
	}
	
	private ArrayList<Luchador> luchadoresInsectos = new ArrayList<Luchador>();
	public ArrayList<Luchador> insectos() {
		for(Luchador l : luchadores) {
			if(l.getFuerzaDeCombate()<500) {
				luchadoresInsectos.add(l);
			}
		}
		return luchadoresInsectos;
	}
	
	private ArrayList<Luchador> luchadoresQuePuedenGanarleAJCVD = new ArrayList<Luchador>();
	public ArrayList<Luchador> losChuckNorris(double superarValor){
		for(Luchador l : luchadores) {
			if(l.esChuckNurris(superarValor)==true) {
				luchadoresQuePuedenGanarleAJCVD.add(l);
			}
		}
		return luchadoresQuePuedenGanarleAJCVD;
	}
	 public boolean hayUnJiuJitsu() {
		for(Luchador l : luchadores) {
			if(l.isJiujitsu()==true) {
				return true;
			}
		}
		return false;
	}
	public int laCantidadDeJiuJitsus() {
		int cantidadDeJiuJitsus = 0;
		for(Luchador l :luchadores) {
			if(l.isJiujitsu()==true) {
				cantidadDeJiuJitsus++;
			}
		}
		return cantidadDeJiuJitsus;
	}


}
