
package except;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Banco {

    
    
    public static void main(String[] args) throws ExcecaodeQuinta  {
        
       
        try{
        File file = new File(""); 
    FileReader fr = 
      new FileReader("C:\\oi.txt"); 
  
    int i; 
    while ((i=fr.read()) != -1) 
      System.out.print((char) i); 
        }catch(IOException e){
            System.out.println("Arquivo nçao existe.");
        }
   
        throw new ExcecaodeQuinta();
 }
     
        
        
        
        
   
    
}
