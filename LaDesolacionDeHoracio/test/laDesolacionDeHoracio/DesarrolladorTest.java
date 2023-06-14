package laDesolacionDeHoracio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sun.net.httpserver.Authenticator.Result;

class DesarrolladorTest {

	//Pruebas para el metodo tieneLesionCronicaAhora
	@Test
	void truePorqueTieneUnaLesionCronicaAhora() {
		Lesion lesion = new Lesion();
		lesion.setTipoDeLesion(lesion.LESION_CRONICA);
		Desarrollador desarroladorConLesionCronica = new Desarrollador();
		desarroladorConLesionCronica.agregarLesionAlRegistro(lesion);
		assertEquals(true, desarroladorConLesionCronica.tieneLesionCronicaAhora());
	}
	@Test
	void falsePorqueNoTieneUnaLesionCronicaAhora() {
		
		Desarrollador desarroladorSinLesionCronica = new Desarrollador();
		assertEquals(false, desarroladorSinLesionCronica.tieneLesionCronicaAhora());
	}
	
	
}
