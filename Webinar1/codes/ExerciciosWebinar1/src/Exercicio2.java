/*
 * Ana Helena da Silva
 * anahelenarp@hotmail.com
   Imprima a soma dos números compreendidos entre 1 e 10. 
   Utilize uma estrutura de repetição para fazer o cálculo.
 */

public class Exercicio2 {
	public static void main(String[] args) {
		
		int contador = 0;
		for(int i = 1; i <= 10; i++) {
			contador = contador + i;
		}
		
		System.out.println(contador);
	}
}