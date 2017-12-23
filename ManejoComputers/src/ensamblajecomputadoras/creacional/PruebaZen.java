package ensamblajecomputadoras.creacional;



public class PruebaZen extends Prueba {
public PruebaZen() {}
	
	public PruebaZen(Computador computador) {
		super(computador);
		sucesor = new PruebaInicialZenbook(computador);
	}

	@Override
	protected void manejo() {
		sucesor.manejo();
	}
}
