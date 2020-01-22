
package formageometricah;

public class Circulo extends FormaGeometricah {
    
    double raio;
    
    public Circulo(){
        
    }
    
    public Circulo (String nome, double r){
        super(nome);
        this.raio = r;
    }
    
    
    double calculaArea(){
        
        return Math.PI*this.raio*this.raio;
    }
    
    
    
}
