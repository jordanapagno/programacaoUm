package scanner;
import java.util.Scanner;
public class conca16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String funcionario = entrada.nextLine();
        
        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();
        
        
        entrada.nextLine(); 
        
        System.out.print("Digite o cargo: ");
        String cargo = entrada.nextLine();
        
        System.out.println("**********\nFuncionario: " + funcionario + "\nCargo: " + cargo + "\nSalario: " + salario + "\n***********");

	}

}
