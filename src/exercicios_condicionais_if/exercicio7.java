package exercicios_condicionais_if;
import java.util.Scanner;
	
public class exercicio7 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		double nota;
		
		System.out.println("Digite sua media");
		nota=leia.nextDouble();
		
		if (nota>=7) {
			System.out.println("ALUNO APROVADO!");
		}
		else {
			System.out.println("Aluno Reprovado!");
		}
		

	}

}
