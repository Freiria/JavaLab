
package stringbuilderjava;

public class StringBuilderJava {

    public static void main(String[] args) {
        
        StringBuilder NomesCompleto = new StringBuilder();
        NomesCompleto.append("Allan");
        NomesCompleto.append(" Freiria");
        NomesCompleto.append(" Cassimiro");
        
        System.out.println(NomesCompleto);
        System.out.println("NomesCompleto.length() => "+NomesCompleto.length());
        System.out.println(NomesCompleto+" "+NomesCompleto.charAt(2));
        
    
    }
}