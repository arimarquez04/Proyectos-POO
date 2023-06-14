package tdj;


public class Luchador {

	static final int CONSTANTE_DE_VAN_DAMME = 10;
	private double fuerzaDeCombate;
	private double energia;
	private String nombre;
	private boolean jiujitsu;
	public Luchador(String nombre, int energia, int fuerzaDeCombate, boolean jiujitsu){
		this.nombre = nombre;
		this.energia = energia;
		this.fuerzaDeCombate = fuerzaDeCombate;
		this.jiujitsu = jiujitsu;
	}
	
	public boolean esChuckNurris(double superarValor) {
		if ((energia>15) && (fuerzaDeCombate * CONSTANTE_DE_VAN_DAMME>superarValor))
		{
			return true;	
		}
		else {
			return false;
		}
	}
	public boolean esInsecto() {
		if(fuerzaDeCombate<500) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void entrenar(double horasDeEntrenamiento){
		fuerzaDeCombate = fuerzaDeCombate +  horasDeEntrenamiento * 0.5;
		energia -=20;
	}
	
	public void dormir() {
		energia +=20;
	}
	
	public final double getFuerzaDeCombate() {
		return fuerzaDeCombate;
	}
	public final void setFuerzaDeCombate(double fuerzaDeCombate) {
		this.fuerzaDeCombate = fuerzaDeCombate;
	}
	public final double getEnergia() {
		return energia;
	}
	public final void setEnergia(double energia) {
		this.energia = energia;
	}
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final boolean isJiujitsu() {
		return jiujitsu;
	}

	public final void setJiujitsu(boolean jiujitsu) {
		this.jiujitsu = jiujitsu;
	}
	
}
