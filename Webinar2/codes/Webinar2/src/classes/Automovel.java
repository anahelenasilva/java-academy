package classes;

public class Automovel {

	boolean motorLigado = false;
	
	public void ligar(){
		motorLigado = true;
		System.out.println("Autom�vel Ligado");
	}
	
	public void acelerar(){
		System.out.println("Autom�vel Acelerou");
	}
}