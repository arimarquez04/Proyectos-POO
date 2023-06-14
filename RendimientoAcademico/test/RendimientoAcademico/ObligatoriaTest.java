package RendimientoAcademico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObligatoriaTest {

	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YRecursoYelA�oEsDe1() {
		Obligatoria obligatoria = new Obligatoria();
		obligatoria.setPuntajebase(100);
		obligatoria.setRecurso(true);
		obligatoria.setA�oDeCarrera(1);
		assertEquals(100, obligatoria.puntaje());
		
	}
	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YRecursoYelA�oEsDe2() {
		Obligatoria obligatoria = new Obligatoria();
		obligatoria.setPuntajebase(100);
		obligatoria.setRecurso(true);
		obligatoria.setA�oDeCarrera(2);
		assertEquals(100, obligatoria.puntaje());
		
	}
	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YRecursoYelA�oEsDe3(){
		Obligatoria obligatoria = new Obligatoria();
		obligatoria.setPuntajebase(100);
		obligatoria.setRecurso(true);
		obligatoria.setA�oDeCarrera(3);
		assertEquals(100, obligatoria.puntaje());	
	}
	@Test
	void elPuntajeEsDe100PorqueElPuntajeBaseEsDe100YNoRecursoYElA�oDeCarreraEs1() {
		Obligatoria obligatoria = new Obligatoria(100, false, 1);
		assertEquals(100, obligatoria.puntaje());
	}
	@Test
	void elPuntajeEsDe200PorqueElPuntajeBaseEsDe100YNoRecursoYElA�oDeCarreraEs2() {
		Obligatoria obligatoria = new Obligatoria(100, false, 2);
		assertEquals(200, obligatoria.puntaje());
	}
	
}
