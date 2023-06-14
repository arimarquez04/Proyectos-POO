package cuidarEdu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuidarEdu.Local;
import cuidarEdu.Persona;

class personaTest {

	//Pruebas del Metodo salir()
	
	@Test
	void salirTestSalidas() {
		Persona persona = new Persona("Ariel", 9, 12345678);
		int resultadoEsperado = persona.getSalidas() + 1;
		persona.salir();
		assertEquals(resultadoEsperado, persona.getSalidas());
	}

	//Pruebas del Metodo meAislo()
	
	@Test
	void resultadoTruePorqueLaTemperaturaIngresadaEsMayorA37() {
		Persona persona = new Persona("Ariel", 39);
		assertEquals(true, persona.meAislo());
	}
	
	@Test
	void resultadoFalsePorqueLaemperaturaIngresadaEs37() {
		Persona persona = new Persona("Ariel", 37);
		assertEquals(false, persona.meAislo());
	}
	
	@Test
	void resultadoFalsePorqueLaemperaturaIngresadaEsMenosDe37() {
		Persona persona = new Persona("Ariel", 35);
		assertEquals(false, persona.meAislo());
	}
	
	//Pruebas del Metodo estoyBuscandoAlVirus()
	@Test
	void resultadoTruePorqueLaPersonaTieneMasDe10Salidas() {
		Persona persona = new Persona("Ariel", 15, 12345678);
		assertEquals(true, persona.estoyBuscandoAlVirus());
	}
	
	@Test
	void resultadoFalsePorqueLaPersonaTiene10Salidas() {
		Persona persona = new Persona("Ariel", 10, 12345678);
		assertEquals(false, persona.estoyBuscandoAlVirus());
	}
	
	@Test
	void resultadoFalsePorqueLaPersonaTieneMenosDe10Salidas() {
		Persona persona = new Persona("Ariel", 5, 12345678);
		assertEquals(false, persona.estoyBuscandoAlVirus());
	}
	
	//Pruebas del Metodo puedoSalirAComprar()
	
	@Test
	void ResultadoTruePorqueElMetodoEsEscencialEsTrueYElMetodoMeAisloEsFalse() {
		Persona persona = new Persona("Ariel", 5, 12345678);
		int temperaturaIngresada = 36;
		int dia = 2;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "farmacia");
		assertEquals(true, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
	
	@Test
	void ResultadoTruePorqueElMetodoEsEscencialEsFalsePeroTieneDNIParYElDiaEsParYElMetodoMeAisloEsFalse() {
		Persona persona = new Persona("Ariel", 5, 12345678);
		int temperaturaIngresada = 36;
		int dia = 2;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "entretenimiento");
		assertEquals(true, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
	
	@Test
	void ResultadoTruePorqueElMetodoEsEscencialEsFalsePeroTieneDniImparYElDiaEsImparYElMetodoMeAisloEsFalse() {
		Persona persona = new Persona("Ariel", 5, 12345679);
		int temperaturaIngresada = 36;
		int dia = 3;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "entretenimiento");
		assertEquals(true, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
	
	@Test
	void ResultadoFalsePorqueElMetodoEsEscencialEsFalseYTieneDniImparYElDiaEsParYElMetodoMeAisloEsFalse() {
		Persona persona = new Persona("Ariel", 5, 12345679);
		int temperaturaIngresada = 36;
		int dia = 2;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "entretenimiento");
		assertEquals(false, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
	
	@Test
	void ResultadoFalsePorqueElMetodoEsEscencialEsFalseYTieneDniParYElDiaEsImparYElMetodoMeAisloEsFalse() {
		Persona persona = new Persona("Ariel", 5, 12345678);
		int temperaturaIngresada = 36;
		int dia = 3;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "entretenimiento");
		assertEquals(false, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
	
	@Test
	void ResultadoFalsePorqueElMetodoEsEscencialEsFalseYTieneDniImparYelDiaEsParYElMetodoMeAisloEsTrue() {
		Persona persona = new Persona("Ariel", 5, 12345679);
		int temperaturaIngresada = 40;
		int dia = 2;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "entretenimiento");
		assertEquals(false, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
	
	@Test
	void ResultadoFalsePorqueElMetodoEsEscencialEsFalseYTieneDniParYelDiaEsimparYElMetodoMeAisloEsTrue() {
		Persona persona = new Persona("Ariel", 5, 12345678);
		int temperaturaIngresada = 40;
		int dia = 3;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "entretenimiento");
		assertEquals(false, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
	
	@Test
	void ResultadoFalsePorqueElMetodoEsEscencialEsTruePeroElMetodoMeAisloEsTrue() {
		Persona persona = new Persona("Ariel", 5, 12345678);
		int temperaturaIngresada = 40;
		persona.setTemperatura(temperaturaIngresada);
		int dia = 2;
		Local farmaciaDelOeste = new Local("Farmacia Del Oeste", "farmacia");
		assertEquals(false, persona.puedoSalirAComprar(farmaciaDelOeste, temperaturaIngresada, dia));
	}
}


