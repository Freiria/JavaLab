package StringsJava;


// M�todo da classe Object utilizado para testar a rela��o de igualdade entre dois objetos.

public class StringEquals {
	
	String Nome1;
	String Nome2;
	
	public StringEquals(String Nome1, String Nome2) {
		this.Nome1 = Nome1;
		this.Nome2=Nome2;
	}
	
	public void Checar() {
		if(Nome1.equals(Nome2)) {
			System.out.println( "S�o Iguais");
		}else {
			System.out.println("S�o Diferentes");
		}
	}
	 
}
