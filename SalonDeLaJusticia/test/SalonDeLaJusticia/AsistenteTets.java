package SalonDeLaJusticia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsistenteTets {

	//Pruebas del metodo salario()
	@Test
	void elSalarioEsDe1000() {
		Asistente a = new Asistente();
		double resultadoEsperado = 1000;
		a.setSueldoBase(resultadoEsperado);
		assertEquals(resultadoEsperado, a.salario());
	}
	@Test
	void elSalarioEsDe2000() {
		Asistente a = new Asistente();
		double resultadoEsperado = 2000;
		a.setSueldoBase(resultadoEsperado);
		assertEquals(resultadoEsperado, a.salario());
	}
	
	//pruebadel metodo esRico()
	@Test
	void elAsistenteEsRicoPorqueTieneUnSalarioDeMasDe60000() {
		Asistente a = new Asistente();
		a.setSueldoBase(a.getSalarioNecesarioParaSerRico()+5000);
		assertEquals(true, a.esRico());
	}
	@Test
	void elAsistenteNoEsRicoPorqueTieneUnSalaioDe60000() {
		Asistente a = new Asistente();
		a.setSueldoBase(a.getSalarioNecesarioParaSerRico());
		assertEquals(false, a.esRico());
	}
	@Test
	void elAsistenteNoEsRicoPorqueTieneUnSalarioMenorA60000() {
		Asistente a = new Asistente();
		a.setSueldoBase(a.getSalarioNecesarioParaSerRico()-100000);
		assertEquals(false, a.esRico());
	}
	
}
