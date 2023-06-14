package alicia.test;

import java.sql.Array;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import alicia.Libro;
import alicia.Personaje;

class libroTest {

	// Pruebas del Metodo hayNormal()
	@Test
	void hayNormalPorqueExisteUnPersonajeNormal() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje p1 = new Personaje("Ariel", 9, 599, -1);
		Personaje p2 = new Personaje("Lucas", 299, 399, -1);
		Personaje p3 = new Personaje("Javier", 499, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(p1);
		libro.agregarPersonaje(p2);
		libro.agregarPersonaje(p3);
		assertEquals(true, libro.hayNormal());
	}

	@Test
	void hayNormalPorqueExisteMasDe1PersonajeNormal() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 9, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 8, 599, -1);
		Personaje pNoLindo = new Personaje("Javier", 499, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(pNoLindo);
		assertEquals(true, libro.hayNormal());
	}

	@Test
	void noHayNormalesPorqueNoExisteUnPersonajeNormal() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 299, 399, -1);
		Personaje pNoLindo = new Personaje("Javier", 499, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(pNoLindo);
		assertEquals(false, libro.hayNormal());
	}

	// Pruebas del metodo personaesLindos()
	@Test
	void unSoloPersonajeDe3EsLindo() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje pNoLindo = new Personaje("Lucas", 90, 599, -1);
		Personaje pNoLindo2 = new Personaje("Javier", 99, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(pNoLindo);
		libro.agregarPersonaje(pNoLindo2);
		ArrayList<Personaje> resultadoEsperado = new ArrayList<Personaje>();
		resultadoEsperado.add(pLindo);
		assertEquals(resultadoEsperado, libro.personajesLindos());
	}

	@Test
	void dosPersonajesDe3SonPersonajesLindos() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 490, 599, -1);
		Personaje pNoLindo = new Personaje("Javier", 99, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(pNoLindo);
		ArrayList<Personaje> resultadoEsperado = new ArrayList<Personaje>();
		resultadoEsperado.add(pLindo);
		resultadoEsperado.add(p2Lindo);
		assertEquals(resultadoEsperado, libro.personajesLindos());
	}

	@Test
	void ningunPersonajeDe3EsLindo() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pNoLindo = new Personaje("Ariel", 99, 599, -1);
		Personaje pNoLindo2 = new Personaje("Lucas", 90, 599, -1);
		Personaje pNoLindo3 = new Personaje("Javier", 99, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pNoLindo);
		libro.agregarPersonaje(pNoLindo2);
		libro.agregarPersonaje(pNoLindo3);
		ArrayList<Personaje> resultadoEsperado = new ArrayList<Personaje>();
		assertEquals(resultadoEsperado, libro.personajesLindos());
	}

	// Pruebas del metodo cantidadDePersonajesEnMaravilla()
	@Test
	void laCantidadDePersonajesEnMaravillaEs0() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, 1);
		Personaje p2Lindo = new Personaje("Lucas", 299, 399, 1);
		Personaje pNoLindo = new Personaje("Javier", 499, 299, 1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(pNoLindo);
		assertEquals(0, libro.CantidadPersonajesEnMaravilla());
	}

	@Test
	void laCantidadDePersonajesEnMaravillaEs1() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 299, 399, 1);
		Personaje pNoLindo = new Personaje("Javier", 499, 299, 1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(pNoLindo);
		assertEquals(1, libro.CantidadPersonajesEnMaravilla());
	}

	@Test
	void laCantidadDePersonajesEnMaravillaEs3() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 299, 399, -1);
		Personaje pNoLindo = new Personaje("Javier", 499, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(pNoLindo);
		assertEquals(3, libro.CantidadPersonajesEnMaravilla());
	}

	// Pruebas del metodo mayorCantidadDeLocura
	@Test
	void p1EsElPersonajeConMayorCantidadDeLocura() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje p1 = new Personaje("Ariel", 499, 599, -1);
		Personaje p2 = new Personaje("Lucas", 299, 399, -1);
		Personaje p3 = new Personaje("Javier", 400, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(p1);
		libro.agregarPersonaje(p2);
		libro.agregarPersonaje(p3);
		assertEquals(p1, libro.mayorCantidadDeLocura());
	}

	@Test
	void p2EsElPersonajeConMayorCantidadDeLocura() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje p1 = new Personaje("Ariel", 299, 599, -1);
		Personaje p2 = new Personaje("Lucas", 599, 399, -1);
		Personaje p3 = new Personaje("Javier", 400, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(p1);
		libro.agregarPersonaje(p2);
		libro.agregarPersonaje(p3);
		assertEquals(p2, libro.mayorCantidadDeLocura());
	}

	@Test
	void p3EsElPersonajeConMayorCantidadDeLocura() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje p1 = new Personaje("Ariel", 299, 599, -1);
		Personaje p2 = new Personaje("Lucas", 299, 399, -1);
		Personaje p3 = new Personaje("Javier", 499, 299, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(p1);
		libro.agregarPersonaje(p2);
		libro.agregarPersonaje(p3);
		assertEquals(p3, libro.mayorCantidadDeLocura());
	}

	// Pruebas del Metodo masLindosQueNormales
	@Test
	void hayMasPersonajesLindosQueNormalesPorqueHay2LindosY1Normal() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 499, 399, -1);
		Personaje pNormal = new Personaje("Javier", 9, 560, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(pNormal);
		assertEquals(true, libro.masLindosQueNormales());
	}

	@Test
	void hayMasPersonajesLindosQueNormalesPorqueHay3LindosY0Normal() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 499, 399, -1);
		Personaje p3Lindo = new Personaje("Javier", 499, 560, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(p3Lindo);
		assertEquals(true, libro.masLindosQueNormales());
	}

	@Test
	void noHayMasPersonajesLindosQueNormalesPorqueHay0LindosY3Normales() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 99, 599, -1);
		Personaje p2Lindo = new Personaje("Lucas", 99, 599, -1);
		Personaje p3Lindo = new Personaje("Javier", 99, 560, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(p2Lindo);
		libro.agregarPersonaje(p3Lindo);
		assertEquals(false, libro.masLindosQueNormales());
	}

	
	@Test
	void noHayMasPersonajesLindosQueNormalesPorqueHay1LindoY2Normales() {
		int maximoDeLocura = 500;
		Personaje.setMaximoLocura(maximoDeLocura);
		Personaje pLindo = new Personaje("Ariel", 499, 599, -1);
		Personaje pNormal = new Personaje("Lucas", 9, 599, -1);
		Personaje p2Normal = new Personaje("Javier", 9, 560, -1);
		Libro libro = new Libro();
		libro.agregarPersonaje(pLindo);
		libro.agregarPersonaje(pNormal);
		libro.agregarPersonaje(p2Normal);
		assertEquals(false, libro.masLindosQueNormales());
	}
}
