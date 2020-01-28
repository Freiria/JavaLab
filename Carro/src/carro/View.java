
package carro;

//Author: Allan Freiria
//Email: allanfreiria@afreiria.com

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class View {
    
       public static void main(String[] args) {
        ArrayList <Carro> lista = new ArrayList();
          int num = 0;
         do{    
        String[] options = {"Carro", "Utilitario", "Conversivel"};
        int x = JOptionPane.showOptionDialog(null, "Selecione o tipo do carro a incluir",
                "Automoveis",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);
        
       String marca =  JOptionPane.showInputDialog("Digite a marca:");
      String modelo =  JOptionPane.showInputDialog("Digite o modelo:");
      int ano =  Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
      String placa =  JOptionPane.showInputDialog("Digite a placa do carro:");
     
      String[] autos = {"Automático", "Manual"};
      int a =  JOptionPane.showOptionDialog(null, "Câmbio?", "Automoveis", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, autos, autos[0]);

      boolean auto;
      if(a==0){
          auto=true;
      }else{
          auto=false;
      }
      
        
       Carro car = null;
        if(options[x].equals("Carro")){
            car = new Carro(marca, modelo, ano, placa, auto);
        }else if(options[x].equals("Utilitario")){
          int capacidade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade do utilitario:"));
          boolean frete =  Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true/false para frete:"));
            car = new Utilitario(marca, modelo, ano, placa, auto, capacidade, frete);
        }else if(options[x].equals("Conversivel")){
          String tipo =  JOptionPane.showInputDialog("Tipo do conversível:");
          boolean eletrico =  Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true/false para elétrico:"));

          car = new Conversivel(marca, modelo, ano, placa, auto,  tipo, eletrico);
        }
      
       lista.add(car);
        num = JOptionPane.showConfirmDialog(null, "Deseja continuar:");
    
    }while(num==0);
         
         
         lista.sort(null);
                 
        for(int i = 0; i < lista.size(); i++){
            Carro c = null;
            if(lista.get(i) instanceof Utilitario){
                c = (Utilitario) lista.get(i);
            }else if(lista.get(i) instanceof Conversivel){
                c = (Conversivel) lista.get(i);
            }else if(lista.get(i) instanceof Carro){
                 c = (Carro) lista.get(i);
            }
            JOptionPane.showMessageDialog(null, c.imprimir());

        }
        
         
    }
}
