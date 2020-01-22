
package formageometricah;

public class Quadrado extends FormaGeometricah{
    
    double lado;
    
    public Quadrado(){
        
    }
    
    public Quadrado(String nome, double l){
        super(nome);
        this.lado = l;
    }
    
    double calculaArea(){
        return this.lado*this.lado;
    }
    
    
    
}
