package cuidarEdu;

public class Persona {

	private int salidas;
	private int dni;
	private String nombre;
	private double temperatura;

	public Persona(String nombre, int salidas, int dni) {
		this.nombre = nombre;
		this.salidas = salidas;
		this.dni = dni;
	}
	public Persona(String nombre, double temperatura) {
		this.nombre = nombre;
		this.temperatura = temperatura;
	}
	public Persona(int dni) {
		this.dni = dni;
	}

	
	public void salir() {
		salidas += 1;
	}

	public boolean meAislo() {
		if (temperatura > 37) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estoyBuscandoAlVirus() {
		if (salidas > 10) {
			return true;
		} else {
			return false;
		}

	}

//todos los true arriba
	/*
	 * puedoIrAComprarAUnLocalEnTalDía: la respuesta es sí (verdadero) si meAislo es
	 * falso y el local es esencial. En el caso que sea no esencial, hay que
	 * verificar el último número de DNI: a. Si el último número de DNI y el número
	 * de día coinciden (ambos pares o ambos impares) la respuesta es sí. b. Caso
	 * contrario la respuesta será no (falso).
	 */
	public boolean puedoSalirAComprar(Local farmaciaDelOeste, double temperatura, int dia) {
		if(
				((farmaciaDelOeste.esEscencial()==true)&&(meAislo()==false))||
				((farmaciaDelOeste.esEscencial()==false)&&(dni%2==0)&&(dia%2==0))||
				((farmaciaDelOeste.esEscencial()==false)&&(dni%2!=0)&&(dia%2!=0))
			) {
			return true;
			
		}
		else {
			return false;
		}
		
		
		
	}

	/*
	 * public boolean puedoSalirAComprar(Local farmaciaDelOeste, double temperatura,
	 * int dia) { if ((farmaciaDelOeste.esEscencial() == true) &&
	 * (meAislo(temperatura) == false)) { return true; } else { if (((dni % 2 == 0)
	 * && (dia % 2 == 0)) || ((dni % 2 != 0) && (dia % 2 != 0))) { return true; }
	 * else { return false; } } }
	 */

	public int getSalidas() {
		return salidas;
	}

	public void setSalidas(int salidas) {
		this.salidas = salidas;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperaturaIngresada) {
		this.temperatura = temperaturaIngresada;
		
	}

}