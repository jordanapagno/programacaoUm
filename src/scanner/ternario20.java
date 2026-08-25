package scanner;

public class ternario20 {

	public static void main(String[] args) {
		int idade = 70;
		String situacao;
		
		if(idade >=60)
		{
			situacao= "Atendimento Preferencial";
			
		}
		else {
			situacao= "Atendimento Comum";
		}
		
		System.out.println("\nIdade: "+idade+"\nTipo de Tendimento: "+situacao);

	}

}
