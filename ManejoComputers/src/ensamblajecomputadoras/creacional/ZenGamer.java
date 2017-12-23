package ensamblajecomputadoras.creacional;



public class ZenGamer extends Decorator{
	public ZenGamer(Icomputador computador) {
		super(computador);
	}
	public String especificacionesTecnicas() {
		return this.computador.especificacionesTecnicas()
				+"Memoria adicional: "+16+"\n" ;
	}

}
