package cuidarEdu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuidarEdu.Local;

class localTest {

	//Pruebas del Metodo esEscencial()
	
	@Test
	void resultadoTruePorqueElRubroEsAlimentacion() {
		Local local = new Local("Nombre", "alimentacion");
		assertEquals(true, local.esEscencial());
	}

	@Test
	void resultadoTruePorqueElRubroEsFarmacia() {
		Local local = new Local("Nombre", "farmacia");
		assertEquals(true, local.esEscencial());
		
		
	}
	
	@Test
	void resultadoFalsePorqueElRubroNoEsFarmaciaNiAlimentacion() {
		Local local = new Local("Nombre", "entretenimiento");
		assertEquals(false, local.esEscencial());
		
		
	}


}
