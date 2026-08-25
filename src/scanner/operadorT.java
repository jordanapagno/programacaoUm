package scanner;
import java.util.Scanner;
public class operadorT {

	public static void main(String[] args) {
		 Scanner leia = new Scanner (System.in);
		    String nomeAluno = "Manuel Campos"; 
	        int nota = 6;
	        int frequencia = 75; 
	        System.out.println("nOME : ");
	        nomeAluno = leia.nextLine ();
	        
	        System.out.println("Nota : ");
	        nota = leia.nextInt ();
	        
	        System.out.println("Frequencia:");
	        frequencia = leia.nextInt();
	        
	        
	        if(nota >= 6 && frequencia >=75)
	        {
	        	System.out.println("Aprovado");
	        }
	        else 
	        {
	        	System.out.println("Repovado");
	        }
	        
	        
	}

}
