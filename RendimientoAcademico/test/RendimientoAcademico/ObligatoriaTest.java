package RendimientoAcademico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObligatoriaTest {

	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YRecursoYelAñoEsDe1() {
		Obligatoria obligatoria = new Obligatoria();
		obligatoria.setPuntajebase(100);
		obligatoria.setRecurso(true);
		obligatoria.setAñoDeCarrera(1);
		assertEquals(100, obligatoria.puntaje());
		
	}
	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YRecursoYelAñoEsDe2() {
		Obligatoria obligatoria = new Obligatoria();
		obligatoria.setPuntajebase(100);
		obligatoria.setRecurso(true);
		obligatoria.setAñoDeCarrera(2);
		assertEquals(100, obligatoria.puntaje());
		
	}
	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YRecursoYelAñoEsDe3(){
		Obligatoria obligatoria = new Obligatoria();
		obligatoria.setPuntajebase(100);
		obligatoria.setRecurso(true);
		obligatoria.setAñoDeCarrera(3);
		assertEquals(100, obligatoria.puntaje());	
	}
	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YNoRecursoYElAñoDeCarreraEs1() {
		Obligatoria obligatoria = new Obligatoria(100, false, 1);
		assertEquals(100, obligatoria.puntaje());
	}
	@Test
	void elPuntajeEsDe200PorqueElPuntajeBaseEsDe100YNoRecursoYElAñoDeCarreraEs2() {
		Obligatoria obligatoria = new Obligatoria(100, false, 2);
		assertEquals(200, obligatoria.puntaje());
	}
	
}
