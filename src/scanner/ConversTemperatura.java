package scanner;
import java.util.Scanner;
public class ConversTemperatura {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite a temperatura inicial: ");
	        double temperatura = entrada.nextDouble();
	       
	        int temperaturaInteira = (int) temperatura;
	        
	        
	        double temperaturaConvertida = (double) temperaturaInteira;
	        
	        System.out.println("Temperatura Inicial: " + temperatura + 
	                           "\nTemperatura Inteira: " + temperaturaInteira + 
	                           "\nTemperartura Convertida: " + temperaturaConvertida);
	        
	}

}
