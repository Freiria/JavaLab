
package dirigir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Dirigir {

    public static void main(String[] args) throws BebeuException, SemCNHException, FileNotFoundException{

        System.out.println();
        try{
        String fileName = "src/dirigir/arquivo.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
        //process the line
        System.out.println(line);
        }
        }catch(IOException e){ //verificada 
            System.out.println("Deu erro");
        }
        
        try{
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        
         if(n<18){
            throw new MenordeIdadeException();
        }
        
          Object [] opcao = {"Sim", "Não"};
        
        String bebeu =(String)JOptionPane.showInputDialog(null,"Você bebeu álcool?", "Dirigir",
JOptionPane.QUESTION_MESSAGE, null, opcao, null);

        if(bebeu.equals("Sim")){
            throw new BebeuException();
        }
        
        String CNH =(String)JOptionPane.showInputDialog(null,"Você possui CNH?", "Dirigir",
JOptionPane.QUESTION_MESSAGE, null, opcao, null);
       
        if(CNH.equals("Não")){
            throw new SemCNHException();
        }
       JOptionPane.showMessageDialog(null, "Pode voltar pra casa de carro numa boa");
        
        }catch(MenordeIdadeException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Dirigir", 0);
        }

    }
    
}
