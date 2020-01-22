package gft.com;

public  class FabricaCaneta extends Fabrica {

	@Override
	public Produto criarProduto() {
	  Caneta c  = new Caneta ("vermelha", "compactor",0.5f);
	  return c ;
	}
	


	

}   

  

