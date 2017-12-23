package ensamblajecomputadoras.creacional;



public class PruebaCompletaRoge extends PruebaRoge {
public PruebaCompletaRoge() {}
	
	public PruebaCompletaRoge(Computador computador) {
		this.computador = computador;
		sucesor = null;
	}
	
	@Override
	protected void manejo() {
		if(!computador.getPlaca().getModelo().equals("Strix")) {
			mistake();
			return;
		}
		if(!computador.getPlaca().getNumeracion().equals("x99")) {
			mistake();
			return;
		}
		satisfactory();
	}
}
