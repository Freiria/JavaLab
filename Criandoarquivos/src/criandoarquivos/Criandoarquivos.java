
package criandoarquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Criandoarquivos {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i, n;
        
        System.out.println("Digite o numero para gerar a tabuada: ");
        n = in.nextInt();
        
        FileWriter arquivo = new FileWriter("C:\\tabuada.txt");
        PrintWriter gravarArquivo = new PrintWriter(arquivo);
        
        gravarArquivo.printf("+--Resultado--+%n");
        for (i=1; i<=10; i++) {
          gravarArquivo.printf("| %2d X %d = %2d |%n", i, n, (i*n));
        }
        gravarArquivo.printf("+-------------+%n");

        arquivo.close();

        System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);
        
    }
    
}
