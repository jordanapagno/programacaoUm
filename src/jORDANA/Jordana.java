package jORDANA;
/*
 * Classe de teste para demonstrar a soma de dois valores inteiros 
 * 
 * @autor Jordan Pagno
 */
public class Jordana {
	
	/*
	 * Método que calculaa soma de dois valores inteiros 
	 * @param numA primeiro valor da soma 
	 * @param numB segundo valor da soma
	 * @return resultado da soma 
	 */
	public int somar(int numA, int numB) {
		return numA + numB;
	}
	/*
	 * 
	 * Método principla de aplicação 
	 * @param argumento de entrada da aplicação
	 */

	public static void main(String[] args) {
		Jordana resultado = new Jordana();
		
		
		System.out.println(resultado.somar(2, 3));
	
		

	}

}
