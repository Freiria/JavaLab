
package poo.valorereferencia;

import java.util.Arrays;

public class saladadefruta {
    static boolean pesquisar(String [] salada, String fruta){
        for(int i=0; i<salada.length; i++){
            if(salada[i].equals(fruta)){
                return true;
            }
        }
        return false;  
    } 

    static String pesquisar(String [] salada, int indice){

        if(indice>=0 && indice<salada.length){
        return(salada[indice]);
        }
        return null;
    }


    static String [] pesquisar(String [] salada, char inicial){
        int n=0;
        for(int i=0; i<salada.length; i++){
            if(salada[i].charAt(0)==inicial){
                n++;
            }
        }
        String [] selecionadas = new String[n];
        int j=0;
         for(int i=0; i<salada.length; i++){
            if(salada[i].charAt(0)==inicial){
                selecionadas[j] = salada[i];
                j++;
            }
        }
        return selecionadas;  
    }

    public static void main(String[] args) {
        String [] salada = {"carambola", "maÃ§Ã£", "pera", "uva", "laranja",
"goiaba", "ameixa", "mamÃ£o", "melancia",
"framboesa", "pitanga", "aÃ§aÃ­", "graviola",
"banana", "maracujÃ¡"};
        System.out.println(Arrays.toString(salada));
        Arrays.sort(salada);
        System.out.println(Arrays.toString(salada));
        System.out.println(pesquisar(salada,"aÃ§ai"));
        
        System.out.println(pesquisar(salada, 5));
        
        System.out.println(Arrays.toString(pesquisar(salada, 'u')));
    }
    
}
