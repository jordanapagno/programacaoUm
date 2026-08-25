package scanner;
import java.util.Scanner;
public class Lista2 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite o nome do aluno: ");
	        String nome = entrada.nextLine();
	        
	        System.out.print("Digite a idade: ");
	        int idade = entrada.nextInt();
	        
	        
	        entrada.nextLine(); 
	        
	        System.out.print("Digite o curso: ");
	        String curso = entrada.nextLine();
	        
	        System.out.print("Digite a altura: ");
	        double altura = entrada.nextDouble();
	        
	        System.out.print("Digite a média final: ");
	        double media = entrada.nextDouble();
	        
	        System.out.print("Situação da matrícula ativa? (true/false): ");
	        boolean situacao = entrada.nextBoolean();
	        
	        System.out.println("---DADOS---\nNome: " + nome + 
	                           "\nAltura: " + altura + 
	                           "\nIdade: " + idade + 
	                           "\nCurso: " + curso + 
	                           "\nMédia Final: " + media);
	        
	        if (situacao) {
	            System.out.println("Matricula: Sim");
	        }
		}

	}


