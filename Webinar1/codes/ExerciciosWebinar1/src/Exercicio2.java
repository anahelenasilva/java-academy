/*
 * Ana Helena da Silva
 * anahelenarp@hotmail.com
   Imprima a soma dos n�meros compreendidos entre 1 e 10. 
   Utilize uma estrutura de repeti��o para fazer o c�lculo.
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