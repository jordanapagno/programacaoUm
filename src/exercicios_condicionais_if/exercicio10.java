package exercicios_condicionais_if;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double temp;
		
		System.out.println("Escreva atemperatura");
		temp = leia.nextDouble();
		
		if (temp>=30) {
			System.out.println("Esta calor");
		}
		else {
			System.out.println("A temperatura esta agradavel");
		}
		

	}

}
