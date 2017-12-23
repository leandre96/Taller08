package ensamblajecomputadoras.creacional;



public class PruebaMediaZenbook extends PruebaZen {

public PruebaMediaZenbook() {}
	
	public PruebaMediaZenbook(Computador computador) {
		this.computador = computador;
		sucesor = new PruebaCompletaZenbook(computador);
	}
	
	public void handle() {
		if(!computador.getModelo().equals("Zenbook")) {
			mistake();
			return;
		}
		if(computador.getAlmacenamiento()!=500) {
			mistake();
			return;
		}
		sucesor.manejo();
	}

}
