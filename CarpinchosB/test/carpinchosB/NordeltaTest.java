package carpinchosB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NordeltaTest {

	//Pruebas del Metodo numeroTotalDeCache()
	@Test
	void tiene1000DeCachePorqueHay4CarpinchosConCanastaMateraY1CarpinchoConCanastaChetaQueTiene600DeCache() {
		Nordelta nordelta = new Nordelta();
		Carpincho carpinchoMetero1 = new Carpincho();
		Carpincho carpinchoMatero2 = new Carpincho();
		Carpincho carpinchoMatero3 = new Carpincho();
		Carpincho carpinchoMatero4 = new Carpincho();
		Carpincho carpinchoCheto = new Carpincho();
		Matera canastaMatera = new Matera();
		Cheta canastaCheta = new Cheta();
		canastaCheta.setLitrosDeAgua(0);
		canastaCheta.setGramosDeJamonCrudo(6);
		carpinchoMetero1.agregarCanasta(canastaMatera);
		carpinchoMatero2.agregarCanasta(canastaMatera);
		carpinchoMatero3.agregarCanasta(canastaMatera);
		carpinchoMatero4.agregarCanasta(canastaMatera);
		carpinchoCheto.agregarCanasta(canastaCheta);
		nordelta.agregarCarpincho(carpinchoMetero1);
		nordelta.agregarCarpincho(carpinchoMatero2);
		nordelta.agregarCarpincho(carpinchoMatero3);
		nordelta.agregarCarpincho(carpinchoMatero4);
		nordelta.agregarCarpincho(carpinchoCheto);
		int resultadoEsperado = 1000;
		assertEquals(resultadoEsperado, nordelta.numeroTotalDeCache());
	}
	
	@Test
	void tiene400DeCachePorqueHay4CarpinchosConCanastaMatera() {
		Nordelta nordelta = new Nordelta();
		Carpincho carpinchoMetero1 = new Carpincho();
		Carpincho carpinchoMatero2 = new Carpincho();
		Carpincho carpinchoMatero3 = new Carpincho();
		Carpincho carpinchoMatero4 = new Carpincho();
		Matera canastaMatera = new Matera();
		carpinchoMetero1.agregarCanasta(canastaMatera);
		carpinchoMatero2.agregarCanasta(canastaMatera);
		carpinchoMatero3.agregarCanasta(canastaMatera);
		carpinchoMatero4.agregarCanasta(canastaMatera);
		nordelta.agregarCarpincho(carpinchoMetero1);
		nordelta.agregarCarpincho(carpinchoMatero2);
		nordelta.agregarCarpincho(carpinchoMatero3);
		nordelta.agregarCarpincho(carpinchoMatero4);
		int resultadoEsperado = 400;
		assertEquals(resultadoEsperado, nordelta.numeroTotalDeCache());
	}
	
	@Test
	void tiene300DeCachePorqueHay1CarpinchoConCanastaChetaDe100DeCacheYOtroConCanastaChetaDe200DeCache() {
		Carpincho carpinchoCheto1 = new Carpincho();
		Carpincho carpinchoCheto2 = new Carpincho();
		Cheta canastaCheta1 = new Cheta();
		canastaCheta1.setLitrosDeAgua(0);
		canastaCheta1.setGramosDeJamonCrudo(1);
		carpinchoCheto1.agregarCanasta(canastaCheta1);
		Cheta canastaCheta2 = new Cheta();
		canastaCheta2.setLitrosDeAgua(0);
		canastaCheta2.setGramosDeJamonCrudo(2);
		carpinchoCheto2.agregarCanasta(canastaCheta2);
		int resultadoEsperado = 300;
		Nordelta nordelta = new Nordelta();
		nordelta.agregarCarpincho(carpinchoCheto1);
		nordelta.agregarCarpincho(carpinchoCheto2);
		assertEquals(resultadoEsperado, nordelta.numeroTotalDeCache());
	}
}
