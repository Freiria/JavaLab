package agendadepessoas;

//Author: Allan Freiria
//Email: allanfreiria@afreiria.com

import java.util.ArrayList;

public class AgendadePessoas {
    ArrayList<Pessoa> pessoas;
    
    public AgendadePessoas(){
        this.pessoas = new ArrayList();
    }

    public static void main(String[] args) {
        AgendadePessoas br = new AgendadePessoas();
        
        Pessoa Ana = new Pessoa("Ana Paulo", "Ana@gmail.com", "11 39451413", 22);
        Pessoa Joao = new Pessoa("Joao Paulo", "joao2gmail.com", "11 974860471", 20);
        Pessoa carlos = new Pessoa("Carlos Silva", "carlos@gmail.com", "11 5686969587", 25);
        
        br.pessoas.add(Ana);
        br.pessoas.add(Joao);
        br.pessoas.add(carlos);
        
        for(int i = 0; i<br.pessoas.size();i++){
            br.pessoas.get(i).imprimir();
        }
    }
    
}
