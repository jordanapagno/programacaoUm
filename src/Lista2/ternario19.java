package Lista2;

public class ternario19 {

	public static void main(String[] args) {
		double saldo = 1250.00;
		String situacao;
		
		if(saldo>0)
		{
			situacao= "Saldo Positivo";
			
		}
		else {
			situacao= "Saldo Negativo";
		}
		
		System.out.println("\nSaldo: "+saldo+"\nSituação: "+situacao);

	}
	
	

}
