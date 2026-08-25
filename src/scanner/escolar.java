package scanner;
import java.util.Scanner;


public class escolar {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
				
		String nome;
		int nota1;
		int nota2 ;
		int soma=0;
		double media;
		
		
		
		System.out.println("Escreva seu nome:");
		nome =leia.nextLine();
		
		System.out.println("Escrevaa primeira nota:");
		nota1 =leia.nextInt();
		
		System.out.println("Escreva sua segunda nota:");
		nota2 =leia.nextInt();
		
		
		soma= nota1+nota2;
		media= soma/2; 
		
		System.out.println("---DADOS---");
		System.out.println("Nome: "+nome);
		System.out.println("Nota 1:"+nota1);
		System.out.println("Nota 2:"+nota2);
		System.out.println("Média:"+media);
		
		
		
		
		
	}

}
