
package controleremoto;
//Author: Allan Freiria
//Email: allanfreiria@afreiria.com

public class ControleRemoto {

    public static void main(String[] args) {
        // TODO code application logic her
        
        Controle remoto = new ControleSammy();
        remoto.clique();
        
             
        remoto = new ControleSony();
        remoto.clique();
        
        
        
        
    }
    
}
