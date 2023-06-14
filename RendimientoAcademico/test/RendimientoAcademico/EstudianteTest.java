package RendimientoAcademico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstudianteTest {

	//Pruebas del Metodo esViejoYLaburante()
	@Test
	void truePorqueTrabajaEIngresoHace12Años() {
		Estudiante estudiante = new Estudiante(true, 2010);
		assertEquals(true, estudiante.esViejoYLaburante());
	}
	@Test
	void falsePorqueTrabajaPeroIngresoHace2Años() {
		Estudiante estudiante = new Estudiante(true, 2020);
		assertEquals(false, estudiante.esViejoYLaburante());
	}
	@Test
	void falsePorqueNoTrabajaAunqueIngresoHace12Años() {
		Estudiante estudiante = new Estudiante(false, 2010);
		assertEquals(false, estudiante.esViejoYLaburante());
	}
	@Test
	void falsePorqueIngresoHace10AñosAunqueTrabaje() {
		Estudiante estudiante = new Estudiante(true, 2012);
		assertEquals(false, estudiante.esViejoYLaburante());
	}
	@Test
	void falsePorqueIngresoHace10AñosYNoTrabaja() {
		Estudiante estudiante = new Estudiante(true, 2012);
		assertEquals(false, estudiante.esViejoYLaburante());
	}

	
	//Pruebas del Metodo contarPuntaje
	@Test
	void tieneUnPuntajeDE0PorqueNoTieneMaterias() {
		Estudiante e = new Estudiante(true);
		assertEquals(0, e.contarPuntaje());
	}
	@Test 
	void tieneUnPuntajeDe100PorqueTiene1SolaMateriaObligatoriaQueTienePuntajeBasicoDe100QueNoRecursoQueEstaEn1erAño() {
		Estudiante e = new Estudiante(true);
		Obligatoria o = new Obligatoria(100, false, 1);
		e.agregarMaterias(o);
		assertEquals(100, e.contarPuntaje());
	}
	@Test 
	void tieneUnPuntajeDePorqueTiene1MateriaObligatoriaQueTienePuntajeBasicoDe100NoRecursoQueEstaEn2doAñoYTiene3MateriasOptaivasQueDuran10HorasYTienenUnNivelSuperiorCadaUnaYUnaMateriOptativaCOnTPQueDura10HorasYTieneDificultad1() {
		Estudiante e = new Estudiante(true);
		Obligatoria o = new Obligatoria(100, false, 2);
		Optativa optativa1 = new Optativa(10, 1);
		Optativa optativa2 = new Optativa(10, 2);
		Optativa optativa3 = new Optativa(10, 3);
		OptativaConTP optativaConTP = new OptativaConTP(10, 1);
		e.agregarMaterias(o);
		e.agregarMaterias(optativa1);
		e.agregarMaterias(optativa2);
		e.agregarMaterias(optativa3);
		e.agregarMaterias(optativaConTP);
		assertEquals(280, e.contarPuntaje());
	}
	@Test
	void obligatoria() {
		Obligatoria o = new Obligatoria(100, false, 2);
		Estudiante e = new Estudiante(true);
		e.agregarMaterias(o);
		assertEquals(200, e.contarPuntaje());

	}
	@Test
	void optativas() {
		Estudiante e = new Estudiante(true);
		Optativa optativa1 = new Optativa(10, 1);
		Optativa optativa2 = new Optativa(10, 2);
		Optativa optativa3 = new Optativa(10, 3);
		e.agregarMaterias(optativa1);
		e.agregarMaterias(optativa2);
		e.agregarMaterias(optativa3);
		assertEquals(60, e.contarPuntaje());
	}
	@Test
	void optativasConTP() {
		Estudiante e = new Estudiante(true);
		OptativaConTP optativaConTP = new OptativaConTP(10, 1);
		e.agregarMaterias(optativaConTP);
		assertEquals(20, e.contarPuntaje());
	}
	
	//Pruebas del Metodo superarParametro()
	@Test
	void falsePorquenoSuperaElParametroPorqueTieneMenorPuntajeDelNecesario() {
		Estudiante estudiante = new Estudiante(true);
		int parametroSuperar = 110;
		Obligatoria obligatoria = new Obligatoria(100, false, 1);
		estudiante.agregarMaterias(obligatoria);
		assertEquals(false, estudiante.superarParametro(parametroSuperar));
	}
	@Test 
	void falsePorquenoSuperaElParametroPorqueTieneIgualPuntajeDelNecesario() {
		Estudiante estudiante = new Estudiante(true);
		int parametroSuperar = 100;
		Obligatoria obligatoria = new Obligatoria(100, false, 1);
		estudiante.agregarMaterias(obligatoria);
		assertEquals(false, estudiante.superarParametro(parametroSuperar));
	}
	@Test
	void TruePorquesuperaElParametroPorqueTieneMasPuntajeDeNecesario() {
		Estudiante estudiante = new Estudiante(true);
		int parametroSuperar = 90;
		Obligatoria obligatoria = new Obligatoria(100, false, 1);
		estudiante.agregarMaterias(obligatoria);
		assertEquals(true, estudiante.superarParametro(parametroSuperar));
	}
}
