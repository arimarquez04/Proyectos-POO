package RendimientoAcademico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptativaTest {

	@Test
	void elPuntajeEsDe100PorqueDura100HorasYSuIndiceDeDificultadEsDe1() {
		Optativa optativa = new Optativa(100, 1);
		assertEquals(100, optativa.puntaje());
	}
	@Test
	void elPuntajeEsDe100PorqueDura50HorasYSuIndiceDeDificultadEsDe2() {
		Optativa optativa = new Optativa(50, 2);
		assertEquals(100, optativa.puntaje());
	}
	@Test
	void elPuntajeEsDe200PorqueDura100HorasYSuIndiceDeDificultadEsDe2() {
		Optativa optativa = new Optativa(100, 2);
		assertEquals(200, optativa.puntaje());
	}
	@Test
	void elPuntajeEsDe300PorqueDura100HorasYSuIndiceDeDificultadEsDe3() {
		Optativa optativa = new Optativa(100, 3);
		assertEquals(300, optativa.puntaje());
	}
	@Test
	void elPuntajeEsDe99PorqueDura33HorasYSuIndiceDeDificultadEsDe3() {
		Optativa optativa = new Optativa(33, 3);
		assertEquals(99, optativa.puntaje());
	}

}
