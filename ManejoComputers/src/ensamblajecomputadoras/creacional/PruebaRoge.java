package ensamblajecomputadoras.creacional;



public class PruebaRoge extends Prueba {
public PruebaRoge() {}
	
	public PruebaRoge(Computador computador) {
		super(computador);
		sucesor = new PruebaInicialRoge(computador);
	}
	
	protected void manejo() {
		sucesor.manejo();
	}
}
