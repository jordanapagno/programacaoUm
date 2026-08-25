package scanner;
import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a nota inicial: ");
        double notaInicial = entrada.nextDouble();
        
       
        int notaInteira = (int) notaInicial;
        
       
        double notaConvertida = (double) notaInteira;
        
        System.out.println("Nota Inicial: " + notaInicial + 
                           "\nNota Inteira: " + notaInteira + 
                           "\nNota Convertida: " + notaConvertida);
		
	}

}
