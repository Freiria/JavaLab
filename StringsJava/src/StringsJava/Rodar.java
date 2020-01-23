
package StringsJava;

public class Rodar {
    
    public static void main(String [] args){
        
        //Intancia da class que mostra como declarar strings 
        DeclarandoStrings Textos = new DeclarandoStrings();
        Textos.Texto3();
        Textos.Texto2();
        Textos.Texto3();
        
        System.out.println("_________________________________________________");    
            
        //instacias das classes que exmplificam os metodos
        
        StringEquals stringEquals = new StringEquals("Ana", "Joao");
        stringEquals.Checar();
        
        System.out.println("_________________________________________________");

        StringEqualsIgnoreCase stringEqualsIgnoreCase = new StringEqualsIgnoreCase("FREIRIA", "freiria");
        stringEqualsIgnoreCase.Chegar();
        
        System.out.println("_________________________________________________");

        StringCompareTo stringCompareTo = new StringCompareTo("Carla","carlos");
        stringCompareTo.Checar();    
    }
    
}
