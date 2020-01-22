
package hospital;

public class Paciente implements Comparable {
    String nome;
    int idade;
    String sintoma;
    boolean planoValido;
    int severidade;
    
    @Override
    public int compareTo(Object obj){
        Paciente aux = (Paciente) obj;
        if(this.nome.charAt(0) < aux.nome.charAt(0)){
            return -1;
        }else if (this.nome.charAt(0) > aux.nome.charAt(0)){
            return 1;
        }
        
        return 0;
    }
    
    
    public Paciente(String nome,int idade,String sintoma, boolean planoValido,
    int severidade){
        this.idade = idade;
        this.nome = nome;
        this.planoValido = planoValido;
        this.severidade = severidade;
        this.sintoma = sintoma;
    }
    
    String imprimir(){
       String leitura = "";
       leitura += this.nome +" - "+this.idade+"\n";
        if(this.planoValido){
           leitura+="Pago pelo plano de saúde\n";
        }else{
           leitura+="A liquidar cobrar o cliente\n";
        }
        leitura+=this.sintoma+" - "+this.severidade+"\n";
        leitura+="-------------------------\n";
        return leitura;
    }
    
    
    
    
}
