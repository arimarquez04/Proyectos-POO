package tdj.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import tdj.Libro;
import tdj.Luchador;

class LibroTest {

	// Pruebas del Metodo insectos()
	
	@Test
	void noHayLuchadoresInsectosPorqueNingunoDeLos3EsInsectos() {
		Luchador luchadorNoInsecto = new Luchador("Ariel", 40, 600, true);
		Luchador luchadorNoInsecto2 = new Luchador("Lucas", 30, 600, true);
		Luchador luchadorNoInsecto3 = new Luchador("Javier", 20, 600, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorNoInsecto);
		libro.agregarPersonaje(luchadorNoInsecto2);
		libro.agregarPersonaje(luchadorNoInsecto3);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		assertEquals(resultadoEsperado, libro.insectos());

	}

	@Test
	void hay1LuchadorInsectoPorque1de3LuchadoresEsInsecto() {
		Luchador luchadorNoInsecto = new Luchador("Ariel", 40, 600, true);
		Luchador luchadorNoInsecto2 = new Luchador("Lucas", 30, 600, true);
		Luchador luchadorInsecto = new Luchador("Javier", 20, 350, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorNoInsecto);
		libro.agregarPersonaje(luchadorNoInsecto2);
		libro.agregarPersonaje(luchadorInsecto);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		resultadoEsperado.add(luchadorInsecto);
		assertEquals(resultadoEsperado, libro.insectos());
	}

	@Test
	void hay2LuchadoresInsectoPorque2de3LuchadoresSonInsectos() {
		Luchador luchadorNoInsecto = new Luchador("Ariel", 40, 600, true);
		Luchador luchadorInsecto = new Luchador("Lucas", 30, 350, true);
		Luchador luchadorInsecto2 = new Luchador("Javier", 20, 350, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorNoInsecto);
		libro.agregarPersonaje(luchadorInsecto);
		libro.agregarPersonaje(luchadorInsecto2);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		resultadoEsperado.add(luchadorInsecto);
		resultadoEsperado.add(luchadorInsecto2);
		assertEquals(resultadoEsperado, libro.insectos());
	}

	@Test
	void hay3LuchadoresInsectorPorque3de3LuchadoresSonInsectos() {
		Luchador luchadorInsecto = new Luchador("Ariel", 40, 350, true);
		Luchador luchadorInsecto2 = new Luchador("Lucas", 30, 350, true);
		Luchador luchadorInsecto3 = new Luchador("Javier", 20, 350, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorInsecto);
		libro.agregarPersonaje(luchadorInsecto2);
		libro.agregarPersonaje(luchadorInsecto3);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		resultadoEsperado.add(luchadorInsecto);
		resultadoEsperado.add(luchadorInsecto2);
		resultadoEsperado.add(luchadorInsecto3);
		assertEquals(resultadoEsperado, libro.insectos());
	}

	
	// Pruebas del Metodo luchadoresQuePuedenGanarleAJCVD()
	
	@Test
	void ningunLuchadorDe3PuedeGanarleAJCVD() {
		Luchador luchadorQueNoPuedeGanarle = new Luchador("Ariel", 10, 20, true);
		Luchador luchadorQueNoPuedeGanarle2 = new Luchador("Lucas", 10, 20, true);
		Luchador luchadorQueNoPuedeGanarle3 = new Luchador("Javier", 10, 20, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQueNoPuedeGanarle);
		libro.agregarPersonaje(luchadorQueNoPuedeGanarle2);
		libro.agregarPersonaje(luchadorQueNoPuedeGanarle3);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		int superarValor = 30;
		assertEquals(resultadoEsperado, libro.losChuckNorris(superarValor));
	}
	
	@Test
	void unLuchadorDe3PuedeGanarleAJCVD() {
		Luchador luchadorQuePuedeGanarle = new Luchador("Ariel", 30, 500, true);
		Luchador luchadorQueNoPuedeGanarle = new Luchador("Lucas", 10, 20, true);
		Luchador luchadorQueNoPuedeGanarle2 = new Luchador("Javier", 10, 20, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePuedeGanarle);
		libro.agregarPersonaje(luchadorQueNoPuedeGanarle);
		libro.agregarPersonaje(luchadorQueNoPuedeGanarle2);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		resultadoEsperado.add(luchadorQuePuedeGanarle);
		int superarValor = 30;
		assertEquals(resultadoEsperado, libro.losChuckNorris(superarValor));
	}
	
	@Test
	void dosLuchadoresDe3PuedenGanarleAJCVD() {
		Luchador luchadorQuePuedeGanarle = new Luchador("Ariel", 30, 500, true);
		Luchador luchadorQuePuedeGanarle2 = new Luchador("Lucas", 40, 500, true);
		Luchador luchadorQueNoPuedeGanarle = new Luchador("Javier", 10, 20, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePuedeGanarle);
		libro.agregarPersonaje(luchadorQuePuedeGanarle2);
		libro.agregarPersonaje(luchadorQueNoPuedeGanarle);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		resultadoEsperado.add(luchadorQuePuedeGanarle);
		resultadoEsperado.add(luchadorQuePuedeGanarle2);
		int superarValor = 30;
		assertEquals(resultadoEsperado, libro.losChuckNorris(superarValor));
	}
	
	@Test
	void tresDe3LuchadoresPuedenGanarleAJCVD() {
		Luchador luchadorQuePuedeGanarle = new Luchador("Ariel", 40, 500, true);
		Luchador luchadorQuePuedeGanarle2 = new Luchador("Lucas", 30, 500, true);
		Luchador luchadorQuePuedeGanarle3 = new Luchador("Javier", 20, 500, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePuedeGanarle);
		libro.agregarPersonaje(luchadorQuePuedeGanarle2);
		libro.agregarPersonaje(luchadorQuePuedeGanarle3);
		ArrayList<Luchador> resultadoEsperado = new ArrayList<Luchador>();
		resultadoEsperado.add(luchadorQuePuedeGanarle);
		resultadoEsperado.add(luchadorQuePuedeGanarle2);
		resultadoEsperado.add(luchadorQuePuedeGanarle3);
		int superarValor = 30;
		assertEquals(resultadoEsperado, libro.losChuckNorris(superarValor));
	}
	
	
	//Pruebas del Metodo hayUnJiuJitsu()
	
	@Test
	void resultadoFalsePorqueNoHayLuchadoresQuePractiquenJiuJitsu() {
		Luchador luchadorQueNoPracticaJiuJitsu = new Luchador("Ariel", 40, 500, false);
		Luchador luchadorQueNoPracticaJiuJitsu2 = new Luchador("Lucas", 30, 500, false);
		Luchador luchadorQueNoPracticaJiuJitsu3 = new Luchador("Javier", 20, 500, false);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu2);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu3);
		assertEquals(false, libro.hayUnJiuJitsu());
	}
	
	@Test
	void resultadoTruePorqueHay1Luchadorde3LuchadoresQuePracticaJiuJitsu() {
		Luchador luchadorQuePracticaJiuJitsu = new Luchador("Ariel", 40, 500, true);
		Luchador luchadorQueNoPracticaJiuJitsu = new Luchador("Lucas", 30, 500, false);
		Luchador luchadorQueNoPracticaJiuJitsu2 = new Luchador("Javier", 20, 500, false);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu2);
		assertEquals(true, libro.hayUnJiuJitsu());
	}
	
	@Test
	void resultadoTruePorqueHay2LuchadoresDe3LuchadoresQuePracticanJiuJitsu() {
		Luchador luchadorQuePracticaJiuJitsu = new Luchador("Ariel", 40, 500, true);
		Luchador luchadorQuePracticaJiuJitsu2 = new Luchador("Lucas", 30, 500, true);
		Luchador luchadorQueNoPracticaJiuJitsu = new Luchador("Javier", 20, 500, false);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu2);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu);
		assertEquals(true, libro.hayUnJiuJitsu());
	}
	
	@Test
	void resultadoTruePorqueHay3LuchadoresDe3LuchadoresQuePracticanJiuJitsu() {
		Luchador luchadorQuePracticaJiuJitsu = new Luchador("Ariel", 40, 500, true);
		Luchador luchadorQuePracticaJiuJitsu2 = new Luchador("Lucas", 30, 500, true);
		Luchador luchadorQuePracticaJiuJitsu3 = new Luchador("Javier", 20, 500, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu2);
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu3);
		assertEquals(true, libro.hayUnJiuJitsu());
	}
	
	
	//Pruebas del Metodo laCantidadDeJiuJitsus()
	
	@Test
	void ningunLuchadorDe3LuchadoresPracticaJiuJitsu() {
		Luchador luchadorQueNoPracticaJiuJitsu = new Luchador("Ariel", 40, 500, false);
		Luchador luchadorQueNoPracticaJiuJitsu2 = new Luchador("Lucas", 30, 500, false);
		Luchador luchadorQueNoPracticaJiuJitsu3 = new Luchador("Javier", 20, 500, false);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu2);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu3);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, libro.laCantidadDeJiuJitsus());
	}
	
	@Test
	void unLuchadorDe3LuchadoresPracticaJiuJitsu() {
		Luchador luchadorQuePracticaJiuJitsu = new Luchador("Ariel", 40, 500, true);
		Luchador luchadorQueNoPracticaJiuJitsu = new Luchador("Lucas", 30, 500, false);
		Luchador luchadorQueNoPracticaJiuJitsu2 = new Luchador("Javier", 20, 500, false);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu2);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, libro.laCantidadDeJiuJitsus());
	}
	
	@Test
	void dosDe3LuchadoresPracticanJiujitsu() {
		Luchador luchadorQuePracticaJiuJitsu = new Luchador("Ariel", 40, 500, true);
		Luchador luchadorQuePracticaJiuJitsu2 = new Luchador("Lucas", 30, 500, true);
		Luchador luchadorQueNoPracticaJiuJitsu = new Luchador("Javier", 20, 500, false);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu2);
		libro.agregarPersonaje(luchadorQueNoPracticaJiuJitsu);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, libro.laCantidadDeJiuJitsus());
	}
	
	@Test
	void tresDe3LuchadoresPracticanJiuJitsu() {
		Luchador luchadorQuePracticaJiuJitsu = new Luchador("Ariel", 40, 500, true);
		Luchador luchadorQuePracticaJiuJitsu2 = new Luchador("Lucas", 30, 500, true);
		Luchador luchadorQuePracticaJiuJitsu3 = new Luchador("Javier", 20, 500, true);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu);
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu2);
		libro.agregarPersonaje(luchadorQuePracticaJiuJitsu3);
		int resultadoEsperado = 3;
		assertEquals(resultadoEsperado, libro.laCantidadDeJiuJitsus());
	}
}
