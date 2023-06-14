package SalonDeLaJusticia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SalonTest {

	// Pruebas del metodo supersConMayorCantidadDeAsistentes()
	@Test
	void dosSupersSonLosQueTienenMayorCantidadPorqueTienen2AsistentesYHay3SupersCon1Asistente() {
		Super super1 = new Super();
		Super super2 = new Super();
		Super super3 = new Super();
		Super super4 = new Super();
		Super super5 = new Super();
		Asistente asistente1 = new Asistente();
		super1.agregarAsistente(asistente1);
		super1.agregarAsistente(asistente1);
		super2.agregarAsistente(asistente1);
		super2.agregarAsistente(asistente1);
		super3.agregarAsistente(asistente1);
		super4.agregarAsistente(asistente1);
		super5.agregarAsistente(asistente1);
		Salon salon = new Salon();
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		salon.agregarSuper(super3);
		salon.agregarSuper(super4);
		salon.agregarSuper(super5);
		ArrayList<Super> resultadoEsperado = new ArrayList<>();
		resultadoEsperado.add(super1);
		resultadoEsperado.add(super2);
		assertEquals(resultadoEsperado, salon.supersConMayorCantidadDeAsistentes());
	}

	@Test
	void unSuperTieneMayorCantidadDeAsistentesPorqueTiene5AsistentesYHay1SuperCon3AsistentesYHay2SupersCob4Asistentes() {
		Super super1 = new Super();
		Super super2 = new Super();
		Super super3 = new Super();
		Super super4 = new Super();
		Asistente asistente1 = new Asistente();
		super1.agregarAsistente(asistente1);
		super1.agregarAsistente(asistente1);
		super1.agregarAsistente(asistente1);
		super1.agregarAsistente(asistente1);
		super1.agregarAsistente(asistente1);
		super2.agregarAsistente(asistente1);
		super2.agregarAsistente(asistente1);
		super2.agregarAsistente(asistente1);
		super3.agregarAsistente(asistente1);
		super3.agregarAsistente(asistente1);
		super3.agregarAsistente(asistente1);
		super3.agregarAsistente(asistente1);
		super4.agregarAsistente(asistente1);
		super4.agregarAsistente(asistente1);
		super4.agregarAsistente(asistente1);
		super4.agregarAsistente(asistente1);
		Salon salon = new Salon();
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		salon.agregarSuper(super3);
		salon.agregarSuper(super4);
		ArrayList<Super> resultadoEsperado = new ArrayList<>();
		resultadoEsperado.add(super1);
		assertEquals(resultadoEsperado, salon.supersConMayorCantidadDeAsistentes());
	}

	// Pruebas del metodo presupuestoDeLaVaquita()
	@Test
	void elPresupuestoEsDe1000PorqueHay1SuperAlQueLeSobra600YHayOtroSuperAlQueLeSobra400() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Super super2 = new Super();
		Asistente asistenteDelSuper1 = new Asistente();
		Asistente asistenteDelSuper2 = new Asistente();
		double presupuesto = 1000;
		super1.setPresupuesto(presupuesto);
		super2.setPresupuesto(presupuesto);
		asistenteDelSuper1.setSueldoBase(400);
		asistenteDelSuper2.setSueldoBase(600);
		super1.agregarAsistente(asistenteDelSuper1);
		super2.agregarAsistente(asistenteDelSuper2);
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		double resultadoEsperado = 1000;
		assertEquals(resultadoEsperado, salon.presupuestoDeLaVaquita());
	}

	@Test
	void elPresupuestoEsDe0PorqueHay2SupersALosQueNoLesSobraNada() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Super super2 = new Super();
		Asistente asistenteDelSuper1 = new Asistente();
		Asistente asistenteDelSuper2 = new Asistente();
		double presupuesto = 1000;
		super1.setPresupuesto(presupuesto);
		super2.setPresupuesto(presupuesto);
		asistenteDelSuper1.setSueldoBase(1000);
		asistenteDelSuper2.setSueldoBase(1000);
		super1.agregarAsistente(asistenteDelSuper1);
		super2.agregarAsistente(asistenteDelSuper2);
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		double resultadoEsperado = 0;
		assertEquals(resultadoEsperado, salon.presupuestoDeLaVaquita());
	}

	// Pruebas del metodo supersQueNoLLeganAFinDeMes()
	@Test
	void solo1SuperNoLlegaAFinDeMesYHayOtros2QueSi() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Super super2 = new Super();
		Asistente asistenteDelSuper1 = new Asistente();
		Asistente asistenteDelSuper2 = new Asistente();
		super1.setPresupuesto(1200);
		super2.setPresupuesto(999);
		asistenteDelSuper1.setSueldoBase(1000);
		asistenteDelSuper2.setSueldoBase(1000);
		super1.agregarAsistente(asistenteDelSuper1);
		super2.agregarAsistente(asistenteDelSuper2);
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		ArrayList<Super> resultadoEsperado = new ArrayList<Super>();
		resultadoEsperado.add(super2);
		assertEquals(resultadoEsperado, salon.supersQueNoLLeganAFinDeMes());
	}

	@Test
	void solo2SupersNoLleganAFinDeMesYHay1QueSi() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Super super2 = new Super();
		Super super3 = new Super();
		Asistente asistenteDelSuper1 = new Asistente();
		Asistente asistenteDelSuper2 = new Asistente();
		Asistente asistenteDelSuper3 = new Asistente();
		super1.setPresupuesto(1200);
		super2.setPresupuesto(999);
		super3.setPresupuesto(1000);
		asistenteDelSuper1.setSueldoBase(1000);
		asistenteDelSuper2.setSueldoBase(1000);
		asistenteDelSuper3.setSueldoBase(1000);
		super1.agregarAsistente(asistenteDelSuper1);
		super2.agregarAsistente(asistenteDelSuper2);
		super3.agregarAsistente(asistenteDelSuper3);
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		salon.agregarSuper(super3);
		ArrayList<Super> resultadoEsperado = new ArrayList<Super>();
		resultadoEsperado.add(super2);
		assertEquals(resultadoEsperado, salon.supersQueNoLLeganAFinDeMes());
	}

	@Test
	void ningunoDe3SupersLleganAFinDeMes() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Super super2 = new Super();
		Super super3 = new Super();
		Asistente asistenteDelSuper1 = new Asistente();
		Asistente asistenteDelSuper2 = new Asistente();
		Asistente asistenteDelSuper3 = new Asistente();
		int salario = asistenteDelSuper1.getSalarioNecesarioParaSerRico();
		asistenteDelSuper1.setSueldoBase(salario);
		asistenteDelSuper2.setSueldoBase(salario);
		asistenteDelSuper3.setSueldoBase(salario);
		super1.agregarAsistente(asistenteDelSuper1);
		super2.agregarAsistente(asistenteDelSuper2);
		super3.agregarAsistente(asistenteDelSuper3);
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		salon.agregarSuper(super3);
		ArrayList<Super> resultadoEsperado = new ArrayList<Super>();
		resultadoEsperado.add(super1);
		resultadoEsperado.add(super2);
		resultadoEsperado.add(super3);
		assertEquals(resultadoEsperado, salon.supersQueNoLLeganAFinDeMes());
	}

	// Pruebas del metodo asistentesRicos()
	@Test
	void hay2AsistentesRicos1EnCadaSuperYhay3Supers() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Super super2 = new Super();
		Super super3 = new Super();
		Asistente asistenteDelSuper1 = new Asistente();
		Asistente asistenteDelSuper2 = new Asistente();
		Asistente asistenteDelSuper3 = new Asistente();
		int salario = asistenteDelSuper1.getSalarioNecesarioParaSerRico();
		asistenteDelSuper1.setSueldoBase(salario + 1);
		asistenteDelSuper2.setSueldoBase(salario + 1);
		asistenteDelSuper3.setSueldoBase(salario / 2);
		super1.agregarAsistente(asistenteDelSuper1);
		super2.agregarAsistente(asistenteDelSuper2);
		super3.agregarAsistente(asistenteDelSuper3);
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		salon.agregarSuper(super3);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, salon.asistentesRicos());
	}

	@Test
	void haySolo1AsistenteRicoEnUnSuperAunqueTenga2Asistentes() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Asistente asistente1DelSuper = new Asistente();
		Asistente asistente2DelSuper = new Asistente();
		int salario = asistente1DelSuper.getSalarioNecesarioParaSerRico();
		asistente1DelSuper.setSueldoBase(salario + 1);
		asistente2DelSuper.setSueldoBase(salario);
		super1.agregarAsistente(asistente1DelSuper);
		super1.agregarAsistente(asistente2DelSuper);
		salon.agregarSuper(super1);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, salon.asistentesRicos());
	}
	@Test
	void hay3AsistentesRicosEnUnSuperAunqueTenga4YhayOtroSuperQueTiene1AsistenteRicoY2QueNoLoSon() {
		Salon salon = new Salon();
		Super super1 = new Super();
		Super super2 = new Super();
		Asistente asistente1DelSuper1 = new Asistente();
		Asistente asistente2DelSuper1 = new Asistente();
		Asistente asistente3DelSuper1 = new Asistente();
		Asistente asistente4DelSuper1 = new Asistente();
		Asistente asistente1DelSuper2 = new Asistente();
		Asistente asistente2DelSuper2 = new Asistente();
		Asistente asistente3DelSuper2 = new Asistente();
		int salario = asistente1DelSuper1.getSalarioNecesarioParaSerRico();
		asistente1DelSuper1.setSueldoBase(salario+1);
		asistente2DelSuper1.setSueldoBase(salario+1);
		asistente3DelSuper1.setSueldoBase(salario+1);
		asistente4DelSuper1.setSueldoBase(salario);
		asistente1DelSuper2.setSueldoBase(salario+1);
		asistente2DelSuper2.setSueldoBase(salario);
		asistente3DelSuper2.setSueldoBase(salario);
		super1.agregarAsistente(asistente1DelSuper1);
		super1.agregarAsistente(asistente2DelSuper1);
		super1.agregarAsistente(asistente3DelSuper1);
		super1.agregarAsistente(asistente4DelSuper1);
		super2.agregarAsistente(asistente1DelSuper2);
		super2.agregarAsistente(asistente2DelSuper2);
		super2.agregarAsistente(asistente3DelSuper2);
		int resultadoEsperado = 4;
		salon.agregarSuper(super1);
		salon.agregarSuper(super2);
		assertEquals(resultadoEsperado, salon.asistentesRicos());
	}
}
