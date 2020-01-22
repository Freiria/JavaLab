
package pessoa;


public class Pessoa implements Comparable {
  private  String nome;
  private  int idade;
  private  boolean isAlive;
    
  public String getNome(){
      return this.nome;
  }
  
  public void setNome(String nome){
      this.nome=nome;
  }
  
  
    @Override
    public int compareTo(Object aux){
        Pessoa p = (Pessoa) aux;
        if(this.idade < p.idade){
            return -1;
        }else if (this.idade > p.idade){
            return 1;
        }
        return 0;
    }
//       public int compareTo(Object aux){
//        Pessoa p = (Pessoa) aux;
//        if(this.nome.charAt(0) < p.nome.charAt(0)){
//            return -1;
//        }else if (this.nome.charAt(0) > p.nome.charAt(0)){
//            return 1;
//        }
//        return 0;
//    }
    
    public Pessoa( String nome, int idade, boolean isAlive){
        this.idade = idade;
        this.isAlive = isAlive;
        this.nome = nome;
    }

    public Pessoa getPessoa(){
        
        return this;
    }
    
    
    void imprimir(){
        System.out.print(this.nome+" ");
        System.out.print(idade+" anos ");
        if(this.isAlive == true){
            System.out.println("Está vivo");
        }else{
            System.out.println("Está morta");
        }
        System.out.println("--------------------------------");
    }
    
    
}
