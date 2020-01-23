package StringsJava;

/*Esse m�todo pode retornar 0 se as strings forem iguais, 
 * um n�mero negativo se a string que invoca o compareTo for 
 * menor que a string que � passada como um argumento e um 
 * n�mero positivo se a string que invoca o compareTo for 
 * maior que a string que � passada como argumento.*/

public class StringCompareTo {
	
	String Nome1;
	String Nome2;
	
	public StringCompareTo(String Nome1, String Nome2) {
		this.Nome1 = Nome1;
		this.Nome2 = Nome2;
	}
	
	public void Checar() {
		System.out.print("Nome2.compareTo(Nome1) = "+Nome2.compareTo(Nome1));
		System.out.print("Nome1.compareTo(Nome2) = "+Nome1.compareTo(Nome2));
	}

}
