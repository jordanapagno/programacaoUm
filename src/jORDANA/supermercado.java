package jORDANA;

public class supermercado {

	public static void main(String[] args) {
		double arroz= 27.90;
		double feijao = 9.80;
		double oleo = 8.50;
		double soma=0;
		double media=0;
		
		soma = arroz+feijao+oleo;
		media = soma/3;
		
		System.out.println("Valor: R$ "+soma);
		System.out.println("Méida: R$ "+media);
		

	}

}
