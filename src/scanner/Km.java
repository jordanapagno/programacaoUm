package scanner;
import java.util.Scanner;
public class Km {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a distância em quilômetros: ");
        int quilometros = entrada.nextInt();
        
        double metros = 0;
        
        
        metros = quilometros * 1000;
        
        System.out.println("Distancia em metros : " + metros);

	}

}
