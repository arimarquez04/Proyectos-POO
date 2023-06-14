package SalonDeLaJusticia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsistenteHabilidosoTest {

	//prueba del metodo cuantoIncrementar()
	@Test
	void seDebeIncrementar20PorqueTieneUnSueldoDe100() {
		AsistenteHabilidoso a = new AsistenteHabilidoso();
		a.setSueldoBase(100);
		double resultadoEsperado = 20;
		assertEquals(resultadoEsperado, a.cuantoIncrementar());
	}
	@Test
	void seDebeIncrementar40PorqueTieneUnSueldoDe200() {
		AsistenteHabilidoso a = new AsistenteHabilidoso();
		a.setSueldoBase(200);
		double resultadoEsperado = 40;
		assertEquals(resultadoEsperado, a.cuantoIncrementar());
	}
	
	//prueba del metodo salario()
	@Test
	void elSalarioEsDe120PorqueElIncrementoDe20Porciento(){
		AsistenteHabilidoso a = new AsistenteHabilidoso();
		a.setSueldoBase(100);
		double resultadoEsperado = 120;
		assertEquals(resultadoEsperado, a.salario());
	}
	@Test
	void elSalarioEsDe12000PorqueElIncrementoDe20Porciento() {
		AsistenteHabilidoso a = new AsistenteHabilidoso();
		a.setSueldoBase(10000);
		double resultadoEsperado = 12000;
		assertEquals(resultadoEsperado, a.salario());
	}
	@Test
	void elSalarioEsDe120000PorqueElIncrementoDe20Porciento() {
		AsistenteHabilidoso a = new AsistenteHabilidoso();
		a.setSueldoBase(100000);
		double resultadoEsperado = 120000;
		assertEquals(resultadoEsperado, a.salario());
	}
}
