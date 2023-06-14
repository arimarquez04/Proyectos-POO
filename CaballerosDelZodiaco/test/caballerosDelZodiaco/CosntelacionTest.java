package caballerosDelZodiaco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CosntelacionTest {

	// Pruebas del Metodo estaCercanaAlSol()
	
	@Test
	void truePorqueSuDistanciaAlSolEsMenorQueLaConstante() {
	Constelacion constelacionCercanaAlSol = new Constelacion(5000);
	assertEquals(true, constelacionCercanaAlSol.estaCercanaAlSol());
	}
	
	@Test
	void falsePorqueSuDistanciaAlSolEsIgualQueLaConstante() {
	Constelacion constelacionCercanaAlSol = new Constelacion(1000000000);
	assertEquals(false, constelacionCercanaAlSol.estaCercanaAlSol());
	}

	@Test
	void falsePorqueSuDistanciaAlSolEsMayorALaConstante() {
		Constelacion constelacionCercanaAlSol = new Constelacion(1500000000);
		assertEquals(false, constelacionCercanaAlSol.estaCercanaAlSol());
		}
}
