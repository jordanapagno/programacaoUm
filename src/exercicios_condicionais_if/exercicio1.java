package exercicios_condicionais_if;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int idade;
		System.out.println("Escreva sua idade:  ");
		idade = leia.nextInt();
		
		if(idade >= 18)
		{
			System.out.println("Maior de idade");
		}
		else {
			System.out.println("Menor de idade");
		}

	}

}
