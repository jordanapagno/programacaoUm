package scanner;
import java.util.Scanner;
public class ternario19 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite o saldo da conta: ");
	        double saldo = entrada.nextDouble();
	        
	        String situacao;
	        
	      
	        if (saldo > 0) {
	            situacao = "Saldo Positivo";
	        } else {
	            situacao = "Saldo Negativo";
	        }
	        
	        System.out.println("\nSaldo: " + saldo + "\nSituação: " + situacao);

	}
	
	

}
