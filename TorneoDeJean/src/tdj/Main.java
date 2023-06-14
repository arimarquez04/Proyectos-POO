package tdj;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double superarValor = 30;
		Luchador luchador1 = new Luchador("Ariel", 40, 500, true);	
		Luchador luchador2 = new Luchador("Lucas", 30, 40, false);
		Luchador luchador3 = new Luchador("Javier", 20, 40, true);
		Luchador luchador4 = new Luchador("Matias", 10, 40, false);
		Libro libro = new Libro();
		libro.agregarPersonaje(luchador1);
		libro.agregarPersonaje(luchador2);
		libro.agregarPersonaje(luchador3);
		libro.agregarPersonaje(luchador4);
		
		System.out.println("insectos()");
		libro.insectos();
		System.out.println("losChuchNorris()");
		libro.losChuckNorris(superarValor);
		System.out.println("hayUnJiuJitsu()");
		if(libro.hayUnJiuJitsu()==true) {
			System.out.println("Hay al menos un luchador que haga JiuJitsu");
		}
		else {
			System.out.println("No hay ningun luchador que haga JiuJitsu");
		}
		System.out.println("laCantidadDeJiuJitsus()");
		int cantidadDeJiuJitsus = libro.laCantidadDeJiuJitsus();
		System.out.println("Hay " + cantidadDeJiuJitsus +" luchadores que hacen JiuJitsu");
		/*
		//Llamar a esChuckNorris
			if(==true){
				System.out.println("El contrincante [" + luchador1.getNombre() + "] es Chuck Norris");
			}
			else {
				System.out.println("El contrincante [" + luchador1.getNombre() + "] no es Chuck Norris");
			}
			
		
			//Llamar a esInsecto
			if(luchador1.esInsecto()==true){
				System.out.println("El contrincante [" + luchador1.getNombre() + "] es Insecto");
				System.out.println("Fuerza de Combate: " + luchador1.getFuerzaDeCombate());
			}
			else {
				System.out.println("El contrincante [" + luchador1.getNombre() + "] no es Insecto");
				System.out.println("Fuerza de Combate: " + luchador1.getFuerzaDeCombate());
			}
			
		 //LLamar a entrenar()
			int horasDeEntrenamiento = 5;
			luchador1.entrenar(horasDeEntrenamiento);			
			double fuerzaObtenida = 0.5 * horasDeEntrenamiento;			
			System.out.println("Fuerza Obtenida: ["+ fuerzaObtenida + "]  Total: [" + luchador1.getFuerzaDeCombate() + "]");
			
		//Llamar a dormir()
			luchador1.dormir();
			System.out.println("Energia + 20   Total: [" + luchador1.getEnergia() + "]");
			*/
			
		}		
}
