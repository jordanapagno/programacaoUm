package scanner;
import java.util.Scanner;
public class contenação {
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	String aluno;
	String curso ;
	int idade;
	
	System.out.println("Escreva seu nome:");
	aluno = leia.nextLine();
	
	System.out.println("Escreva seu curso:");
	curso = leia.nextLine();
	
	System.out.println("Escreva sua idade:");
	idade = leia.nextInt();
	
	
	System.out.println("===================== \nAluno:"+aluno+"\nCurso:"+curso+"\nIdade:"+idade+"\n=========================");
}
}
