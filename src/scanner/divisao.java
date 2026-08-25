package scanner;
import java.util.Scanner;
public class divisao {

	public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número ): ");
        int numA = entrada.nextInt();
        
        System.out.print("Digite o segundo número : ");
        int numB = entrada.nextInt();
        
       
        double divisao = numA / numB;
        
        
        double fluente = (double) numA / numB;
        
        System.out.println("Divisao: " + divisao);
        System.out.println("Divisao Fluente: " + fluente);

	}

}
