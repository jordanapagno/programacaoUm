package exercicios_condicional_switch_case;
import java.util.Scanner;
public class exrecicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

       
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = leia.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = leia.nextInt();

        
        System.out.println("\nEscolha a operação:");
        System.out.println("1 -> Soma");
        System.out.println("2 -> Subtração");
        System.out.println("3 -> Multiplicação");
        System.out.println("4 -> Divisão");
        System.out.print("Operação: ");
        int operacao = leia.nextInt();

        
        switch (operacao) {
            case 1:
                System.out.println("Resultado da Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (num1 * num2));
                break;
            case 4:
                
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero.");
                } else {
                   
                    double divisao = (double) num1 / num2;
                    System.out.println("Resultado da Divisão: " + divisao);
                }
                break;
            default:
                System.out.println("Operação inválida. Escolha uma opção de 1 a 4.");
                break;
	}

	}
}
