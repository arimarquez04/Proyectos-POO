package SalonDeLaJusticia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SuperTest {

	// pruebas del metodo cuantoPagaEnSalarios()
	@Test
	void paga10000EnSalariosPorqueTiene2AsistentesNormalesQueCobran5000DeSueldoBaseCadaUno() {
		Super s = new Super();
		Asistente asistente1 = new Asistente();
		Asistente asistente2 = new Asistente();
		double sueldoBase = 5000;
		asistente1.setSueldoBase(sueldoBase);
		asistente2.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistente1);
		s.agregarAsistente(asistente2);
		double resultadoEsperado = 10000;
		assertEquals(resultadoEsperado, s.cuantoPagaEnSalarios());
	}

	@Test
	void paga40000EnSalariosPorqueTiene2AsistentesNormalesQueCobran20000DeSueldoBase() {
		Super s = new Super();
		Asistente asistente1 = new Asistente();
		Asistente asistente2 = new Asistente();
		double sueldoBase = 20000;
		asistente1.setSueldoBase(sueldoBase);
		asistente2.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistente1);
		s.agregarAsistente(asistente2);
		double resultadoEsperado = 40000;
		assertEquals(resultadoEsperado, s.cuantoPagaEnSalarios());
	}

	@Test
	void paga30000EnSalariosPorqueTiene3AsistentesNormalesQueCobran10000DeSueldoBaseCadaUno() {
		Super s = new Super();
		Asistente asistente1 = new Asistente();
		Asistente asistente2 = new Asistente();
		Asistente asistente3 = new Asistente();
		double sueldoBase = 10000;
		asistente1.setSueldoBase(sueldoBase);
		asistente2.setSueldoBase(sueldoBase);
		asistente3.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistente1);
		s.agregarAsistente(asistente2);
		s.agregarAsistente(asistente3);
		double resultadoEsperado = 30000;
		assertEquals(resultadoEsperado, s.cuantoPagaEnSalarios());
	}

	@Test
	void paga12000EnSalariosPorqueTiene1AsistenteHabilidosoQueCobra10000DeSueldoBase() {
		Super s = new Super();
		AsistenteHabilidoso asistenteHabilidoso1 = new AsistenteHabilidoso();
		double sueldoBase = 10000;
		asistenteHabilidoso1.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteHabilidoso1);
		double resultadoEsperado = 12000;
		assertEquals(resultadoEsperado, s.cuantoPagaEnSalarios());
	}

	@Test
	void paga24000EnSalariosPorqueTiene2AsistentesHabilidosoQueCobran1000DeSueldoBaseCadaUno() {
		Super s = new Super();
		AsistenteHabilidoso asistenteHabilidoso1 = new AsistenteHabilidoso();
		AsistenteHabilidoso asistenteHabilidoso2 = new AsistenteHabilidoso();
		double sueldoBase = 10000;
		asistenteHabilidoso1.setSueldoBase(sueldoBase);
		asistenteHabilidoso2.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteHabilidoso1);
		s.agregarAsistente(asistenteHabilidoso2);
		double resultadoEsperado = 24000;
		assertEquals(resultadoEsperado, s.cuantoPagaEnSalarios());
	}

	@Test
	void paga22000EnSalariosPorqueTiene1AsistenteNormalQueCobra10000DeSueldoBaseCadaUnoY1AsistenteHabilidosoQueCobra10000DeSueldoBase() {
		Super s = new Super();
		Asistente asistenteNormal1 = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso1 = new AsistenteHabilidoso();
		double sueldoBase = 10000;
		asistenteNormal1.setSueldoBase(sueldoBase);
		asistenteHabilidoso1.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteNormal1);
		s.agregarAsistente(asistenteHabilidoso1);
		double resultadoEsperado = 22000;
		assertEquals(resultadoEsperado, s.cuantoPagaEnSalarios());
	}

	@Test
	void paga44000EnSalariosPorqueTiene2AsistentesHabilidososQueCobran10000DeSueldoBaseCadaUnoY2AsistenteHabilidosoQueCobran10000DeSueldoBaseCadaUno() {
		Super s = new Super();
		Asistente asistenteNormal1 = new Asistente();
		Asistente asistenteNormal2 = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso1 = new AsistenteHabilidoso();
		AsistenteHabilidoso asistenteHabilidoso2 = new AsistenteHabilidoso();
		double sueldoBase = 10000;
		asistenteNormal1.setSueldoBase(sueldoBase);
		asistenteNormal2.setSueldoBase(sueldoBase);
		asistenteHabilidoso1.setSueldoBase(sueldoBase);
		asistenteHabilidoso2.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteNormal1);
		s.agregarAsistente(asistenteNormal2);
		s.agregarAsistente(asistenteHabilidoso1);
		s.agregarAsistente(asistenteHabilidoso2);
		double resultadoEsperado = 44000;
		assertEquals(resultadoEsperado, s.cuantoPagaEnSalarios());
	}

	// Pruebas del metodo llegaAFinDeMes()
	@Test
	void falsePorqueTieneQuePagarMasEnSalarioQueSuPresupuesto() {
		Super s = new Super();
		AsistenteHabilidoso asistenteHabilidoso1 = new AsistenteHabilidoso();
		double sueldoBase = 10000;
		asistenteHabilidoso1.setSueldoBase(sueldoBase);
		// el asistente habilidoso cobraria 12000
		s.agregarAsistente(asistenteHabilidoso1);
		double resultadoEsperado = 12000;
		s.setPresupuesto(resultadoEsperado - 2000);
		assertEquals(false, s.llegaAFinDeMes());
	}

	@Test
	void truePorqueTieneQuePagarIgualEnSalariosQueSuPresupuesto() {
		Super s = new Super();
		AsistenteHabilidoso asistenteHabilidoso1 = new AsistenteHabilidoso();
		double sueldoBase = 10000;
		asistenteHabilidoso1.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteHabilidoso1);
		// el asistente habilidoso cobraria 12000
		double resultadoEsperado = 12000;
		s.setPresupuesto(resultadoEsperado);
		assertEquals(true, s.llegaAFinDeMes());
	}

	@Test
	void truePorqueTieneQuePagarMenosEnSalariosQueSuPresupuesto() {
		Super s = new Super();
		AsistenteHabilidoso asistenteHabilidoso1 = new AsistenteHabilidoso();
		double sueldoBase = 10000;
		asistenteHabilidoso1.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteHabilidoso1);
		// el asistente habilidoso cobraria 12000
		double resultadoEsperado = 1000000;
		s.setPresupuesto(resultadoEsperado);
		assertEquals(true, s.llegaAFinDeMes());
	}

	// pruebas del metodo cuantoParaLaVaquita()

	@Test
	void leSobra1000PorqueTieneUnPresupuestoDe11000YUnAsistenteNormalQueCobra10000DeSueldoBasico() {
		double presupuesto = 11000;
		double sueldoBase = 10000;
		Super s = new Super();
		s.setPresupuesto(presupuesto);
		Asistente asistenteNormal = new Asistente();
		asistenteNormal.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteNormal);
		double resultadoEsperado = presupuesto - sueldoBase;
		assertEquals(resultadoEsperado, s.cuantoParaLaVaquita());
	}

	@Test
	void leSobra1000PorqueTieneUnPresupuestoDe23000YTiene1AsistenteNormalYUnAsistenteHabilidosoQueCobran10000DeSueldoBasicoCadaUno() {
		double presupuesto = 23000;
		double sueldoBase = 10000;
		Super s = new Super();
		s.setPresupuesto(presupuesto);
		Asistente asistenteNormal = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso = new AsistenteHabilidoso();
		asistenteNormal.setSueldoBase(sueldoBase);
		asistenteHabilidoso.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteHabilidoso);
		double resultadoEsperado = 1000;
		assertEquals(resultadoEsperado, s.cuantoParaLaVaquita());
	}

	@Test
	void noLeSobraNadaPorqueTieneUnPresupuestoDe22000YTiene1AsistenteNormalY1AsistenteHabilidosoQueCobran10000DeSueldoBasicoCadaUno() {
		double presupuesto = 22000;
		double sueldoBase = 10000;
		Super s = new Super();
		s.setPresupuesto(presupuesto);
		Asistente asistenteNormal = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso = new AsistenteHabilidoso();
		asistenteNormal.setSueldoBase(sueldoBase);
		asistenteHabilidoso.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteHabilidoso);
		double resultadoEsperado = 0;
		assertEquals(resultadoEsperado, s.cuantoParaLaVaquita());
	}

	@Test
	void noLeSobraNadaPorqueTieneUnPresupuestoDe34000YTiene1AsistenteNormalY2AsistentesHabilidososQueCobran10000DeSueldoBasicoCadaUno() {
		double presupuesto = 24000;
		double sueldoBase = 10000;
		Super s = new Super();
		s.setPresupuesto(presupuesto);
		Asistente asistenteNormal = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso = new AsistenteHabilidoso();
		AsistenteHabilidoso asistenteHabilidoso2 = new AsistenteHabilidoso();
		asistenteNormal.setSueldoBase(sueldoBase);
		asistenteHabilidoso.setSueldoBase(sueldoBase);
		asistenteHabilidoso2.setSueldoBase(sueldoBase);
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteHabilidoso);
		s.agregarAsistente(asistenteHabilidoso2);
		double resultadoEsperado = 0;
		assertEquals(resultadoEsperado, s.cuantoParaLaVaquita());
	}

	@Test
	void leSobra10000PorqueTieneUnPresupuestoDe10000YNoTieneAsistentes() {
		double presupuesto = 10000;
		Super s = new Super();
		s.setPresupuesto(presupuesto);
		double resultadoEsperado = presupuesto;
		assertEquals(resultadoEsperado, s.cuantoParaLaVaquita());
	}

	// Pruebas del metodo cuantosAsistenteRicosTiene()
	@Test
	void tiene1AsistenteRicoPeroTiene2Asistentes() {
		Super s = new Super();
		Asistente asistenteNormal = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso = new AsistenteHabilidoso();
		double sueldoNecesario = asistenteNormal.getSalarioNecesarioParaSerRico();
		asistenteNormal.setSueldoBase(sueldoNecesario - 20000);
		asistenteHabilidoso.setSueldoBase(asistenteHabilidoso.getSalarioNecesarioParaSerRico());
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteHabilidoso);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, s.cuantosAsistentesRicosTiene());
	}

	@Test
	void tiene1AsistenteRicoPeroTiene1Asistente() {
		Super s = new Super();
		Asistente asistenteNormal = new Asistente();
		double sueldoNecesario = asistenteNormal.getSalarioNecesarioParaSerRico();
		asistenteNormal.setSueldoBase(sueldoNecesario + 1);
		s.agregarAsistente(asistenteNormal);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, s.cuantosAsistentesRicosTiene());
	}

	@Test
	void tiene0AsistentesRicosPorqueNoTieneAsistentes() {
		Super s = new Super();
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, s.cuantosAsistentesRicosTiene());
	}

	@Test
	void tiene2AsistentesRicosPeroTiene3Asistentes() {
		Super s = new Super();
		Asistente asistenteNormal = new Asistente();
		Asistente asistenteNormal2 = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso = new AsistenteHabilidoso();
		double sueldoNecesario = 1 + asistenteNormal.getSalarioNecesarioParaSerRico();
		asistenteNormal.setSueldoBase(sueldoNecesario);
		asistenteNormal2.setSueldoBase(sueldoNecesario - 1000);
		asistenteHabilidoso.setSueldoBase(sueldoNecesario);
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteNormal2);
		s.agregarAsistente(asistenteHabilidoso);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, s.cuantosAsistentesRicosTiene());
	}

	@Test
	void tiene3AsistentesRicosPeroTiene3Asistentes() {
		Super s = new Super();
		Asistente asistenteNormal = new Asistente();
		Asistente asistenteNormal2 = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso = new AsistenteHabilidoso();
		double sueldoNecesario = 1 + asistenteNormal.getSalarioNecesarioParaSerRico();
		asistenteNormal.setSueldoBase(sueldoNecesario);
		asistenteNormal2.setSueldoBase(sueldoNecesario);
		asistenteHabilidoso.setSueldoBase(sueldoNecesario);
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteNormal2);
		s.agregarAsistente(asistenteHabilidoso);
		int resultadoEsperado = 3;
		assertEquals(resultadoEsperado, s.cuantosAsistentesRicosTiene());
	}

	//Pruebas del metodo cuantosAsistentesTiene()
	@Test
	void tiene0Asistentes() {
		Super s = new Super();
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, s.cuantosAsistentesTiene());
	}
	@Test
	void tiene1Asistentes() {
		Super s = new Super();
		Asistente asistenteNormal = new Asistente();
		s.agregarAsistente(asistenteNormal);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, s.cuantosAsistentesTiene());
	}
	@Test
	void tiene2Asistentes() {
		Super s = new Super();
		Asistente asistenteNormal = new Asistente();
		Asistente asistenteNormal2 = new Asistente();
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteNormal2);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, s.cuantosAsistentesTiene());
	}
	@Test
	void tiene3Asistentes() {
		Super s = new Super();
		Asistente asistenteNormal = new Asistente();
		Asistente asistenteNormal2 = new Asistente();
		AsistenteHabilidoso asistenteHabilidoso = new AsistenteHabilidoso();
		s.agregarAsistente(asistenteNormal);
		s.agregarAsistente(asistenteNormal2);
		s.agregarAsistente(asistenteHabilidoso);
		int resultadoEsperado = 3;
		assertEquals(resultadoEsperado, s.cuantosAsistentesTiene());
	}
	
	@Test
	void test() {
		Asistente a = new Asistente();
		a.setSueldoBase(100000);
		AsistenteHabilidoso ah = new AsistenteHabilidoso();
		ah.setSueldoBase(100000);
		Super s = new Super();
		s.agregarAsistente(a);
		s.agregarAsistente(ah);
		ArrayList<Asistente> resultadoEsperado = new ArrayList<Asistente>();
		resultadoEsperado.add(a);
		resultadoEsperado.add(ah);
		assertEquals(resultadoEsperado, s.getAsistentes());
	}

	@Test
	void asas() {
		Super s = new Super();
		assertEquals(0, s.cuantosAsistentesTiene());
	}
}
