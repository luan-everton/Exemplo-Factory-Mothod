package gft.com;

public class Main {

	public static void main(String[] args) {
		Fabrica fabricaCaneta = new FabricaCaneta();
		
		Caneta caneta = (Caneta)fabricaCaneta.criarProduto();
		
		caneta.status();
	
		
		
	}

}
