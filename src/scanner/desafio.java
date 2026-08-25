package scanner;
import java.util.Scanner;
public class desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o salario: ");
        double salario = entrada.nextDouble();
        
        System.out.print("Digite os anos na empresa: ");
        int anosEmpresa = entrada.nextInt();
        
        double bonus = 0.0;
        
        if (anosEmpresa >= 5) {
            bonus = 500.00;
        } else {
            bonus = 0.00;
        }
        
        double salarioFinal = salario + bonus;
        
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Final: R$ " + salarioFinal);

	}

}
