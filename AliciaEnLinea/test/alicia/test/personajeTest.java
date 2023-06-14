package alicia.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import alicia.Personaje;

class personajeTest {

	// Pruebas del Metodo esLindo()
	@Test
	void elPersonajeEsLindoPorqueEstaEnMaravillaYTieneLaLinduraNecesaria() {
		Personaje.setMaximoLocura(500);
		Personaje p1 = new Personaje("Ariel", 499, 199, -1);
		assertEquals(true, p1.esLindo());
	}

	@Test
	void elPersonajeNoEsLindoPorqueTieneMenosLocuraDeLaNecesariaAunqueEsteEnMaravilla() {
		Personaje.setMaximoLocura(500);
		Personaje p1 = new Personaje("Ariel", 190, 199, -1);
		assertEquals(false, p1.esLindo());
	}

	@Test
	void elPersonajeNoesLindoPorqueNoEstaEnMaravillaAunqueTengaLaLinduraNecesaria() {
		Personaje.setMaximoLocura(500);
		Personaje p1 = new Personaje("Ariel", 499, 199, 1);
		assertEquals(false, p1.esLindo());
	}

	@Test
	void elPersonajeNoEsLindoPorqueNoTieneLaLinduraNecesariaYNoEstaEnMaravilla() {
		Personaje.setMaximoLocura(500);
		Personaje p1 = new Personaje("Ariel", 190, 199, 1);
		assertEquals(false, p1.esLindo());
	}

	@Test
	void elPersonajeNoEsLindoAunqueEsteEnMaravillaPeroTiene75PorcientoDeLocura() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 75, 199, -1);
		assertEquals(false, p1.esLindo());
	}

	@Test
	void elPersonajeNoEsLindoPorqueNoEstaEnMaravillaPeroTiene75PorcientoDeLocura() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 75, 199, 1);
		assertEquals(false, p1.esLindo());
	}

	// Pruebas del Metodo embellecer()
	@Test
	void embellecerElPersonajeTestSecretos() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 75, 199, -1);
		p1.embellecer(10);
		assertEquals(189, p1.getSecretos());
	}

	@Test
	void embellecerElPersonajeTestLocura() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 75, 199, -1);
		int aumentarLocura = 10;
		p1.embellecer(aumentarLocura);
		assertEquals(75 + aumentarLocura, p1.getLocura());
	}

	// PRuebas del Metodo esMaravilla()
	@Test
	void elPersonajeEstaEnMaravilla() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 75, 199, -1);
		assertEquals(true, p1.esMaravilla());
	}

	@Test
	void elPersonajeNoEstaEnMaravilla() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 75, 199, 1);
		assertEquals(false, p1.esMaravilla());

	}

	//Pruebas del Metodo esMaravilla()
	@Test
	void elPersonajeEsNormalPorqueTieneMenosDe10LocuraYMasDe500Secretos() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 9, 600, 1);
		assertEquals(true, p1.esNormal());
	}

	@Test
	void elPersonajeNoEsNormalPorqueTieneMasDe10LocurasAunqueTieneMenosDe500Secretos() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 15, 199, 1);
		assertEquals(false, p1.esNormal());
	}

	@Test
	void elPersonajeNoEsNormalPorqueTieneMasDe10LocuraAunqueTieneMasDe500Secretos() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 15, 600, 1);
		assertEquals(false, p1.esNormal());
	}

	@Test
	void elPersonajeEsNormalPorqueTieneMenosDe10LocuraY500Secretos() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 9, 500, 1);
		assertEquals(true, p1.esNormal());
	}

	@Test
	void elPersonajeNoEsNormalPorqueTiene10LocuraY500Secretos() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 10, 500, 1);
		assertEquals(false, p1.esNormal());
	}

	@Test
	void elPersonajeNoEsNormalPorqueTiene10LocuraYMenosDe500Secretos() {
		Personaje.setMaximoLocura(100);
		Personaje p1 = new Personaje("Ariel", 10, 500, 1);
		assertEquals(false, p1.esNormal());
	}

}

