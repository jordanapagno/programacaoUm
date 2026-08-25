package exercicios_condicional_switch_case;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		 
	        int categoria;
	        int produto;

	        
	        Scanner leia = new Scanner(System.in);

	     
	        System.out.println("Escolha a Categoria:");
	        System.out.println("1 - Informática");
	        System.out.println("2 - Telefonia");
	        categoria = leia.nextInt();

	       
	        System.out.println("\nEscolha o Produto (1, 2 ou 3):");
	        produto = leia.nextInt();

	        

	        
	        switch (categoria) {
	            case 1: 
	                switch (produto) {
	                    case 1:
	                        System.out.println("Categoria: Informática - Produto: Notebook");
	                        break;
	                    case 2:
	                        System.out.println("Categoria: Informática - Produto: Mouse");
	                        break;
	                    case 3:
	                        System.out.println("Categoria: Informática - Produto: Teclado");
	                        break;
	                    default:
	                        System.out.println("Produto inválido para a categoria Informática.");
	                        break;
	                }
	                break; 

	            case 2: 
	                switch (produto) {
	                    case 1:
	                        System.out.println("Categoria: Telefonia - Produto: Smartphone");
	                        break;
	                    case 2:
	                        System.out.println("Categoria: Telefonia - Produto: Carregador");
	                        break;
	                    case 3:
	                        System.out.println("Categoria: Telefonia - Produto: Fone de ouvido");
	                        break;
	                    default:
	                        System.out.println("Produto inválido para a categoria Telefonia.");
	                        break;
	                }
	                break;

	            default:
	                System.out.println("Categoria inválida.");
	                break;
	        }

	}

}
