package Lista2;

public class Combustivel {

	public static void main(String[] args) {
		double distancia = 420;
		double litros = 35;
		double consMedio = 0;
		double litros100 = 0;
		
		consMedio= distancia/litros;
		litros100= 100/consMedio;
		
		System.out.println("Consumo Médio: "+consMedio+"\nQuantidade de litros para percorrer 100km: "+litros100);

	}

}
