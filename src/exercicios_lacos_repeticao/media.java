package exercicios_lacos_repeticao;
import java.util.Scanner;
public class media {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double somaNotas = 0;
        int totalAlunos = 0;
        char continuar;

        do {
            System.out.print("Informe o nome do aluno: ");
            String nome = leia.nextLine();

            System.out.print("Informe a nota de " + nome + ": ");
            double nota = leia.nextDouble();
            leia.nextLine(); 

            somaNotas += nota;
            totalAlunos++;

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            String resposta = leia.nextLine().trim().toUpperCase();
            continuar = resposta.isEmpty() ? 'N' : resposta.charAt(0);

        } while (continuar == 'S');

        if (totalAlunos > 0) {
            double media = somaNotas / totalAlunos;
            System.out.println("\n--- Resultado ---");
            System.out.printf("Total de alunos cadastrados: %d\n", totalAlunos);
            System.out.printf("Média das notas: %.2f\n", media);
        } else {
            System.out.println("Nenhum aluno foi cadastrado.");
        }
	}

}
