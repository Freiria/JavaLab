
package hospital;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Hospital {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Paciente> lista = new ArrayList();

        int status; 
        
        do{
            
        String nome = JOptionPane.showInputDialog("Digite o nome do paciente:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do paciente:"));
        String sintoma = JOptionPane.showInputDialog("Digite o sintoma do paciente:");
        boolean plano = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true/false para plano de saúde"));
        int severidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a severidade do paciente:"));
        
        Paciente usuario = new Paciente(nome, idade, sintoma, plano, severidade);        
        status = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro paciente", "Hospital", JOptionPane.YES_NO_OPTION);
        lista.add(usuario);

        }while(status==0);
    
        
        lista.sort(null);
        
        String leitura="";
        for(int i = 0; i <lista.size(); i++){
            leitura+=lista.get(i).imprimir();
        }
        JOptionPane.showMessageDialog(null, leitura);
        
        
    }
    
}
