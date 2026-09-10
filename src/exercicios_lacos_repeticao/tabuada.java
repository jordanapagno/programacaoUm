package exercicios_lacos_repeticao;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int cont = 0;
		int num;
		int resultado;
		
		System.out.println("Digite um numero");
		num =leia.nextInt();
		
		while(cont <=10) {
			resultado = num*cont;
			System.out.println(num +" x "+cont +" = "+resultado);
			cont ++;
		}
		

	}

}
