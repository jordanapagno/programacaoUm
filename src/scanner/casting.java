package scanner;
import java.util.Scanner;
public class casting {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
         double salario; 
        
        System.out.println("Escreva seu salario:"); 
        salario = leia.nextDouble(); 
        
        int salarioIn = (int) salario; 
        double valorInt = (double) salario; 
        
        System.out.println("Double : " + salario); 
        System.out.println("Inteiro : " + salarioIn); 
        System.out.println("Double 2: " + valorInt); 	
        }

}
