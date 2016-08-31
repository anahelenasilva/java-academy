import java.text.DecimalFormat;

/*
 * Ana Helena da Silva
 * anahelenarp@hotmail.com
   M = P * (1 + i) elevado a n
   M = montante final
   P = valor investido inicialmente
   i = Taxa de juros (experessa em valor decimal)
   n = tempo (em meses)
 */

public class Exercicio4 {
	public static void main(String[] args) {
		
		double m = 0;
		double p = 5000;
		double i = 0.01;
		int n = 12;
		
		m = p * (Math.pow((1 + i), n));
		
		System.out.println("Valor sem formatação: " + m);
		DecimalFormat df = new DecimalFormat("#.##"); //Pesquisado no google	
		System.out.println("Valor formatado: " + df.format(m));
	}
}