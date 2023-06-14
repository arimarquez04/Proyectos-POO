package carpinchosB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarpinchoTest {

	@Test
	void tiene100DeChachePorqueSuCanastaEsMatera() {
	Carpincho carpincho = new Carpincho();
	Matera canastaMatera = new Matera();
	carpincho.agregarCanasta(canastaMatera);
	assertEquals(100, carpincho.cacheDeSuCanasta());
	}
	@Test 
	void tiene200DeCachePorqueSuCanastaEsCheta() {
		Carpincho carpincho = new Carpincho();
		Cheta canastaCheta = new Cheta();
		canastaCheta.setGramosDeJamonCrudo(2);
		canastaCheta.setLitrosDeAgua(0);
		carpincho.agregarCanasta(canastaCheta);
		assertEquals(200, carpincho.cacheDeSuCanasta());
	}
	@Test 
	void tiene300DeCachePorqueSuCanastaEsCheta() {
		Carpincho carpincho = new Carpincho();
		Cheta canastaCheta = new Cheta();
		canastaCheta.setGramosDeJamonCrudo(3);
		canastaCheta.setLitrosDeAgua(0);
		carpincho.agregarCanasta(canastaCheta);
		assertEquals(300, carpincho.cacheDeSuCanasta());
	}
}
