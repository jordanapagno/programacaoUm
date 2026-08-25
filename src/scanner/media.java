package scanner;
import java.util.Scanner;
public class media {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota (n1): ");
        double n1 = entrada.nextDouble();
        
        System.out.print("Digite a segunda nota (n2): ");
        double n2 = entrada.nextDouble();
        
        System.out.print("Digite a terceira nota (n3): ");
        double n3 = entrada.nextDouble();
        
        double soma = 0;
        double media = 0;
        
        soma = n1 + n2 + n3;
        media = soma / 3;
        
        System.out.println("Soma: " + soma + "\nMédia: " + media);

	}

}
