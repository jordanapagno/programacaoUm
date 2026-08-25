package scanner;
import java.util.Scanner;
public class Parcelada22 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = entrada.nextLine();
        
        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = entrada.nextDouble();
        
        System.out.print("Digite a quantidade de produtos comprados: ");
        int quantidade = entrada.nextInt();
        
        System.out.print("Digite a quantidade de parcelas desejada: ");
        int parcelas = entrada.nextInt();
        
        // Faz os cálculos da compra
        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;
        
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário do produto: R$ " + valorUnitario);
        System.out.println("Quantidade de produtos comprados: " + quantidade);
        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);
		

	}

}
