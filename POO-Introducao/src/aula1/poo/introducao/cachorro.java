
package aula1.poo.introducao;

public class cachorro {
 String nome;
 int idade;
 float peso;
 String raca;
 
 public void latir(String raca){
     switch(raca){
         case "Beagle" : System.out.println("AUUHAHUSAUHAHAHUUA");
         break;
         case "Golden" : System.out.println("auauauauauaauauaua");
         break;
         default : System.out.println("Miau");
     }
 }
 
 public void imprimir(cachorro obj){
     System.out.println("-----------------------------------------------------------");
     System.out.println(obj.nome +" "+ obj.idade+" Anos "+obj.peso+" kg" +" "+obj.raca);
 }
 
 public static void main (String [] args){
     cachorro beagle = new cachorro();
     beagle.nome = "Totó";
     beagle.idade = 7;
     beagle.peso = 12;
     beagle.raca = "Beagle";
     beagle.imprimir(beagle);
     beagle.latir(beagle.raca);

     cachorro golden = new cachorro();
     golden.nome="Gold";
     golden.idade=5;
     golden.peso=10;
     golden.raca="Golden";
     golden.imprimir(golden);
     beagle.latir(golden.raca);
     
     cachorro viralata=new cachorro();
     viralata.nome="Bob";
     viralata.idade=10;
     viralata.peso=13;
     viralata.raca="Vira-Lata";
     viralata.imprimir(viralata);
     viralata.latir(viralata.raca); // Metodo latir vai receber Miau, pois não é especificado uma condição para o object.raca na condição! 
     
 }
}

