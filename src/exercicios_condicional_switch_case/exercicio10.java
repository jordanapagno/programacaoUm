package exercicios_condicional_switch_case;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int curso;
		int disciplina;
		
		System.out.println("Digite seu curso\n 1-Informática \n 2-Administração \n 3-Engenharia");
		curso = leia.nextInt();
		
		System.out.println("Digite sua disciplina (1, 2 ou 3)");
		disciplina = leia.nextInt();
		
		switch(curso) {
		case 1:
			switch(disciplina) {
			case 1:
				System.out.println("Curso: Informática - Disciplina: Programação");
				break;
			case 2:
				System.out.println("Curso: Informática - Disciplina: Banco de Dados");
				break;
			case 3:
				System.out.println("Curso: Informática - Disciplina: Redes");
				break;
			default:
				System.out.println("Erro: digite um número de 1 a 3");
				break;
			}
			break;
		case 2:
			switch(disciplina) {
			case 1:
				System.out.println("Curso: Administração - Disciplina: Marketing");
				break;
			case 2:
				System.out.println("Curso: Administração - Disciplina: Economia");
				break;
			case 3:
				System.out.println("Curso: Administração - Disciplina: Contabilidade");
				break;
			default:
				System.out.println("Erro: digite um número de 1 a 3");
				break;
			}
			break; 
			
		case 3:
			switch(disciplina) {
			case 1:
				System.out.println("Curso: Engenharia - Disciplina: Cálculo");
				break;
			case 2:
				System.out.println("Curso: Engenharia - Disciplina: Física");
				break;
			case 3:
				System.out.println("Curso: Engenharia - Disciplina: Desenho Técnico");
				break;
			default:
				System.out.println("Erro: digite um número de 1 a 3");
				break;
			}
			break;
			
		default:
			System.out.println("Erro: curso inválido");
			break;
		}

	}

}
