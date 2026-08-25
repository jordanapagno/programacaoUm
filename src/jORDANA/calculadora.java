package jORDANA;

public class calculadora {

	public int somar(int numA, int numB) {
		return numA + numB;
	}
	public int subtracao(int numA, int numB) {
		return numA - numB;
	}
	
	public int multiplicacao(int numA, int numB) {
		return numA * numB;
	}
	
	public int divisao(int numA, int numB) {
		return numA / numB;
	}
	
	public int resto(int numA, int numB) {
		return numA % numB;
	}
	
	
	public static void main(String[] args) {
		calculadora resultado = new calculadora();
		
		System.out.println(resultado.somar(2, 3));
		System.out.println(resultado.subtracao(5, 3));
		System.out.println(resultado.multiplicacao(2, 4));
		System.out.println(resultado.divisao(6, 3));
		System.out.println(resultado.resto(45, 3));
		

	}

}
