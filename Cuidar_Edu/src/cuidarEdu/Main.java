package cuidarEdu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia = 13;
		double temperatura = 37;

		// declarar persona
		String nombre = "Ariel";
		int salidas = 20;
		int dni = 12345678;
		Persona persona1 = new Persona(nombre, salidas, dni);
		Persona persona2 = new Persona("Lucas", 11, 11111111);
		Persona persona3 = new Persona("Mateo", 11, 22222222);
		Persona persona4 = new Persona("Javier", 11, 33333333);
		Persona persona5 = new Persona("Persona5", 1, 44444444);
		Persona persona6 = new Persona("Persona6", 6, 55555555);
		Persona persona7 = new Persona("Persona7", 15, 66666665);
		Persona persona8 = new Persona("Persona8", 3, 77777777);
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "farmacia");

		Comuna comuna = new Comuna();
		comuna.agregarPersona(persona1);
		comuna.agregarPersona(persona2);
		comuna.agregarPersona(persona3);
		comuna.agregarPersona(persona4);
		comuna.agregarPersona(persona5);
		comuna.agregarPersona(persona6);
		comuna.agregarPersona(persona7);
		comuna.agregarPersona(persona8);
		
		//*1. Encontrar a las personas que están buscando el virus.
		ArrayList<Persona> listaDePersonanBuscandoElVirus = new ArrayList<Persona>();
		listaDePersonanBuscandoElVirus = comuna.personasBuscandoElVirus();
		if (listaDePersonanBuscandoElVirus.size() == 0) {
			System.out.println("No hay personas buscando al virus.");
		} else {
			for(Persona p : listaDePersonanBuscandoElVirus) {
				System.out.println(p.getNombre() + " esta buscando el virus");
			}
		}
		
		//2. Determinar cuántas personas deben aislarse.
		System.out.println("\nSe deben aislar " + comuna.cantidadDePersonasQueDebenAislarse(temperatura) + " personas");
		
		//3. La persona que más veces salió.
		System.out.println("\n" + comuna.personaQueSalioMasVeces() + " es la persona que mas veces salió");
		
		//4. Determinar el porcentaje de personas con DNI impar
		System.out.println("\n" + comuna.porcentajePersonasDniImprar() + "% de las personas tienen un DNI impar");
		
		
		/*
		 * //aislarse System.out.println("    aislarse()"); ;
		 * if(persona1.meAislo(temperatura)==true) { System.out.println("La Persona ["+
		 * persona1.getNombre() + "] debe Aislarse."); } else {
		 * System.out.println("La Persona ["+ persona1.getNombre() +
		 * "] no debe Aislarse."); } //puedoIrAComprar... System.out.
		 * println("-------------------------------------\n    puedoIrAComprarAUnLocalEnTalDía()"
		 * ); if(persona1.puedoSalirAComprar(farmaciaDelOeste, temperatura, dia)==true)
		 * { System.out.println("[" + persona1.getNombre() +
		 * "] puede ir a comprar al local [" + farmaciaDelOeste.nombre + "]."); } else {
		 * System.out.println("[" + persona1.getNombre() +
		 * "] no puede ir a comprar al local [" + farmaciaDelOeste.nombre + "]."); }
		 * 
		 * //salir
		 * System.out.println("-------------------------------------\n    salir()");
		 * 
		 * int salidasAnteriores = persona1.getSalidas(); persona1.salir();
		 * System.out.println("Nueva Salida agregada.\nSalidas Anteriores: [" +
		 * salidasAnteriores + "] \nTotal de Salidas: [" + persona1.getSalidas() +"]");
		 * 
		 * //estoyBuscandoAlVirus System.out.
		 * println("-------------------------------------\n    estoyBuscandoAlVirus()");
		 * if(persona1.estoyBuscandoAlVirus()==true) { System.out.println("La Persona ["
		 * + persona1.getNombre() + "] esta buscando al virus."); } else {
		 * System.out.println("La Persona [" + persona1.getNombre() +
		 * "] no Esta buscando al virus."); }
		 */
		System.out.println("\nAlgoritmo Finalizado!!");
	}
}