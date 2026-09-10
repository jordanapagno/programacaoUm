package exercicios_lacos_repeticao;
import java.util.Scanner;
public class mediafor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a nota " + i + ":");
            double nota = leia.nextDouble();
            soma = soma + nota;
        }

        double media = soma / 5;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Media das notas: " + media);

	}

}
