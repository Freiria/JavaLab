
package problemadecollatz;

import java.util.Scanner;

public class ProblemadeCollatz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero de 1 a 1000 para iniciar o problema de Collatz");
        int num = entrada.nextInt();
        
        System.out.print(num);
        
        while(num != 1){
            if((num%2) == 0){
                num = num/2;
                System.out.print(", "+num);
            }else{
                num = (3*num)+1;
                System.out.print(", "+num);
            }
        }
        
    }
    
}
