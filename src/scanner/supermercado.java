package scanner;
import java.util.Scanner;
public class supermercado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		 System.out.print("Digite o valor do arroz: ");
	        double arroz = entrada.nextDouble();
	        
	        System.out.print("Digite o valor do feijão: ");
	        double feijao = entrada.nextDouble();
	        
	        System.out.print("Digite o valor do óleo: ");
	        double oleo = entrada.nextDouble();
	        
	        double soma = arroz + feijao + oleo;
	        double media = soma / 3;
	        
	        System.out.println("Valor: R$ " + soma);
	        System.out.println("Méida: R$ " + media);
		

	}

}
