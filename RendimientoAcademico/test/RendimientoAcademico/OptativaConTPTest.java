package RendimientoAcademico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptativaConTPTest {

	@Test
	void elPuntajeEsDe110PorqueDura100HorasYSuIndiceDeDificultadEsDe1() {
		OptativaConTP op = new OptativaConTP(100, 1);
		assertEquals(110, op.puntaje());
	}

	@Test
	void elPuntajeEsDe110PorqueDura50HorasYSuIndiceDeDificultadEsDe2() {
		OptativaConTP op = new OptativaConTP(50, 2);
		assertEquals(110, op.puntaje());
	}
	@Test
	void elPuntajeEsDe210PorqueDura100HorasYSuIndiceDeDificultadEsDe2() {
		OptativaConTP op = new OptativaConTP(100, 2);
		assertEquals(210, op.puntaje());
	}
	@Test
	void elPuntajeEsDe310PorqueDura100HorasYSuIndiceDeDificultadEsDe3() {
		OptativaConTP op = new OptativaConTP(100, 3);
		assertEquals(310, op.puntaje());
	}
	@Test
	void elPuntajeEsDe109PorqueDura33HorasYSuIndiceDeDificultadEsDe3() {
		OptativaConTP op = new OptativaConTP(33, 3);
		assertEquals(109, op.puntaje());
	}
}
