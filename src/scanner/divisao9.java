package scanner;
import java.util.Scanner;
public class divisao9 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite o valor de x: ");
	        int x = entrada.nextInt();
	        
	        System.out.print("Digite o valor de y: ");
	        int y = entrada.nextInt();
	        
	        int divisaoInt = 0;
	        double divisorFlu = (double) x / y;
	        
	        divisaoInt = x / y;
	        
	        System.out.println("Divisao inteira: " + divisaoInt + 
	                           "\nDivisor flutuante: " + divisorFlu);
	        
		

	}

}
