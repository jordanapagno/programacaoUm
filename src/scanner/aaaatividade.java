package scanner;

import java.util.Scanner;

public class aaaatividade {

	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nomePro;
		int codigo;
		double preco;
		int estoque;
		
		 
		
		System.out.println("Escreva o nome do Produto: ");
		nomePro = leia.nextLine();
		
		System.out.println(" Escreva o codigo");
		codigo = leia.nextInt();
		
		System.out.println(" Escreva o preço");
		preco = leia.nextDouble();
		
		System.out.println(" Escreva o estoque");
		estoque = leia.nextInt();
		
		
		
		
		System.out.println("--LISTA DO PRODUTO--");
		System.out.println("Nome : "+nomePro);
		System.out.println("Código : "+ codigo);
		System.out.println("Preço : "+preco);
		System.out.println("Estoque : "+estoque);
		
		
		
	
	}

}
