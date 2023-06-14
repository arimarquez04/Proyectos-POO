package CarpinchosA;

public class Canasta {
	private int litrosDeAguaCaliente;
	private int kilosDeYerba;
	private final static int LITROS_NECESARIOS_PARA_TODO_EL_DIA = 5;
	private final static int KILOS_NECESARIOS_PARA_TODO_EL_DIA = 2;

	public Canasta(int litrosDeAguaCaliente, int kilosDeYerba) {
		this.litrosDeAguaCaliente = litrosDeAguaCaliente;
		this.kilosDeYerba = kilosDeYerba;
	}

	public Canasta() {
	}

	public boolean alcanzaParaTodoElDia() {
		if ((litrosDeAguaCaliente > LITROS_NECESARIOS_PARA_TODO_EL_DIA)
				&& kilosDeYerba > KILOS_NECESARIOS_PARA_TODO_EL_DIA) {
			return true;
		} else {
			return false;
		}
	}

	public int getLitrosDeAguaCaliente() {
		return litrosDeAguaCaliente;
	}

	public void setLitrosDeAguaCaliente(int litrosDeAguaCaliente) {
		this.litrosDeAguaCaliente = litrosDeAguaCaliente;
	}

	public int getKilosDeYerba() {
		return kilosDeYerba;
	}

	public void setKilosDeYerba(int kilosDeYerba) {
		this.kilosDeYerba = kilosDeYerba;
	}

	public static int getLitrosNecesariosParaTodoElDia() {
		return LITROS_NECESARIOS_PARA_TODO_EL_DIA;
	}

	public static int getKilosNecesariosParaTodoElDia() {
		return KILOS_NECESARIOS_PARA_TODO_EL_DIA;
	}
}
