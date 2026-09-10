package exercicios_lacos_repeticao;
import java.util.Scanner;
public class soamfor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = leia.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }

        System.out.println("Soma: " + soma);

	}

}
