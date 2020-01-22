
package petshop;

public class Dono {
    private String nome;
    private long telefone;
    private String CPF;
    
    public Dono( String nome, long telefone,String CPF){
        this.nome= nome;
        this.telefone = telefone;
        this.CPF = CPF;
    }
    
    public String imprimir(){
        return this.nome+" "+this.telefone+" "+this.CPF;
    }
    
}
