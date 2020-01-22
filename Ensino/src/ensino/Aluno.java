
package ensino;

import java.util.ArrayList;

public class Aluno {
    String nome;
    int RA;
    boolean ativo;
    ArrayList <Disciplina> vetor;
    
    
    public Aluno(String nome,
    int RA,
    boolean ativo, ArrayList al){
        this.nome = nome;
        this.RA = RA;
        this.ativo = ativo;   
        this.vetor = al;
    }
    
    
    void imprimir(){
        for(int i=0; i<this.vetor.size(); i++){
            this.vetor.get(i).imprimir();
        }
        
    }
    
    
}
