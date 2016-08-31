package classes;

public class Automovel {

	boolean motorLigado = false;
	
	public void ligar(){
		motorLigado = true;
		System.out.println("Automóvel Ligado");
	}
	
	public void acelerar(){
		System.out.println("Automóvel Acelerou");
	}
}