
package calculadora.modularizacao;
import java.util.Scanner;

public class calculadora {
    static String mes_ano(int num){
        String [] meses = {"Janeiro", "Fevereiro", "MarÃ§o", "Abril","Maio", "Junho", "Julho", "Agosto", "Setembro","Outubro","Novembro","Dezembro"};    
     return meses[num-1];   
    }
    
    
    static double somar(double a, double b){
        return(a+b);    
    }
    static double subtracao(double a, double b){
        return(a-b);    
    }
    static double divisao(double a, double b){
        return(a/b);    
    }
    static double multiplicacao(double a, double b){
        return(a*b);    
    }
    static double potenciacao(double a, double b){
        double n=1;
        for(int i=0; i<b; i++){
            n*=a;
        }
        return n;
    }
    static double raiz_quadrada(double a){
        return Math.sqrt(a);
    }
    static double PI(){
        return Math.PI;
    }
    static double E(){
        return Math.E;
    }
    static double fatorial(double n){
        double fatorial=1;
        
        for(int i=1; i<=n; i++){
            fatorial*=i;
        }
        
      return fatorial;
    }
    
    static double max(double a, double b){
       if (a>b) return a;
       else return b;
    }
            
    static double min(double a, double b){
       if (a<b) return a;
       else return b;
    }       
    
    static double seletor(String operador, double a, double b){
        double n=0;
        switch(operador){
            case "+" : n=somar(a,b);
            break;
            case "-" : n=subtracao(a,b);
            break;
            case "*" : n=multiplicacao(a,b);
            break;
            case "/":  n=divisao(a,b);
            break;
            case ">" : n=max(a,b);
            break;
            case "<" : n=min(a,b);
            break;
            case "^" : n=potenciacao(a,b);
            break;
            case "#" : n=raiz_quadrada(a);
            break;
            case "!" : n=fatorial(a);
            break;
            case "~" : n=PI();
            break;
            case "&": n=E();
            break;
            case "0" : System.exit(0);
            break;
        }
        return n;  
    }
    
    
   public static void main(String[] args) {
       System.out.println(mes_ano(8));
        
       Scanner entrada = new Scanner (System.in);
       String operador;
       do{
       
       System.out.println("");
       System.out.println("--------------------------------------");
       System.out.println("Digite o simbolo da operacao:");
       System.out.println("+ - SOMA");
       System.out.println("- - SUBTRAÃ‡ÃƒO");
       System.out.println("* - MULTIPLICAÃ‡ÃƒO");
       System.out.println("/ - DIVISÃƒO");
       System.out.println("> - MÃ¡ximo");
       System.out.println("< - MÃ­nimo");
       System.out.println("^ - PotenciaÃ§Ã£o");
       System.out.println("# - Raiz Quadrada");
       System.out.println("! - Fatorial");
       System.out.println("~ - PI");
       System.out.println("& - E");
       System.out.println("0 - Sair");
 
       operador = entrada.nextLine();
       System.out.println(operador);
       double a=0,b=0;
       if(operador.equals("+")||operador.equals("-")||operador.equals("*")
         ||operador.equals("/")||operador.equals(">")||operador.equals("<")
         ||operador.equals("^")){
       System.out.println("Digite um numero:");
       a = Double.parseDouble(entrada.nextLine());
       
       System.out.println("Digite outro numero:");
       b = Double.parseDouble(entrada.nextLine());
       
       }else if(operador.equals("#")||operador.equals("!")){
          System.out.println("Digite um nÃºmero:");     
          a = Double.parseDouble(entrada.nextLine());
          b=0;
       }
       System.out.println(seletor(operador, a, b));
       }while(operador!="0");
       
    
       
   }
    
}

