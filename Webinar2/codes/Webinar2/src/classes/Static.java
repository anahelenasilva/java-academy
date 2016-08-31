package classes;

public class Static {

	public static void main(String[] args) {
		//Mesa mesa = new Mesa();
		//mesa.girar();
		
		Mesa.girar();
		Mesa.pes = 4;
		
		System.out.println(Mesa.pes);
	}
}
