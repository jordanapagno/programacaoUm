package scanner;
import java.util.Scanner;
public class Concate15 {

	public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do produto: ");
        String produto = entrada.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();
        
        System.out.print("Digite a quantidade em estoque: ");
        int estoque = entrada.nextInt();
        
        System.out.println("===============\nProduto: " + produto + "\nPreço: " + preco + "\nestoque: " + estoque + "\n==============");
	}

}
