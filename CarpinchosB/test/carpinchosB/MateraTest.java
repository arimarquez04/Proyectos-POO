package carpinchosB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MateraTest {

	@Test
	public void tiene100DeCache() {
		Matera canastaMatera = new Matera();
		
		assertEquals(100, canastaMatera.cuantoCacheTiene());
	}

}
