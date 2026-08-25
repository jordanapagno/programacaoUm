package jORDANA;

public class desafio {

	public static void main(String[] args) {
		 String nome = "Carlos Silva";
	        double salario = 3000.00;
	        int anosEmpresa = 6;

	        double bonus = (anosEmpresa >= 5) ? 500.00 : 0.00;
	        double salarioFinal = salario + bonus;

	        System.out.println("Nome: " + nome);
	        System.out.println("Salário: R$ " + salario);
	        System.out.println("Bônus: R$ " + bonus);
	        System.out.println("Salário Final: R$ " + salarioFinal);

	}

}
