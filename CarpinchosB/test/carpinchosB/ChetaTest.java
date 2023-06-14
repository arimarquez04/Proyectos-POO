package carpinchosB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChetaTest {

	@Test
	void tiene100DeCache() {
		Cheta canastaCheta = new Cheta();
		canastaCheta.setLitrosDeAgua(0);
		canastaCheta.setGramosDeJamonCrudo(4);
		assertEquals(400, canastaCheta.cuantoCacheTiene());
	}
	@Test
	void tiene200DeCache() {
		Cheta canastaCheta = new Cheta();
		canastaCheta.setLitrosDeAgua(0);
		canastaCheta.setGramosDeJamonCrudo(2);
		assertEquals(200, canastaCheta.cuantoCacheTiene());
	}
	@Test
	void tiene300DeCache() {
		Cheta canastaCheta = new Cheta();
		canastaCheta.setLitrosDeAgua(0);
		canastaCheta.setGramosDeJamonCrudo(3);
		assertEquals(300, canastaCheta.cuantoCacheTiene());
	}
	

}
