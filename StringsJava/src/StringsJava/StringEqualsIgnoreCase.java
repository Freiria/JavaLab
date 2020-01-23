package StringsJava;

//Esse m�todo ignora a distin��o entre letras mai�sculas e min�sculas nas duas strings comparadas.

public class StringEqualsIgnoreCase {
	
	String Nome1;
	String Nome2;
	
	public StringEqualsIgnoreCase(String Nome1, String Nome2) {
		this.Nome1 = Nome1;
		this.Nome2 = Nome2;
	}
	
	public void Chegar() {
		if(Nome1.equalsIgnoreCase(Nome2)) {
			System.out.println("S�o Iguais");
		}else {
			System.out.println("S�o Diferentes");
		}
	}

}
