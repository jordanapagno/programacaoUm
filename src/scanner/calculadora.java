package scanner;
import java.util.Scanner;
public class calculadora {
	

	public int somar(int numA, int numB) {
		return numA + numB;
	}
	public int subtracao(int numA, int numB) {
		return numA - numB;
	}
	
	public int multiplicacao(int numA, int numB) {
		return numA * numB;
	}
	
	public int divisao(int numA, int numB) {
		return numA / numB;
	}
	
	public int resto(int numA, int numB) {
		return numA % numB;
	}
	
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		calculadora calc = new calculadora(); 
		
		System.out.println("Digite o primeiro número:");
        int numA = leia.nextInt();

        System.out.println("Digite o segundo número:");
        int numB = leia.nextInt();

        System.out.println("Resultados:");
        System.out.println("Soma: " + calc.somar(numA, numB)); 
        System.out.println("Subtração: " + calc.subtracao(numA, numB)); 
        System.out.println("Multiplicação: " + calc.multiplicacao(numA, numB)); 
        System.out.println("Divisão: " + calc.divisao(numA, numB)); 
        System.out.println("Resto: " + calc.resto(numA, numB)); 
        
		

	}

}
