package SalonDeLaJusticia;

public class Asistente {
	private String nombre;
	private double sueldoBase;
	private final  static int SALARIO_NECESARIO_PARA_SER_RICO = 60000;

	public double salario() {
		return sueldoBase;
	}

	public boolean esRico() {
		if (salario() > SALARIO_NECESARIO_PARA_SER_RICO) {
			return true;
		} else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public static int getSalarioNecesarioParaSerRico() {
		return SALARIO_NECESARIO_PARA_SER_RICO;
	}


}
