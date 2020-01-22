
package codigo.superherois;

public class principal {
    
    public static void main(String[] args) {
       superherois homemAranha = new superherois();
       homemAranha.nome = "Homem Aranha";
       homemAranha.identidade_secreta = "Peter Parker";
       homemAranha.poder = 70;
       homemAranha.fraqueza = "Morte do tio Ben";
       homemAranha.grupo = "Vingadores";
       homemAranha.apresentar();
       homemAranha.usarPoder();
       System.out.println("----------------------------------");
     
       superherois superMan = new superherois();
       superMan.nome = "Superman";
       superMan.identidade_secreta = "Clark Kent";
       superMan.grupo = "Liga da Justiça";
       superMan.fraqueza = "Kriptonita";
       superMan.poder = 95;
       superMan.apresentar();
       superMan.usarPoder();

       
    }
}
