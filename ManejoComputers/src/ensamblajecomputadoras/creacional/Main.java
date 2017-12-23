package ensamblajecomputadoras.creacional;



public class Main {
	public static void main(String[] args) {
		Builder b1 = new BuilderZenbook();
		b1.buildComputer();
		
		
		Builder b2 = new BuilderRoge();
		b2.buildComputer();
		
		
		Prueba test1 = new PruebaRoge(b2.getComputador());
		test1.manejo();
		
		Prueba test2 = new PruebaZen(b1.getComputador());
		test2.manejo();
		
		
	}
}
