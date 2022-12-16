package src;

public class Saludo extends Thread {

	private int numHilo=0;

	public Saludo(int numHilo) {
		super();
		this.numHilo=numHilo;
	}
	
	public int getNumHilo() {
		return numHilo;
	}

	public void setNumHilo(int numHilo) {
		this.numHilo = numHilo;
	}
	
	@Override
	public void run() {
		System.out.println("---- ARRANCA el Hilo Nº(" + this.numHilo + ")");
		
		for(int i=0; i<10; i++) {
			System.out.println("Hilo Nº(" + this.numHilo + ") te saluda (Vez: " + (i+1) + ")");
		}
		
		System.out.println("---- TERMINA el Hilo Nº(" + this.numHilo + ")");
	}
}
