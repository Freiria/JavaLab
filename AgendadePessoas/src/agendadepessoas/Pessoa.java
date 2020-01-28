package agendadepessoas;
//Author: Allan Freiria
//Email: allanfreiria@afreiria.com
public class Pessoa {
    
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    
    //Contructor
    public Pessoa(String nome, String email, String telefone, int idade){
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
        this.idade=idade;
    }
    
    //Geter
    public Pessoa getPessoa(String nome, String email, String telefone, int idade){
        return this;
    }
    
    //Metodos 
    public void imprimir(){
        System.out.println(" Nome: "+nome+"\n Idade: "+idade+"\n E-mail: "+email+"\n telefone: "+telefone);
        System.out.println("-----------------------------------");
    }
}
