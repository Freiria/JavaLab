
package ensino;

import java.util.ArrayList;

public class Ensino {

    public static void main(String[] args) {


        Disciplina poo = new Disciplina();
        poo.CRT = 1511;
        poo.nome = "Programação Orientada a Objetos";
        poo.nota = 0;
        poo.prof = "Igor";
        
        Disciplina es = new Disciplina();
        es.CRT = 5774;
        es.nome = "Engenharia de Software";
        es.nota = 0;
        es.prof = "Ana Klyssia";

        ArrayList <Disciplina> vetor = new ArrayList();

        vetor.add(poo);
        vetor.add(es);
        
        Aluno joao = new Aluno("João", 123, true, vetor);

        joao.imprimir();
        
        
        
        
    }
    
}
