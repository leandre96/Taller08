package ensamblajecomputadoras.creacional;



public class PruebaInicialRoge extends PruebaRoge {

public PruebaInicialRoge() {}	
	
	public PruebaInicialRoge(Computador computador) {
		this.computador = computador;
		sucesor = new PruebaMedioRoge(computador);
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
		if(!computador.getOs().getVersion().equals("PRO")) {
			mistake();
			return;
		}
		sucesor.manejo();
	}

}
