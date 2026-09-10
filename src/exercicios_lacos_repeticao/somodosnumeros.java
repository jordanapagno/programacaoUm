package exercicios_lacos_repeticao;

public class somodosnumeros {

	public static void main(String[] args) {
		int cont =1;
		int soma =0;
		
		while(cont <= 100)
		{
			soma += cont;
			cont ++;
		}
		
		 System.out.println("A soma de todos os números de 1 a 100 é: " + soma);

	}

}
