package scanner;
import java.util.Scanner;
public class Combustivel {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite a distância percorrida (km): ");
	        double distancia = entrada.nextDouble();
	        
	        System.out.print("Digite a quantidade de litros consumidos: ");
	        double litros = entrada.nextDouble();
	        
	        double consMedio = distancia / litros;
	        double litros100 = 100 / consMedio;
	        
	        System.out.println("Consumo Médio: " + consMedio + "\nQuantidade de litros para percorrer 100km: " + litros100);

	}

}
