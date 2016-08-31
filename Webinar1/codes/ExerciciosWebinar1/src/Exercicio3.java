/*
 * Ana Helena da Silva
 * anahelenarp@hotmail.com
   Imprima o valor da média aritimética entre as seguintes notas de um aluno: 7,5 | 8,5 | 8,0 | 9,5 | 7,0   
 */

public class Exercicio3 {
	public static void main(String[] args) {
		
		double media = 0;
		double soma = 0;
		double[] numeros = { 7.5, 8.5, 8.0, 9.5, 7.0 };
		for(int i = 0; i < numeros.length; i++) {
			soma = soma + numeros[i];
		}
		
		media = soma / numeros.length;
		System.out.println(media);
	}
}