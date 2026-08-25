package scanner;
import java.util.Scanner;
public class Veiculo {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite a marca do carro: ");
	        String marca = entrada.nextLine();
	        
	        System.out.print("Digite o modelo do carro: ");
	        String modelo = entrada.nextLine();
	        
	        System.out.print("Digite a cor do carro: ");
	        String cor = entrada.nextLine();
	        
	        System.out.print("Digite o valor do carro: ");
	        double valor = entrada.nextDouble();
	        
	        System.out.print("O carro é automático? (true/false): ");
	        boolean automatico = entrada.nextBoolean();
	        
	        System.out.println("----DADOS----\n" + 
	                           "MARCA: " + marca + 
	                           "\nCor: " + cor + 
	                           "\nValor: " + valor + 
	                           "\nModelo : " + modelo);
	        
	        if (automatico) {
	            System.out.println("Automatico: SIM");
	        }
	}

}
