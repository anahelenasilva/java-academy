package classes;

public class Carro extends Automovel { //APENAS UMA HERAN�A

	@Override
	public void acelerar() {
		super.acelerar(); //chama o Acelerar do Automovel
		System.out.println("Carro Acelerou");
	}
	
	public void andarRe() {
		System.out.println("Caro andou de r�");
	}
}
