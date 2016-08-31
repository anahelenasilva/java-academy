/*
 * Ana Helena da Silva
 * anahelenarp@hotmail.com
   Imprima os números ímpares compreendidos entre 1 e 50
 */

public class Exercicio1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}