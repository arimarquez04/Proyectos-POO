package laDesolacionDeHoracio;

import java.util.ArrayList;

public class Proyecto {

	private int tiempoEstimadoParaTerminar;
	private String nombre;

	private ArrayList<Desarrollador> desarrolladoresAsignados = new ArrayList<Desarrollador>();

	public void asignarDesarrollador(Desarrollador nuevoDesarrolladorAsignado) {
		desarrolladoresAsignados.add(nuevoDesarrolladorAsignado);
	}

	public Desarrollador MinutoPagani() {
		Desarrollador minutoPagani = null;
		int mayorPreferencia = 0;
		for (Desarrollador d : desarrolladoresAsignados) {
			if (d.getNivelDePreferenciaPorRiquelme() > mayorPreferencia) {
				minutoPagani = d;
				mayorPreferencia = d.getNivelDePreferenciaPorRiquelme();
			}
		}
		return minutoPagani;
	}

	public ArrayList<Desarrollador> desarrolladoresConLesionesCronicas() {
		ArrayList<Desarrollador> desarrolladoresConLesionesCronicas = new ArrayList<Desarrollador>();
		for (Desarrollador d : desarrolladoresAsignados) {
			if (d.tieneLesionCronica()==true) {
				desarrolladoresConLesionesCronicas.add(d);
			}
		}
		return desarrolladoresConLesionesCronicas;
	}

	public int cantidadDeDesarrolladoresConLesionesCronicas() {
		return desarrolladoresConLesionesCronicas().size();
	}

	public int cantidadDeDesarrolladoresAsignados() {
		return desarrolladoresAsignados.size();	
	}
	
	
	public final int getTiempoEstimadoParaTerminar() {
		return tiempoEstimadoParaTerminar;
	}

	public final void setTiempoEstimadoParaTerminar(int tiempoEstimadoParaTerminar) {
		this.tiempoEstimadoParaTerminar = tiempoEstimadoParaTerminar;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
