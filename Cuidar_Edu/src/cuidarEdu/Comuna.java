package cuidarEdu;
import java.util.ArrayList;

public class Comuna {
	/*
	 * 1. Encontrar a las personas que est�n buscando el virus. 2. Determinar
	 * cu�ntas personas deben aislarse. 3. La persona que m�s veces sali�. 4.
	 * Determinar el porcentaje de personas con DNI impar
	 */

	ArrayList<Persona> personas = new ArrayList<Persona>();

	public void agregarPersona(Persona personaAgregar) {
		personas.add(personaAgregar);
	}

	public void mostrar() {
		for (Persona p : personas)
			System.out.println(p.getNombre());

	}

	public ArrayList<Persona> personasBuscandoElVirus() {
		ArrayList<Persona> personasBuscandoElVirus = new ArrayList<Persona>();
		for (Persona p : personas) {
			if (p.estoyBuscandoAlVirus() == true) {
				personasBuscandoElVirus.add(p);
			}
		}

		return personasBuscandoElVirus;
	}

	public int cantidadDePersonasQueDebenAislarse() {
		int cantidad = 0;
		for (Persona p : personas) {
			if (p.meAislo() == true) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public Persona personaQueSalioMasVeces() {
		Persona personaElegida = null;
		int maximaCantidadDeSalidas = 0;
		for (Persona p : personas) {
			if (p.getSalidas() > maximaCantidadDeSalidas) {
				personaElegida = p;
				maximaCantidadDeSalidas = p.getSalidas();

			}
		}
		return personaElegida;
	}

	public double porcentajePersonasDniImprar() {
		int cantidadPersonasDniImpar = 0;
		for (Persona p : personas) {
			if (p.getDni() % 2 != 0) {
				cantidadPersonasDniImpar++;
			}
		}
		double porcentajePersonasDniImpar = 0;
		porcentajePersonasDniImpar = cantidadPersonasDniImpar * 100 / personas.size();
		return porcentajePersonasDniImpar;
	}

}
