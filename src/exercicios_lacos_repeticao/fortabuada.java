package exercicios_lacos_repeticao;
import java.util.Scanner;
public class fortabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

	}

}
