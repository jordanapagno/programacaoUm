package exercicios_condicionais_if;
import java.util.Scanner;
public class exercico6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		System.out.println("escreva um numero inteiro");
		num =leia.nextInt();
		
		if (num%2==0) {
			System.out.println("Numero par");
		}
		else {
			System.out.println("Numero impar");
		}
	}

}
