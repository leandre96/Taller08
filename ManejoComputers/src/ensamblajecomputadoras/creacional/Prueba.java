package ensamblajecomputadoras.creacional;



public abstract class Prueba {
	protected Prueba sucesor;
	protected Computador computador;
	
	public Prueba() {}
	
	public Prueba(Computador computador) {
		this.computador = computador;
	}
	
	protected void mistake() {
		System.out.println("Hay un error en la arquitectura del computador.\n");
	}
	
	protected void satisfactory() {
		System.out.println("El computador se encuentra correctamente.\n");
	}
	
	protected abstract void manejo();
}
