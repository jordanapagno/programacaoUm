package jORDANA;

import java.util.Scanner;

public class aaatividadw {

	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		double altura;
		double peso;
		char sexo;
		 
		
		System.out.println("Escreva seu nome : ");
		nome = leia.nextLine();
		
		System.out.println(" Escreva sua idade");
		idade = leia.nextInt();
		
		System.out.println(" Escreva sua altura");
		altura = leia.nextDouble();
		
		System.out.println(" Escreva seu peso");
		peso = leia.nextDouble();
		
		System.out.print("A matrícula está ativa? (true/false): ");
        boolean matriculaAtiva = leia.nextBoolean();
		
		System.out.println(" Escreva seu sexo : M/F");
		sexo = leia.next().charAt(0);
		
		
		
		System.out.println("--LISTA DO ALUNO--");
		System.out.println("Nome : "+nome);
		System.out.println("Idade : "+idade);
		System.out.println("Altura : "+altura);
		System.out.println("Peso : "+peso);
		System.out.println("Sexo : "+sexo);
		System.out.println("Matricula : "+matriculaAtiva);
		
		
		
	
	}

}
