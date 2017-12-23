package ensamblajecomputadoras.creacional;



public class PruebaMedioRoge extends PruebaRoge {
public PruebaMedioRoge() {}
	
	public PruebaMedioRoge(Computador computador) {
		this.computador = computador;
		sucesor = new PruebaCompletaRoge(computador);
	}
	
	@Override
	protected void manejo() {
		if(computador.getModelo()!="ROGE") {
			mistake();
			return;
		}
		if(computador.getAlmacenamiento()!=1000) {
			mistake();
			return;
		}
		sucesor.manejo();
	}

}
