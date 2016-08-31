package classes;

public class Mesa {

	public static int pes;
	
	public static void girar(){
		System.out.println("Girou a Mesa");
		//colocar(); //NÃO PODE
	}
	
	public void colocar() {
		girar();
	}
}
