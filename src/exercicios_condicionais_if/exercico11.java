package exercicios_condicionais_if;
import java.util.Scanner;
public class exercico11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Escreva sua media ");
		nota = leia.nextDouble();
		
		if (nota >=9) {
			System.out.println("A");
		}
		else if (nota>=7)
		{
			System.out.println("B");
		}
		else if (nota>=5)
		{
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}

	}

}
