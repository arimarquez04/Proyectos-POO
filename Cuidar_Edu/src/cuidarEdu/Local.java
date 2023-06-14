package cuidarEdu;

public class Local {

	String nombre;
	String rubro;
	public Local(String nombre, String rubro){
		this.nombre = nombre;
		this.rubro = rubro;
	}
	public boolean esEscencial() {
		
		if(("alimentacion".equalsIgnoreCase(rubro)==true)||("farmacia".equalsIgnoreCase(rubro)==true)) {
			return true;
		}
		else {
			return false;
		}
		/*
		if((rubro=="alimmentacion") || (rubro=="farmacia")) {
			
			return true;
		}
		else {
			return false;
		}*/
		
	}
	
}