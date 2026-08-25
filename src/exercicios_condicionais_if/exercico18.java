package exercicios_condicionais_if;

import java.util.Scanner;

public class exercico18 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		double media;
		double frequencia;
		
		System.out.println("Escreva sua media ");
		media = leia.nextDouble();
		System.out.println("Escreva sua frequencia ");
		frequencia = leia.nextDouble();
		
		if (media >=7 && frequencia >=75) {
			System.out.println("Aprovado");
			if(media >=9.5 )
			{
				System.out.println("Aluno aprovado com merito");
			}
		}
		
		else {
			System.out.println("Reprovado");
		}

	}

}
