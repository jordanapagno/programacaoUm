package Lista2;

public class Veiculo {

	public static void main(String[] args) {
		String marca = "Fiat";
		String modelo = "SUVs";
		String cor = "Vermelho";
		double valor= 120000;
		boolean automatico = true;
		
		System.out.println("----DADOS----\n"+"MARCA: "+marca+"\nCor: "+cor+"\nVlor: "+valor+"\nModelo : "+modelo);
		
		if (automatico) {
			System.out.println("Automatico: SIM");
		}
	}

}
