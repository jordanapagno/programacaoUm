package exercicios_condicionais_if;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
		
		double media;
		
		System.out.println("Escreva sua media ");
		media = leia.nextDouble();
		
		if (media >=7) {
			System.out.println("Aluno Aprovado!");
			if(media>=9.5) {
				System.out.println("Aluno Aprovado com distinção");
			}
		}
		

	}

}
