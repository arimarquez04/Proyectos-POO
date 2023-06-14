package cuidarEdu.test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import cuidarEdu.Comuna;
import cuidarEdu.Persona;

class comunaTest {

	
	//Pruebas del Metodo personasBuscandoElVirus();
	
	@Test
	void ningunaPersonaEstBuscandoElVirusPorqueTodosTienenSalidasMenoresA10() {
		Persona PersonaCon6Salidas = new Persona("Ariel", 6, 111111111);
		Persona PersonaCon7Salidas = new Persona("Lucas", 7, 22222222);
		Persona PersonaCon8Salidas = new Persona("Javier", 8, 33333333);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon6Salidas);
		comuna.agregarPersona(PersonaCon7Salidas);
		comuna.agregarPersona(PersonaCon8Salidas);
		ArrayList<Persona> resultadoEsperado = new ArrayList<Persona>();
		assertEquals(resultadoEsperado, comuna.personasBuscandoElVirus());
	}

	@Test
	void unaPersonaDe3EstaBuscandoElVirusPorqueUnSolaTieneSalidasMayorA10() {
		Persona PersonaCon6Salidas = new Persona("Ariel", 6, 111111111);
		Persona PersonaCon7Salidas = new Persona("Lucas", 7, 22222222);
		Persona PersonaCon15Salidas = new Persona("Javier", 15, 33333333);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon6Salidas);
		comuna.agregarPersona(PersonaCon7Salidas);
		comuna.agregarPersona(PersonaCon15Salidas);
		ArrayList<Persona> resultadoEsperado = new ArrayList<Persona>();
		resultadoEsperado.add(PersonaCon15Salidas);
		assertEquals(resultadoEsperado, comuna.personasBuscandoElVirus());
	}
	
	@Test
	void dosPersonasDe3EstanBuscandoElvirusPorqueSoloDosTienenSalidasMayoresA10() {
		Persona PersonaCon6Salidas = new Persona("Ariel", 6, 111111111);
		Persona PersonaCon15Salidas = new Persona("Lucas", 15, 22222222);
		Persona PersonaCon17Salidas = new Persona("Javier", 17, 33333333);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon6Salidas);
		comuna.agregarPersona(PersonaCon15Salidas);
		comuna.agregarPersona(PersonaCon17Salidas);
		ArrayList<Persona> resultadoEsperado = new ArrayList<Persona>();
		resultadoEsperado.add(PersonaCon15Salidas);
		resultadoEsperado.add(PersonaCon17Salidas);
		assertEquals(resultadoEsperado, comuna.personasBuscandoElVirus());
	}
	
	@Test
	void tresPersonasDesTresEstanBuscandoElVirusPorqueLas3PersonasTieneSalidasMayoresA10() {
		Persona PersonaCon13Salidas = new Persona("Ariel", 13, 111111111);
		Persona PersonaCon15Salidas = new Persona("Lucas", 15, 22222222);
		Persona PersonaCon17Salidas = new Persona("Javier", 17, 33333333);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon13Salidas);
		comuna.agregarPersona(PersonaCon15Salidas);
		comuna.agregarPersona(PersonaCon17Salidas);
		ArrayList<Persona> resultadoEsperado = new ArrayList<Persona>();
		resultadoEsperado.add(PersonaCon13Salidas);
		resultadoEsperado.add(PersonaCon15Salidas);
		resultadoEsperado.add(PersonaCon17Salidas);
		assertEquals(resultadoEsperado, comuna.personasBuscandoElVirus());
	}
	
	//Pruebas del Metodo cantidadDePersonasQueDebenAislarse()
	
	@Test
	void ningunaPersonaDebeAislarsePorqueNingunaTieneTemperaturaMayorA37() {
		Persona PersonaCon34DeTemperatura = new Persona("Ariel", 34);
		Persona PersonaCon35DeTemperatura = new Persona("Lucas", 35);
		Persona PersonaCon36DeTemperatura = new Persona("Javier", 36);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon34DeTemperatura);
		comuna.agregarPersona(PersonaCon35DeTemperatura);
		comuna.agregarPersona(PersonaCon36DeTemperatura);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, comuna.cantidadDePersonasQueDebenAislarse());
	}
	
	@Test
	void unaPersonaDe3DebeAislarsePorqueTieneTemperaturaMayorA37YLosOtrosDosNo() {
		Persona PersonaCon34DeTemperatura = new Persona("Ariel", 34);
		Persona PersonaCon35DeTemperatura = new Persona("Lucas", 35);
		Persona PersonaCon39DeTemperatura = new Persona("Javier", 39);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon34DeTemperatura);
		comuna.agregarPersona(PersonaCon35DeTemperatura);
		comuna.agregarPersona(PersonaCon39DeTemperatura);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, comuna.cantidadDePersonasQueDebenAislarse());
	}
	
	@Test
	void dosPersonasDe3DebenAislarsePorqueTienenTemperaturaMayorA37YElOtroNo() {
		Persona PersonaCon34DeTemperatura = new Persona("Ariel", 34);
		Persona PersonaCon39DeTemperatura = new Persona("Javier", 39);
		Persona PersonaCon40DeTemperatura = new Persona("Lucas", 40);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon34DeTemperatura);
		comuna.agregarPersona(PersonaCon39DeTemperatura);
		comuna.agregarPersona(PersonaCon40DeTemperatura);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, comuna.cantidadDePersonasQueDebenAislarse());
	}
	
	@Test
	void tresPersonasDe3DebenAislarsePorqueTienenTemperaturaMayorA37() {
		Persona PersonaCon38DeTemperatura = new Persona("Ariel", 38);
		Persona PersonaCon39DeTemperatura = new Persona("Javier", 39);
		Persona PersonaCon40DeTemperatura = new Persona("Lucas", 40);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(PersonaCon38DeTemperatura);
		comuna.agregarPersona(PersonaCon39DeTemperatura);
		comuna.agregarPersona(PersonaCon40DeTemperatura);
		int resultadoEsperado = 3;
		assertEquals(resultadoEsperado, comuna.cantidadDePersonasQueDebenAislarse());
	}
	
	//Pruebas del Metodo porcentajeDePersonasConDniImpar() 

	@Test
	void ceroPorcientoDe4PersonasTienenDniImpar() {
		Persona personaDniPar = new Persona(2);
		Persona personaDniPar2 = new Persona(4);
		Persona personaDniPar3 = new Persona(6);
		Persona personaDniPar4 = new Persona(8);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(personaDniPar);
		comuna.agregarPersona(personaDniPar2);
		comuna.agregarPersona(personaDniPar3);
		comuna.agregarPersona(personaDniPar4);
		double resultadoEsperado = 0;
		assertEquals(resultadoEsperado, comuna.porcentajePersonasDniImprar());
	}
	
	@Test
	void veinticincoPorcientoDe4PersonasTienenDniImpar() {
		Persona personaDniPar = new Persona(2);
		Persona personaDniPar2 = new Persona(4);
		Persona personaDniPar3 = new Persona(6);
		Persona personaDniImpar = new Persona(5);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(personaDniPar);
		comuna.agregarPersona(personaDniPar2);
		comuna.agregarPersona(personaDniPar3);
		comuna.agregarPersona(personaDniImpar);
		double resultadoEsperado = 25;
		assertEquals(resultadoEsperado, comuna.porcentajePersonasDniImprar());
	}
	
	@Test
	void cincuentaPorcientoDe4PersonasTienenDniImpar() {
		Persona personaDniPar = new Persona(2);
		Persona personaDniPar2 = new Persona(4);
		Persona personaDniImpar = new Persona(5);
		Persona personaDniImpar2 = new Persona(7);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(personaDniPar);
		comuna.agregarPersona(personaDniPar2);
		comuna.agregarPersona(personaDniImpar);
		comuna.agregarPersona(personaDniImpar2);
		double resultadoEsperado = 50;
		assertEquals(resultadoEsperado, comuna.porcentajePersonasDniImprar());
	}
	
	@Test
	void SetentaYCincoPorcientoDe4PersonasTienenDniImpar() {
		Persona personaDniPar = new Persona(2);
		Persona personaDniImpar = new Persona(5);
		Persona personaDniImpar2 = new Persona(7);
		Persona personaDniImpar3 = new Persona(9);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(personaDniPar);
		comuna.agregarPersona(personaDniImpar);
		comuna.agregarPersona(personaDniImpar2);
		comuna.agregarPersona(personaDniImpar3);
		double resultadoEsperado = 75;
		assertEquals(resultadoEsperado, comuna.porcentajePersonasDniImprar());
	}
	
	@Test
	void cienPorcientoDe4PersonasTienenDniImpar() {
		Persona personaDniImpar = new Persona(5);
		Persona personaDniImpar2 = new Persona(7);
		Persona personaDniImpar3 = new Persona(9);
		Persona personaDniImpar4 = new Persona(3);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(personaDniImpar);
		comuna.agregarPersona(personaDniImpar2);
		comuna.agregarPersona(personaDniImpar3);
		comuna.agregarPersona(personaDniImpar4);
		double resultadoEsperado = 100;
		assertEquals(resultadoEsperado, comuna.porcentajePersonasDniImprar());
	}
	
	//Pruebas del Metodo personaQueSalioMasVeces()
	
	@Test
	void laPersonaQueSalioMasVecesEsLaQueTieneMayorCantidadDeSalidas() {
		Persona persona = new Persona("Lucas", 15, 22222222);
		Persona persona2 = new Persona("Javier", 13, 33333333);
		Persona personaQueSalioMasVeces = new Persona("Ariel", 17, 111111111);
		Comuna comuna = new Comuna();
		comuna.agregarPersona(persona);
		comuna.agregarPersona(persona2);
		comuna.agregarPersona(personaQueSalioMasVeces);
		Persona resultadoEsperado = personaQueSalioMasVeces;
		assertEquals(resultadoEsperado, comuna.personaQueSalioMasVeces());
	}
}
