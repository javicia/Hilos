package src;

public class Principal {

	public static void pruebaMiHilo(int numHilos) {
		// Creamos n hilos tipo MiHilo y los lanzamos
		for (int i = 0; i < numHilos; i++) {
			new MiHilo("HiloNum-" + i).start();
		}
	}

	public static void pruebaSaludos() {
		// Creamos 5 hilos
		for (int i = 0; i < 5; i++) {
			Saludo saludo = new Saludo(i + 1);
			saludo.start();
		}
		//System.out.println("######### FIN DEL PROGRAMA #########");
	}

	public static void pruebaSaludos2() throws InterruptedException {
		// Creamos 5 hilos
		for (int i = 0; i < 5; i++) {
			Saludo saludo = new Saludo(i + 1);
			saludo.start();
			saludo.join(); // espera a que el hilo acabe
		}
		System.out.println("######### FIN DEL PROGRAMA #########");
	}
	
	public static void pruebaHilosConPrioridad() {
		//Mostramos la información del hilo principal
		Thread.currentThread().setName("Principal");
		
		System.out.println(
				"\t###### HILO PRINCIPAL ######" +
				"\n\tDentro del Hilo: " + Thread.currentThread().getName() +
				"\n\tPrioridad: " + Thread.currentThread().getPriority() +
				"\n\tID: " + Thread.currentThread().getId() +
				"\n\tHilos Activos: " + Thread.activeCount() +
				"\n\t############################\n\n");
		
		HiloConPrioridad hPr;
		
		for(int i=0; i<3; i++) {
			String nombre="HILO "+i;
			int prioridad=i+1;
			hPr=new HiloConPrioridad(nombre,prioridad);
			hPr.start();
		}
		
		// Mostramos la información al final
		System.out.println("3 HILOS CREADOS .....");
		System.out.println("HILOS ACTIVOS: " + Thread.activeCount());
	}

	public static void main(String[] args) {
		try {
			//pruebaMiHilo(5);
			//pruebaSaludos();
			//pruebaSaludos2();
			pruebaHilosConPrioridad();
		}catch(Exception e) {
			System.err.println("Ha ocurrido un error: " + e.getMessage());
			e.printStackTrace(System.err);
		}
	}

}
