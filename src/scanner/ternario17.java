package scanner;
import java.util.Scanner;
public class ternario17 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a quantidade em estoque: ");
        int estoque = entrada.nextInt();
        
        // Avalia se o estoque é baixo ou suficiente
        if (estoque < 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque Suficiente");
        }

	}

}
