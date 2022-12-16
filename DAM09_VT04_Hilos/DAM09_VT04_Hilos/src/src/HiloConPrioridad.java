package src;

public class HiloConPrioridad extends Thread {
	
	public HiloConPrioridad(String nombre, int prioridad) {
		super();
		this.setName(nombre);
		this.setPriority(prioridad);
	}
	
	@Override
	public void run() {
		System.out.println(
				"\t###### "+ this + " ######" +
				"\n\tDentro del Hilo: " + Thread.currentThread().getName() +
				"\n\tPrioridad: " + Thread.currentThread().getPriority() +
				"\n\tID: " + Thread.currentThread().getId() +
				"\n\tHilos Activos: " + Thread.activeCount() +
				"\n\t############################\n\n");
	}
		
	@Override
	public String toString() {
		return "Hilo: " + this.getName() + " & Prioridad: " + this.getPriority();
	}
	
}
