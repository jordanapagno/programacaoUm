package exercicios_condicionais_if;
import java.util.Scanner;
public class exercicio19 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int idade;
		String sexo;
		
		System.out.println("difite sua idade");
		idade = leia.nextInt();
		
		
		if (idade < 0) {
			System.out.println("Ninguem pode ter idade menor que 0");
		}
		
		else if (idade<=12) {
			System.out.println("é uma criança");
		}
		
		else if (idade <=17) {
			System.out.println("é um adolescente");
		}
		else
		{
		System.out.print("Escreva seu sexo (homem ou mulher): ");
        sexo = leia.nextLine();
		
		if (idade >=18) {
			if (sexo.equals("mulher")) {
				if (idade <=62)
				{
					System.out.println("Mulher Adulta");
				}
				else {
					System.out.println("Mulher idosa");
				}
			}
			if (sexo.equals("homem")) {
				if (idade <=64) {
					System.out.println("Homem adulto");
				}
				else {
					System.out.println("Homem idoso");
				}
			}
		}
		}
		}

	}


