package exercicios_condicionais_if;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
    	String usuario;
		int senha;
		String usuarioC = "admin";
		int senhaC = 1234;
		
		System.out.println("Usuário: ");
		usuario = leia.nextLine();
		
		System.out.println("Senha: ");
		senha = leia.nextInt();
		
		if (usuario.equals(usuarioC)) {
			System.out.println("Acesso Permitido");
			if(senha == senhaC) {
				System.out.println("Acesso permitido");
			}
			else {
				System.out.println("Senha Incorreta");
			}
		}
		
		else {
			System.out.println("Usuario inexistente");
		}

	}

}
