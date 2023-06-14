package SalonDeLaJusticia;

import java.util.ArrayList;

public class Salon {

	private ArrayList<Super> supersDelSalon = new ArrayList<Super>();

	public void agregarSuper(Super superAgregar) {
		supersDelSalon.add(superAgregar);
	}

	public ArrayList<Super> supersConMayorCantidadDeAsistentes() {
		int mayorCantidad = 0;

		ArrayList<Super> supersConMayorCantidadDeAsistentes = new ArrayList<Super>();
		for (Super s : supersDelSalon) {
			if (s.cuantosAsistentesTiene() > mayorCantidad) {
				mayorCantidad = s.cuantosAsistentesTiene();
			}
		}
		for (Super s : supersDelSalon) {
			if (s.cuantosAsistentesTiene() == mayorCantidad) {
				supersConMayorCantidadDeAsistentes.add(s);
			}
		}
		return supersConMayorCantidadDeAsistentes;
	}

	public double presupuestoDeLaVaquita() {
		double presupuesto = 0;
		for (Super s : supersDelSalon) {
			presupuesto = presupuesto + s.cuantoParaLaVaquita();
		}
		return presupuesto;
	}
	
	public ArrayList<Super> supersQueNoLLeganAFinDeMes(){
		ArrayList<Super> supersQueNoLLeganAFinDeMes = new ArrayList<Super>();
		for (Super s : supersDelSalon) {
			if(s.llegaAFinDeMes()==false) {
				supersQueNoLLeganAFinDeMes.add(s);
			}
		}
		return supersQueNoLLeganAFinDeMes;
	}
	
	public int asistentesRicos() {
		int cantidadAsistentesRicos = 0;
		for (Super s : supersDelSalon) {
			cantidadAsistentesRicos = cantidadAsistentesRicos +  s.cuantosAsistentesRicosTiene();
		}
		return cantidadAsistentesRicos;
	}
}
