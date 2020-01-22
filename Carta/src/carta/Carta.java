
package carta;

import java.util.Scanner;

public class Carta {
    int numero;
    Nipe ind;

    public Carta(){
            
        }
    
    public Carta(int numero, String nipe){
        this.numero = numero;
        this.ind = new Nipe(nipe);
    }
    

    
}
