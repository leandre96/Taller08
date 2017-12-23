package ensamblajecomputadoras.creacional;



public abstract class Decorator implements Icomputador{
protected Icomputador computador;
	
	public Decorator(Icomputador computador) {
		this.computador = computador;
	}
	
	public abstract String especificacionesTecnicas();
}
