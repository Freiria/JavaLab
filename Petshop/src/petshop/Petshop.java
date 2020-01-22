
package petshop;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Petshop {

   
    public static void main(String[] args) {
        
        ArrayList <Animal> lista = new ArrayList();
        int num = 0;
        do{
        String nomeA = JOptionPane.showInputDialog("Digite o nome do animal:");
        String tipo = JOptionPane.showInputDialog("Digite o tipo do animal:");
        String raca = JOptionPane.showInputDialog("Digite a raça do animal:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal:"));
        String nomeP = JOptionPane.showInputDialog("Digite o nome do dono:");
        long tel = Long.parseLong(JOptionPane.showInputDialog("Digite o telefone do dono:"));
        String CPF = JOptionPane.showInputDialog("Digite o CPF do dono:");

        Dono prop = new Dono(nomeP, tel, CPF);
        Animal obj = new Animal(nomeA, tipo, raca, idade, prop);
        lista.add(obj);
        
         num = JOptionPane.showConfirmDialog(null, "Deseja continuar incluindo animais");
        }while(num==0);
        
        
        for(Animal p : lista){
         JOptionPane.showMessageDialog(null, p.imprimir());
         
        }
        
        
    }
    


}