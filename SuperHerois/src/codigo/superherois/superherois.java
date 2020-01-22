
package codigo.superherois;

public class superherois {
    String nome;
    String identidade_secreta;
    double poder;
    String fraqueza;
    String grupo;
   
    void apresentar(){
        System.out.println(this.nome);
        System.out.println(this.poder);
        System.out.println(this.grupo);
        System.out.println(this.fraqueza);
    }
    
    void usarPoder(){
        if(this.nome.equals("Homem Aranha")){
            System.out.println("Vai teia!");
        }else if (this.nome.equals("Superman")){
            System.out.println("Sou o homem mais forte do mundo");
        }
       
    }
    
    
    
}
