package scanner;
import java.util.Scanner;
public class moedas {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double dolar=5.62;
		double valorRe;
		double valorPro = 75;
		
		
		System.out.println("Escreva o valor:");
		valorPro = leia.nextDouble();
		
		valorRe = valorPro * dolar;
		
		System.out.println("Valor em reais: R$ "+valorRe);
	}

}
