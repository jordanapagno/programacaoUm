package jORDANA;

public class temperatura {

	public static void main(String[] args) {
		double temperatura =28;
		String dia;
		
		if(temperatura > 25)
		{
			dia = "Dia Quente";
		}
		else 
		{
			dia = "Dia Agradavel";
		}
		
		System.out.println("Temperatura "+temperatura+"°C\nSituação " +dia);

	}

}
