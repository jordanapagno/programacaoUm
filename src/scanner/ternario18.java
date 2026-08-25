package scanner;
import java.util.Scanner;
public class ternario18 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a média do aluno: ");
        double media = entrada.nextDouble();
        
       
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
	}

}
