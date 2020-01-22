package gft.com;

public class Caneta extends Produto{
	private String cor;
	private String marca;
	private float  ponta;
	public Caneta(String cor, String marca, float ponta) {
		super();
		this.cor = cor;
		this.marca = marca;
		this.ponta = ponta;
	}
	public Caneta() {
		super();
	}
	  
	public void status() {
		 System.out.println("Cor: " + cor );
		 System.out.println("Marca: " + marca);
		 System.out.println("Tamanho da ponta : " + ponta );
		
	}
	

}
