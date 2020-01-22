
package carta;

public class Nipe  extends Carta{
        String nipe;
        char simbolo;

 
        public Nipe(){
            
        }
        
    public Nipe(String nipe){
        this.nipe = nipe;
        switch (nipe){
            case "Paus" : super.ind = new Paus();
            break;
            case "Copas" : super.ind = new Copas();
            break; 
            case "Espadas" : super.ind = new Espadas();
            break;
            case "Ouros" : super.ind = new Ouros();
            break;
        }
        
        
    }
    
   
    
    
}
