package tdj.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdj.Luchador;

class LuchadorTest {

	
	//Pruebas del Metodo esChuckNurris()
	
	@Test
	void esChuckNorrisPorqueTieneEnergiaMayorA15YSuperaElValorDado() {
		Luchador luchador = new Luchador("Ariel", 40, 500, true);	
		int superarValor = 30;
		assertEquals(true, luchador.esChuckNurris(superarValor));
	}
	
	@Test
	void noEsChuckNorrisPorqueTieneEnergiaIgualA15YSuperaElValorDado() {
		Luchador luchador = new Luchador("Ariel", 15, 500, true);	
		int superarValor = 30;
		assertEquals(false, luchador.esChuckNurris(superarValor));
	}

	@Test
	void noEsChuckNorrisPorqueTieneEnergiaIgualA15YMismaResultadoDeFuerzaQueElValorDado() {
		Luchador luchador = new Luchador("Ariel", 15, 3, true);	
		int superarValor = 30;
		assertEquals(false, luchador.esChuckNurris(superarValor));
	}
	
	@Test
	void noEsChuckNorrisPorqueTieneEnergiaMenorA15AunqueSupereElValorDado() {
		Luchador luchador = new Luchador("Ariel", 10, 500, true);	
		int superarValor = 30;
		assertEquals(false, luchador.esChuckNurris(superarValor));
	}
	
	@Test
	void noEsChuckNorrisPorqueTieneEnergiaMenorA15yNoSuperaElValorDado() {
		Luchador luchador = new Luchador("Ariel", 10, 2, true);	
		int superarValor = 30;
		assertEquals(false, luchador.esChuckNurris(superarValor));
	}
	
	
	//Pruebas del Metodo esInsecto()
	
	@Test
	void noEsInsectoPorqueTieneFuerzaMayorA500() {
		Luchador luchador = new Luchador("Ariel", 10, 599, true);	
		assertEquals(false, luchador.esInsecto());
	}
	
	@Test
	void esInsectoPorqueTieneFuerzaIgualA500() {
		Luchador luchador = new Luchador("Ariel", 10, 500, true);	
		assertEquals(false, luchador.esInsecto());
	}
	
	@Test
	void esInsectoPorqueTieneFuerzaMenorA500() {
		Luchador luchador = new Luchador("Ariel", 10, 450, true);	
		assertEquals(true, luchador.esInsecto());
	}
	
	
	//Pruebas del Metodo entrenar()
	
	@Test
	void entrenarTestFuerzaDeCombate() {
		Luchador luchador = new Luchador("Ariel", 10, 450, true);	
		double horasDeEntrenamiento = 2;
		double resultadoEsperado = luchador.getFuerzaDeCombate() + (horasDeEntrenamiento*0.5);
		luchador.entrenar(horasDeEntrenamiento);
		assertEquals(resultadoEsperado, luchador.getFuerzaDeCombate());
	}
	
	@Test
	void entrenarTestEnergia() {
		Luchador luchador = new Luchador("Ariel", 10, 450, true);	
		double horasDeEntrenamiento = 2;
		double resultadoEsperado = luchador.getEnergia()  - 20;
		luchador.entrenar(horasDeEntrenamiento);
		assertEquals(resultadoEsperado, luchador.getEnergia());
	}
	
	
	//Pruebas del Metodo dormir()
	
	@Test
	void dormirTestEnergia() {
		Luchador luchador = new Luchador("Ariel", 10, 450, true);	
		double resultadoEsperado = luchador.getEnergia()  + 20;
		luchador.dormir();
		assertEquals(resultadoEsperado, luchador.getEnergia());
	}
}
