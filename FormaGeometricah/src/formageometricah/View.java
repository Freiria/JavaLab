
package formageometricah;

public class View {
    
      public static void main(String[] args) {
        // TODO code application logic here
        
        FormaGeometricah forma;
        forma = new Quadrado("Quadrado",2);
        
        forma.imprimir();
        
        forma = new Circulo("Círculo", 1);
        forma.imprimir();

        forma = new Losango("Losango", 4.5, 2.5);
        forma.imprimir();

        
        
    }
    
}
