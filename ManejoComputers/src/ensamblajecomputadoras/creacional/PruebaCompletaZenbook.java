package ensamblajecomputadoras.creacional;



public class PruebaCompletaZenbook extends PruebaZen {
public PruebaCompletaZenbook() {}
	
	public PruebaCompletaZenbook(Computador computador) {
		this.computador = computador;
		sucesor = null;
	}
	
	public void manejo() {
		if(!computador.getPlaca().getModelo().equals("Prime")) {
			mistake();
			return;
		}
		if(!computador.getPlaca().getNumeracion().equals("Z370")) {
			mistake();
			return;
		}
		satisfactory();
	}
	

}
