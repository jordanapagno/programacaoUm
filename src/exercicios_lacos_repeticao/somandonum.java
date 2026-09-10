package exercicios_lacos_repeticao;

import java.util.Scanner;

public class somandonum {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int cont=0;
		int soma=0;
		int num =0;
		
		do
		{
			System.out.println("Escreva um nuemro: ");
			num = leia.nextInt();
			soma +=num;
			cont ++;
		}while(num<5);
		System.out.println("Soma= "+soma);
		
		
	

	}

}
