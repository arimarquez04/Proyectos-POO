package caballerosDelZodiaco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaballeroTest {

	// Pruebas del Metodo esOro()
	@Test
	void truePorqueElCaballeroTieneUnaCosntelacionAsociadaEnbandaCeleste() {
		Constelacion cosntelacionEnBandaCeleste = new Constelacion(true);
		Caballero caballeroConCosntelacionEnBandaCeleste = new Caballero(cosntelacionEnBandaCeleste);
		assertEquals(true, caballeroConCosntelacionEnBandaCeleste.esOro());
	}

	@Test
	void falsePorqueElCaballeroNoTieneUnaCosntelacionAsociadaEnbandaCeleste() {
		Constelacion cosntelacionEnBandaCeleste = new Constelacion(false);
		Caballero caballeroConCosntelacionEnBandaCeleste = new Caballero(cosntelacionEnBandaCeleste);
		assertEquals(false, caballeroConCosntelacionEnBandaCeleste.esOro());
	}

	// Pruebas del Metodo esPrecoz()
	@Test
	void truePorqueElCaballeroRecibioSuArmaduraAntesDeLos12Años() {
		Caballero caballeroPrecoz = new Caballero(11);
		assertEquals(true, caballeroPrecoz.esPrecoz());
	}

	@Test
	void falsePorqueElCaballeroRecibioSuArmaduraALos12Años() {
		Caballero caballeroPrecoz = new Caballero(12);
		assertEquals(false, caballeroPrecoz.esPrecoz());
	}

	@Test
	void falsePorqueElCaballeroRecibioSuArmaduraDespuesDeLos12Años() {
		Caballero caballeroPrecoz = new Caballero(13);
		assertEquals(false, caballeroPrecoz.esPrecoz());
	}

	// Pruebas para el Metodo esPoderoso()
	
	@Test
	void truePorqueElCaballeroEsPrecozYOro() {
		Constelacion constelacionEnBandaCeleste = new Constelacion(true);
		Caballero caballeroPoderoso = new Caballero(constelacionEnBandaCeleste, 11);
		assertEquals(true, caballeroPoderoso.esPoderoso());
	}

	@Test
	void falsePorqueElCaballeroEsPrecozPeroNoEsOro() {
		Constelacion constelacionEnBandaCeleste = new Constelacion(false);
		Caballero caballeroPoderoso = new Caballero(constelacionEnBandaCeleste, 11);
		assertEquals(false, caballeroPoderoso.esPoderoso());
	}

	@Test
	void falsePorqueElCaballeroNoEsPrecozPeroSiEsOro() {
		Constelacion constelacionEnBandaCeleste = new Constelacion(true);
		Caballero caballeroPoderoso = new Caballero(constelacionEnBandaCeleste, 15);
		assertEquals(false, caballeroPoderoso.esPoderoso());
	}

	@Test
	void falsePorqueElCaballeroNoEsPrecozNiEsOro() {
		Constelacion constelacionEnBandaCeleste = new Constelacion(false);
		Caballero caballeroPoderoso = new Caballero(constelacionEnBandaCeleste, 15);
		assertEquals(false, caballeroPoderoso.esPoderoso());
	}

}
