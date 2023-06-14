package laDesolacionDeHoracio;

import java.util.ArrayList;

public class Desarrollador {
	private String nombre;
	private int horasTrabajadas;
	private int nivelDePreferenciaPorRiquelme;
	private ArrayList<Lesion> registroDeLesiones = new ArrayList<Lesion>();

	public Desarrollador(String nombre, int horasTrabajadas) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}

	public Desarrollador() {

	}

	public Desarrollador(int nivelDePreferenciaPorRiquelme) {
		this.nivelDePreferenciaPorRiquelme = nivelDePreferenciaPorRiquelme;
	}

	public void agregarLesionAlRegistro(Lesion nuevaLesion) {
		registroDeLesiones.add(nuevaLesion);
	}

	public boolean tieneLesionCronica() {
		for (Lesion l : registroDeLesiones) {
		if(l.esCronica()==true) {
			return true;
		}
		}
		return false;
	}
	public int cantidadDeLesionesRegistradas() {
		return registroDeLesiones.size();
	}

	public final String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public boolean tieneLesionCronicaAhora() {
		for (Lesion lesion : registroDeLesiones) {
			if (lesion.esCronica()) {
				return true;
			}
		}
		return false;
	}


	public final int getNivelDePreferenciaPorRiquelme() {
		return nivelDePreferenciaPorRiquelme;
	}

	public final void setNivelDePreferenciaPorRiquelme(int nivelDePreferenciaPorRiquelme) {
		this.nivelDePreferenciaPorRiquelme = nivelDePreferenciaPorRiquelme;
	}

	public ArrayList<Lesion> getRegistroDeLesiones() {
		return registroDeLesiones;
	}
}
