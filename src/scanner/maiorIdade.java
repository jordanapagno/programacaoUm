package scanner;
import java.util.Scanner;
public class maiorIdade {

	public static void main(String[] args) {
		int idade ;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreav sua idade");
		idade = leia.nextInt();
		if(idade >= 18)
		{
			System.out.println("Maior de Idade");
		}
		else
		{
			System.out.println("Menor de idade");
		}

	}

}
