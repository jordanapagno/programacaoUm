package scanner;
import java.util.Scanner;
public class divisao10 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite o total de alunos: ");
	        int totalAlunos = entrada.nextInt();
	        
	        System.out.print("Digite a quantidade de grupos: ");
	        int grupos = entrada.nextInt();
	        
	       
	        int divisao = totalAlunos / grupos;
	        
	       
	        double divisaoFlu = (double) totalAlunos / grupos;
	        
	        System.out.println("Divisao inteira: " + divisao + 
	                           "\nDivisao flutuante: " + divisaoFlu);
		


	}

}
