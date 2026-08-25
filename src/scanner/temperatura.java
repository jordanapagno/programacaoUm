package scanner;
import java.util.Scanner;
public class temperatura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double temperatura;
		String dia;
		System.out.println("Escreva a temperatura:");
		temperatura= leia.nextDouble ();
		
		if(temperatura > 25)
		{
			dia = "Dia Quente";
		}
		else 
		{
			dia = "Dia Agradavel";
		}
		
		System.out.println("Temperatura "+temperatura+"°C\nSituação: " +dia);

	}

}
