package exercicios_condicionais_if;

import java.util.Scanner;

public class exercico15 {

	public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
		
		double altura;
		double peso;
		double imc =0; 
		
		System.out.println("Escreva sua idade ");
		altura = leia.nextDouble();
		System.out.println("Escreva seu peso  ");
		peso = leia.nextDouble();
		
		imc = peso /(altura*altura);
		
		if (imc<18.5) {
			System.out.println("Magreza");
		}
		else if (imc <= 24.9)
		{
			System.out.println("Saudavel");
		}
		else if (imc <=34.9)
		{
			System.out.println("Obesidade Grau I");
		}
		else if (imc <=39.9){
			System.out.println("Obesidade Grau II");
		}
		else {
			System.out.println("Obesidade Grau III");
		}

	}

}
