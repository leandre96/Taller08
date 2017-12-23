package ensamblajecomputadoras.creacional;



public class BuilderZenbook extends Builder {

	public void buildComputer() {
		computador = new Computador(16,buildOS(),500,buildMainboard(),"Asus","Zenbook");
	}

	public SistemaOperativo buildOS() {
		SistemaOperativo os = new SistemaOperativo("Windows 10",64, "Home");
		return os;
	}

	
	public Mainboard buildMainboard() {
		Mainboard board = new Mainboard("Prime", "Z370");
		return board;
	}

}
