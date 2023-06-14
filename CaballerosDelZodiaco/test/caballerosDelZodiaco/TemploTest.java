package caballerosDelZodiaco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TemploTest {

	//Pruebas del metodo caballerosPrecoces()
	
	@Test
	void elPortentajeEsDe0PorcientoPorqueNingunCaballeroDe4EsPrecoz() {
		Caballero caballeroNoPrecoz = new Caballero(20);
		Caballero caballeroNoPrecoz2 = new Caballero(22);
		Caballero caballeroNoPrecoz3 = new Caballero(30);
		Caballero caballeroNoPrecoz4 = new Caballero(25);
		Templo templo = new Templo();
		templo.agregarCaballero(caballeroNoPrecoz);
		templo.agregarCaballero(caballeroNoPrecoz2);
		templo.agregarCaballero(caballeroNoPrecoz3);
		templo.agregarCaballero(caballeroNoPrecoz4);
		double resultadoEsperado = 0;
		assertEquals(resultadoEsperado, templo.caballerosPrecocesPorcentaje());
	}
	
	@Test
	void elPorcentajeEsDe50PorcientoPorqueSolo2De4CaballerosSonPrecoces() {
		Caballero caballeroPrecoz = new Caballero(11);
		Caballero caballeroPrecoz2 = new Caballero(10);
		Caballero caballeroNoPrecoz = new Caballero(20);
		Caballero caballeroNoPrecoz2 = new Caballero(22);
		Templo templo = new Templo();
		templo.agregarCaballero(caballeroPrecoz);
		templo.agregarCaballero(caballeroPrecoz2);
		templo.agregarCaballero(caballeroNoPrecoz);
		templo.agregarCaballero(caballeroNoPrecoz2);
		double resultadoEsperado = 50;
		assertEquals(resultadoEsperado, templo.caballerosPrecocesPorcentaje());
	}

	@Test
	void elPorcentajeEsDe25PorcientoPorqueSolo1De4CaballerosSonPrecoces() {
		Caballero caballeroPrecoz = new Caballero(11);
		Caballero caballeroNoPrecoz = new Caballero(20);
		Caballero caballeroNoPrecoz2 = new Caballero(22);
		Caballero caballeroNoPrecoz3 = new Caballero(30);
		Templo templo = new Templo();
		templo.agregarCaballero(caballeroPrecoz);
		templo.agregarCaballero(caballeroNoPrecoz);
		templo.agregarCaballero(caballeroNoPrecoz2);
		templo.agregarCaballero(caballeroNoPrecoz3);
		double resultadoEsperado = 25;
		assertEquals(resultadoEsperado, templo.caballerosPrecocesPorcentaje());
	}
	
	@Test
	void elPorcentajeEsDe75PorcientoPorqueSolo3De4CaballerosSonPrecoces() {
		Caballero caballeroPrecoz = new Caballero(11);
		Caballero caballeroPrecoz2 = new Caballero(10);
		Caballero caballeroPrecoz3 = new Caballero(9);
		Caballero caballeroNoPrecoz = new Caballero(20);
		Templo templo = new Templo();
		templo.agregarCaballero(caballeroPrecoz);
		templo.agregarCaballero(caballeroPrecoz2);
		templo.agregarCaballero(caballeroPrecoz3);
		templo.agregarCaballero(caballeroNoPrecoz);
		double resultadoEsperado = 75;
		assertEquals(resultadoEsperado, templo.caballerosPrecocesPorcentaje());
	}
	
	@Test
	void elPorcentajeEsDe100PorcientoPorque4De4CaballerosSonPrecoces() {
		Caballero caballeroPrecoz = new Caballero(11);
		Caballero caballeroPrecoz2 = new Caballero(10);
		Caballero caballeroPrecoz3 = new Caballero(9);
		Caballero caballeroPrecoz4 = new Caballero(8);
		Templo templo = new Templo();
		templo.agregarCaballero(caballeroPrecoz);
		templo.agregarCaballero(caballeroPrecoz2);
		templo.agregarCaballero(caballeroPrecoz3);
		templo.agregarCaballero(caballeroPrecoz4);
		double resultadoEsperado = 100;
		assertEquals(resultadoEsperado, templo.caballerosPrecocesPorcentaje());
	}
	
	//Pruebas del Metodo caballerosPoderosos()
	
	
}
