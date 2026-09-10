package exercicios_lacos_repeticao;

import java.util.Scanner;

public class somaateneg {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int cont =0;
		int soma=0;
		int num;
		
		while(2>1)
			
		{
			System.out.println("Escreva um numero: ");
			num = leia.nextInt();
			if (num < 0)
			{
				break;
			}
			
			soma += num;
			cont++;
		}
		System.out.println("Soma = "+soma);
	}

}
