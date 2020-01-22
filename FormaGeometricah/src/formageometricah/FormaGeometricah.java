
package formageometricah;

public abstract class FormaGeometricah {

   String forma;
    
   public FormaGeometricah(){
       
   }
   
   public FormaGeometricah(String nome){
       this.forma = nome;
   }
   
   abstract double calculaArea();
   
   
   void imprimir(){
       System.out.println("Forma: "+this.forma+" " + calculaArea());
   }
   
  
}
