package ensamblajecomputadoras.creacional;



public class PruebaInicialZenbook extends PruebaZen {

	public PruebaInicialZenbook(Computador computador) {
		this.computador = computador;
		sucesor = new PruebaMediaZenbook(computador);
	}
	@Override
	protected void manejo() {
		if(!computador.getMarca().equals("Asus")) {
			mistake();
			return;
		}
		if(!computador.getOs().getNombre().equals("Windows 10")) {
			mistake();
			return;
		}
		if(computador.getOs().getArquitectura()!=64) {
			mistake();
			return;
		}
		if(!computador.getOs().getVersion().equals("Home")) {
			mistake();
			return;
		}
		sucesor.manejo();
	}


}
