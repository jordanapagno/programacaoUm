package exercicios_condicionais_if;

import java.util.Scanner;

public class exercico13 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Escreva sua nota ");
		nota = leia.nextDouble();
		
		if (nota >=90) {
			System.out.println("Excelente");
		}
		else if (nota>=70)
		{
			System.out.println("Bom");
		}
		else if (nota>=50)
		{
			System.out.println("Regular");
		}
		else {
			System.out.println("Insuficiente");
		}

	}

}
