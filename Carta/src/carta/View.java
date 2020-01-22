

package carta;

import java.util.Scanner;

public class View {
        
         public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o número da carta:");
        
        int num = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite o nipe da carta:");
        
        String nipe = entrada.nextLine();
        
        Nipe x = new Nipe(nipe);
        x.numero = num;
        
        
        System.out.println(x.numero+" "+x.ind.simbolo);
        
        
        
        
    
    }
}
