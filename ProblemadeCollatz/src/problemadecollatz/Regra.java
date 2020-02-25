
package problemadecollatz;

// Esta Classe deve ser usada caso seja necessário instancia-la na classe principal.

public class Regra {
    int n;
    
    public Regra(int n){
    this.n=n;
    }
    
    public int ContarPar(){
        
        n = n/2;
        return n;
    }
    
    public int ContarImpar(){
        n = (3*n)+1;
        return n;
    }
}