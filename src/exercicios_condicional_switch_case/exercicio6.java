package exercicios_condicional_switch_case;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int turno;
		int horario;
		
		System.out.println("Digite seu turno\n 1-Manhã \n2-Tarde");
		turno = leia.nextInt();
		
		System.out.println("Digite sua disciplina (1,2 ou 3)");
		horario = leia.nextInt();
		
		
		switch(turno) {
		case 1:
			switch(horario) {
			case 1: 
				System.out.println("Turno: Manhã - Disciplina: Matemática");
				break;
			case 2:
				System.out.println("Turno: Manhã - Disciplina: Português");
				break;
			case 3:
				System.out.println("Turno: Manhã - Disciplina: Física");
				break;
			default:
				System.out.println("Erro: digite um numero de 1 a 3");
				
			}
		case 2:
			switch(horario) {
			case 1 :
				System.out.println("Turno: Tarde - Disciplina: História");
				break;
			case 2 :
				System.out.println("Turno: Tarde - Disciplina: Geografia");
				break;
			case 3 :
				System.out.println("Turno: Tarde - Disciplina: Biologia");
				break;
			default:
				System.out.println("Erro: digite um numero de 1 a 3");
			}
		}
		
;
	}

}
