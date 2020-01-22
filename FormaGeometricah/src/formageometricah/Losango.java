
package formageometricah;

public class Losango extends FormaGeometricah{
    
    double D;
    double d;
    
    public Losango(){
        
    }
    
    public Losango(String nome, double D, double d){
        super(nome);
        this.D = D;
        this.d = d;
    }
    
    
    public double calculaArea(){
        return (D*d)/2;
    }
    
    
    
    
}
