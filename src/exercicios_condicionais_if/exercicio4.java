package exercicios_condicionais_if;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int num;
		
		
		System.out.println("EScreva um numero ");
		num =leia.nextInt();
		
		if (num % 5 ==0) {
			System.out.println("o NUMERO É MULTILPLO DE 5");
		}

	}

}
