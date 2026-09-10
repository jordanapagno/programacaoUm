package exercicios_lacos_repeticao;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int opcao;
		  do {
	           
	            System.out.println("===== MENU =====");
	            System.out.println("1 - Cadastrar");
	            System.out.println("2 - Consultar");
	            System.out.println("3 - Excluir");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            
	          
	            opcao = leia.nextInt();
	           

	            
	            switch (opcao) {
	                case 1:
	                    System.out.println("-> Opção Selecionada: Cadastrar\n");
	                    break;
	                case 2:
	                    System.out.println("-> Opção Selecionada: Consultar\n");
	                    break;
	                case 3:
	                    System.out.println("-> Opção Selecionada: Excluir\n");
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida! Tente novamente.\n");
	                    break;
	            }

	        } while (opcao != 0);

	}

}
