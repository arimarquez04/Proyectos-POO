package alicia;
import java.util.ArrayList;

public class Libro {

	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

	public void agregarPersonaje(Personaje personaAgregar) {
		personajes.add(personaAgregar);
	}

	public boolean hayNormal() {
		for (Personaje p : personajes) {
			if (p.esNormal() == true) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Personaje> personajesLindos() {
		ArrayList<Personaje> lindos = new ArrayList<Personaje>();
		for (Personaje p : personajes) {
			if (p.esLindo() == true) {
				lindos.add(p);
			}
		}
		return lindos;
	}

	public int CantidadPersonajesEnMaravilla() {
		int cantidad = 0;
		for (Personaje p : personajes) {
			if (p.esMaravilla() == true) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public Personaje mayorCantidadDeLocura() {
		Personaje personajeElegido = this.personajes.get(0);
		for (Personaje p : personajes) {
			if (p.getLocura() > personajeElegido.getLocura()) {
				personajeElegido = p;
				
			}
		}
		return personajeElegido;
	}

	public boolean masLindosQueNormales(){
		int personajesEnLocura = 0;
		int personajesNormales = 0;
		for (Personaje p : personajes) {
			if (p.esLindo() == true) {
				personajesEnLocura++;
			}
		}
		for (Personaje p : personajes) {
			if (p.esNormal() == true) {
				personajesNormales++;			
			}
		}
		if(personajesEnLocura>personajesNormales) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
