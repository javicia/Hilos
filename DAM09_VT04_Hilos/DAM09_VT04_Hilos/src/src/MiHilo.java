package src;

/**
 * Clase Mihilo
 * @author Tever
 *
 */
public class MiHilo extends Thread {
	
	private static int numMax=50;
	private String nombreHilo;

	public MiHilo(String nombreHilo) {
		super();
		this.nombreHilo=nombreHilo;
	}
	
	@Override 
	public void run() {
		for(int i=0; i<numMax; i++) {
			System.out.println("Nuevo " + this.getNombreHilo() + " en Java ("+i+")");
		}
	}
	
	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}
	
}
