package laDesolacionDeHoracio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ProyectoTest {

	// Pruebas del metodo minutoPagani()
	@Test
	void elPrimerDesarrolladorDe4EsElQueTieneMayorPreferenciaPorRiquelme() {
		Desarrollador desarrolladorConMayorPreferencia = new Desarrollador(10);
		Desarrollador desarrollador = new Desarrollador(8);
		Desarrollador desarrollador2 = new Desarrollador(6);
		Desarrollador desarrollador3 = new Desarrollador(7);
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConMayorPreferencia);
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrollador3);
		assertEquals(desarrolladorConMayorPreferencia, proyecto.MinutoPagani());
	}

	@Test
	void elSegundoDesarrolladorDe4EsElQueTieneMayorPreferenciaPorRiquelme() {
		Desarrollador desarrollador = new Desarrollador(8);
		Desarrollador desarrolladorConMayorPreferencia = new Desarrollador(10);
		Desarrollador desarrollador2 = new Desarrollador(6);
		Desarrollador desarrollador3 = new Desarrollador(7);
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrolladorConMayorPreferencia);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrollador3);
		assertEquals(desarrolladorConMayorPreferencia, proyecto.MinutoPagani());
	}

	@Test
	void elTercerDesarrolladorDe4EsElQueTieneMayorPreferenciaPorRiquelme() {
		Desarrollador desarrollador = new Desarrollador(8);
		Desarrollador desarrollador2 = new Desarrollador(6);
		Desarrollador desarrolladorConMayorPreferencia = new Desarrollador(10);
		Desarrollador desarrollador3 = new Desarrollador(7);
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrolladorConMayorPreferencia);
		proyecto.asignarDesarrollador(desarrollador3);
		assertEquals(desarrolladorConMayorPreferencia, proyecto.MinutoPagani());
	}

	@Test
	void elCuartoDesarrolladorDe4EsElQueTieneMayorPreferenciaPorRiquelme() {
		Desarrollador desarrollador = new Desarrollador(8);
		Desarrollador desarrollador2 = new Desarrollador(6);
		Desarrollador desarrollador3 = new Desarrollador(7);
		Desarrollador desarrolladorConMayorPreferencia = new Desarrollador(10);
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrollador3);
		proyecto.asignarDesarrollador(desarrolladorConMayorPreferencia);
		assertEquals(desarrolladorConMayorPreferencia, proyecto.MinutoPagani());
	}

	// Pruebas del metodo desarrolladoresConLesionesCronicas()
	@Test
	void ceroDesarrolladoresde4TienenLesionenCronicas() {
		Desarrollador desarrollador = new Desarrollador();
		Desarrollador desarrollador2 = new Desarrollador();
		Desarrollador desarrollador3 = new Desarrollador();
		Desarrollador desarrollador4 = new Desarrollador();
		ArrayList<Desarrollador> resultadoEsperado = new ArrayList<Desarrollador>();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrollador3);
		proyecto.asignarDesarrollador(desarrollador4);
		assertEquals(resultadoEsperado, proyecto.desarrolladoresConLesionesCronicas());
	}

	@Test
	void unDesarrolladorde4TienenLesionenCronicas() {
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrollador = new Desarrollador();
		Desarrollador desarrollador2 = new Desarrollador();
		Desarrollador desarrollador3 = new Desarrollador();
		ArrayList<Desarrollador> resultadoEsperado = new ArrayList<Desarrollador>();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrollador3);
		resultadoEsperado.add(desarrolladorConLesionCronica);
		assertEquals(resultadoEsperado, proyecto.desarrolladoresConLesionesCronicas());
	}

	@Test
	void dosDesarrolladoresDe4TienenLesionenCronicas() {
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica2 = new Desarrollador();
		desarrolladorConLesionCronica2.agregarLesionAlRegistro(lesion);
		Desarrollador desarrollador = new Desarrollador();
		Desarrollador desarrollador2 = new Desarrollador();
		ArrayList<Desarrollador> resultadoEsperado = new ArrayList<Desarrollador>();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica2);
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		resultadoEsperado.add(desarrolladorConLesionCronica);
		resultadoEsperado.add(desarrolladorConLesionCronica2);
		assertEquals(resultadoEsperado, proyecto.desarrolladoresConLesionesCronicas());
	}

	@Test
	void tresDesarrolladoresDe4TienenLesionenCronicas() {
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica2 = new Desarrollador();
		desarrolladorConLesionCronica2.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica3 = new Desarrollador();
		desarrolladorConLesionCronica3.agregarLesionAlRegistro(lesion);
		Desarrollador desarrollador = new Desarrollador();
		ArrayList<Desarrollador> resultadoEsperado = new ArrayList<Desarrollador>();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica2);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica3);
		proyecto.asignarDesarrollador(desarrollador);
		resultadoEsperado.add(desarrolladorConLesionCronica);
		resultadoEsperado.add(desarrolladorConLesionCronica2);
		resultadoEsperado.add(desarrolladorConLesionCronica3);
		assertEquals(resultadoEsperado, proyecto.desarrolladoresConLesionesCronicas());
	}

	@Test
	void cuatroDesarrolladoresDe4TienenLesionenCronicas() {
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica2 = new Desarrollador();
		desarrolladorConLesionCronica2.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica3 = new Desarrollador();
		desarrolladorConLesionCronica3.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica4 = new Desarrollador();
		desarrolladorConLesionCronica4.agregarLesionAlRegistro(lesion);
		ArrayList<Desarrollador> resultadoEsperado = new ArrayList<Desarrollador>();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica2);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica3);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica4);
		resultadoEsperado.add(desarrolladorConLesionCronica);
		resultadoEsperado.add(desarrolladorConLesionCronica2);
		resultadoEsperado.add(desarrolladorConLesionCronica3);
		resultadoEsperado.add(desarrolladorConLesionCronica4);
		assertEquals(resultadoEsperado, proyecto.desarrolladoresConLesionesCronicas());
	}

	// Pruebas del metodo cantidadDedesarrolladoresConLesionesCronicas()
	@Test
	void ceroDesarrolladoresde4TienenLesionenCronicasCantidad() {
		Desarrollador desarrollador = new Desarrollador();
		Desarrollador desarrollador2 = new Desarrollador();
		Desarrollador desarrollador3 = new Desarrollador();
		Desarrollador desarrollador4 = new Desarrollador();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrollador3);
		proyecto.asignarDesarrollador(desarrollador4);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, proyecto.cantidadDeDesarrolladoresConLesionesCronicas());
	}

	@Test
	void unDesarrolladorde4TienenLesionenCronicasCantidad() {
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrollador = new Desarrollador();
		Desarrollador desarrollador2 = new Desarrollador();
		Desarrollador desarrollador3 = new Desarrollador();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		proyecto.asignarDesarrollador(desarrollador3);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, proyecto.cantidadDeDesarrolladoresConLesionesCronicas());
	}

	@Test
	void dosDesarrolladoresDe4TienenLesionenCronicasCantidad() {
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica2 = new Desarrollador();
		desarrolladorConLesionCronica2.agregarLesionAlRegistro(lesion);
		Desarrollador desarrollador = new Desarrollador();
		Desarrollador desarrollador2 = new Desarrollador();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica2);
		proyecto.asignarDesarrollador(desarrollador);
		proyecto.asignarDesarrollador(desarrollador2);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, proyecto.cantidadDeDesarrolladoresConLesionesCronicas());
	}

	@Test
	void tresDesarrolladoresDe4TienenLesionenCronicasCantidad() {
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica2 = new Desarrollador();
		desarrolladorConLesionCronica2.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica3 = new Desarrollador();
		desarrolladorConLesionCronica3.agregarLesionAlRegistro(lesion);
		Desarrollador desarrollador = new Desarrollador();
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica2);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica3);
		proyecto.asignarDesarrollador(desarrollador);
		int resultadoEsperado = 3;
		assertEquals(resultadoEsperado, proyecto.cantidadDeDesarrolladoresConLesionesCronicas());
	}

	@Test
	void cuatroDesarrolladoresDe4TienenLesionenCronicasCantidad() {
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		Desarrollador desarrolladorConLesionCronica = new Desarrollador();
		desarrolladorConLesionCronica.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica2 = new Desarrollador();
		desarrolladorConLesionCronica2.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica3 = new Desarrollador();
		desarrolladorConLesionCronica3.agregarLesionAlRegistro(lesion);
		Desarrollador desarrolladorConLesionCronica4 = new Desarrollador();
		desarrolladorConLesionCronica4.agregarLesionAlRegistro(lesion);
		Proyecto proyecto = new Proyecto();
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica2);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica3);
		proyecto.asignarDesarrollador(desarrolladorConLesionCronica4);
		int resultadoEsperado = 4;
		assertEquals(resultadoEsperado, proyecto.cantidadDeDesarrolladoresConLesionesCronicas());
	}
	
	 @Test
	 void asdasd() {
				Lesion lesion = new Lesion();
				Lesion lesion2 = new Lesion();
				lesion.setTipoDeLesion(lesion.LESION_CRONICA);
			    lesion2.setTipoDeLesion(lesion.LESION_TRANSITORIA);
			    Desarrollador desarrollador = new Desarrollador();
			    desarrollador.agregarLesionAlRegistro(lesion);
			    desarrollador.agregarLesionAlRegistro(lesion2);
			    desarrollador.agregarLesionAlRegistro(lesion);
			    Desarrollador desarrollador2 = new Desarrollador();
			    desarrollador2.agregarLesionAlRegistro(lesion);
			    desarrollador2.agregarLesionAlRegistro(lesion);
			    Desarrollador desarrollador3 = new Desarrollador();
			    desarrollador3.agregarLesionAlRegistro(lesion2);
			    Proyecto p = new Proyecto();
			    p.asignarDesarrollador(desarrollador);
			    p.asignarDesarrollador(desarrollador2);
			    p.asignarDesarrollador(desarrollador3);
			    ArrayList<Desarrollador> resutlado = new ArrayList<Desarrollador>();
			    resutlado.add(desarrollador);
			    resutlado.add(desarrollador2);
			    assertEquals(resutlado, p.desarrolladoresConLesionesCronicas());
	 }

}
