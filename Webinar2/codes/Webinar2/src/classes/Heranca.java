package classes;

public class Heranca {

	public static void main(String[] args) {
		//Automovel auto = new Automovel();
		//auto.ligar();
		//auto.acelerar();
		
		//Carro carro = new Carro();
		//carro.ligar();
		//carro.acelerar();
		//carro.andarRe();
		
		//Automovel auto2 = new Carro();
		//Carro carro2 = (Carro)auto2;
		//auto2.acelerar();
		//carro2.andarRe();
		
		Automovel auto2 = new Carro();
		//Automovel auto2 = new Moto();
		
		if(auto2 instanceof Carro){
			Carro carro2 = (Carro)auto2;
			carro2.acelerar();
			carro2.andarRe();			
			
		}
		else {
			System.out.println("NÃO PODE");
		}
	}
}
