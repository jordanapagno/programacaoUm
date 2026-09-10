package exercicios_lacos_repeticao;
import java.util.Scanner;
public class senha {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String senha;

	        do {
	            System.out.print("Digite a senha: ");
	            senha = scanner.nextLine();

	            if (!senha.equals("1234")) {
	                System.out.println("Senha incorreta!");
	            }

	        } while (!senha.equals("1234"));

	        System.out.println("Senha correta! Acesso permitido.");
	}

}
