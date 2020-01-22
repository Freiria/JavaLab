
package pessoa;

import java.util.ArrayList;

public class Governo {
    ArrayList <Pessoa> pessoas;

    public Governo(){
        this.pessoas = new ArrayList();   
    }
    
   public static void main(String[] args) {
        // TODO code application logic here
        
        Governo br = new Governo();
        
        Pessoa zidane = new Pessoa("Zidane", 88, true);
        Pessoa di = new Pessoa("Di Maria", 33, true);
        Pessoa alan = new Pessoa("Alan Kardec", 11, false);
        
        zidane.getNome();
        
        br.pessoas.add(zidane);
        br.pessoas.add(di);
        br.pessoas.add(alan);
         
        
        for(int i = 0; i<br.pessoas.size();i++){
            br.pessoas.get(i).imprimir();
        }

        br.pessoas.sort(null);
        
           
        for(int i = 0; i<br.pessoas.size();i++){
            br.pessoas.get(i).imprimir();
        }
    
    } 
}
