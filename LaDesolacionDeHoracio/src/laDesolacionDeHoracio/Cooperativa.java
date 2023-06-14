package laDesolacionDeHoracio;

import java.util.ArrayList;

public class Cooperativa {

	private ArrayList<Proyecto> proyectosEnDesarrollo = new ArrayList<Proyecto>();

	public void agregarNuevoProyecto(Proyecto nuevoProyectoParaAgregar) {
		proyectosEnDesarrollo.add(nuevoProyectoParaAgregar);
	}

	public Desarrollador minutoPagani() {
		Desarrollador minutoPagani = null;
		for (Proyecto p : proyectosEnDesarrollo) {
			if (p.MinutoPagani().getNivelDePreferenciaPorRiquelme() > minutoPagani.getNivelDePreferenciaPorRiquelme()) {
				minutoPagani = p.MinutoPagani();
			}
		}
		return minutoPagani;
	}

	public Proyecto proyectoDeAltoImpacto() {
		Proyecto elProyectoDeMasAltoImpacto = this.proyectosEnDesarrollo.get(0);
		for (Proyecto p : proyectosEnDesarrollo) {
			//dividir el if en 2 partes
			//si se cumple la condicion del A
			if(p.getTiempoEstimadoParaTerminar()>elProyectoDeMasAltoImpacto.getTiempoEstimadoParaTerminar()) {
				elProyectoDeMasAltoImpacto = p;
			}
			else if (p.getTiempoEstimadoParaTerminar()==elProyectoDeMasAltoImpacto.getTiempoEstimadoParaTerminar()) {
				if(p.cantidadDeDesarrolladoresConLesionesCronicas()>elProyectoDeMasAltoImpacto.cantidadDeDesarrolladoresConLesionesCronicas()) {
					elProyectoDeMasAltoImpacto = p;
				}
			}

		}

		return elProyectoDeMasAltoImpacto;
	}

	public Proyecto elProyectoQueLeGustaALaGente() {
		Proyecto proyectoMasQuerido = null;
		int mayorCantidadDeDesarrolladoresTrabajandoEnUnProyecto = 0;
		for (Proyecto p : proyectosEnDesarrollo) {
			if (p.cantidadDeDesarrolladoresAsignados() > mayorCantidadDeDesarrolladoresTrabajandoEnUnProyecto) {
				proyectoMasQuerido = p;
			}
		}

		return proyectoMasQuerido;

	}

}
