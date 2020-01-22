
package petshop;

public class Animal {
    private String nome;
    private String tipo;
    private String raca;
    private int idade;
    private Dono proprietario;
    
    public Animal(String nome, String tipo, String raca, int idade, Dono proprietario  ){
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
        this.proprietario = proprietario;
        this.tipo = tipo;
    }
    
    public String imprimir(){
        return this.nome+" "+this.tipo+" "+this.raca+" "+this.idade+" "+this.proprietario.imprimir();
    }
    
    
    
}
