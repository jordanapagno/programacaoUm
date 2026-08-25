package exercicios_condicionais_if;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Escreva o 1 numero:");
		num1=leia.nextInt();
		
		System.out.println("Escreva o 2 numero:");
		num2=leia.nextInt();
		
		if (num1>num2)
		{
			System.out.println("O primeiro numero é maior ");
		}
		else {
			System.out.println("O segundo numero é maior ");
		}

	}

}
