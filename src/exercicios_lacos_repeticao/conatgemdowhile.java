package exercicios_lacos_repeticao;

import java.util.Scanner;

public class conatgemdowhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int cont =0;
		int inicio;
		int fim;
		
		 System.out.print("Digite o número de início: ");
	     inicio = leia.nextInt();
	      
	      System.out.print("Digite o número de fim: ");
	      fim = leia.nextInt();
		
		 if (inicio <= fim) {
	            int atual = inicio;
	            do {
	                System.out.println(atual);
	                atual++;
	            } while (atual <= fim);
	        } 
		
	

	}

}
