
package StringsJava;

public class DeclarandoStrings {
    String texto1 = "Tudo entre aspas é String";
    String texto2;
    String texto3;

    //O objeto String texto1 vai ser exibido e atraves do metodo length desse objeto sera mostrado o comprimento da string 
    public void Texto1() {
            System.out.println(texto1 +" | "+(texto1.length()));
    }

    //A variavel texto2 vai receber na chamada o valor null, pois não foi definida uma string para ela.
    public void Texto2() {
            System.out.println(texto2);
    }

    // Neste metodo é exibido " texto 3 e texto4 são iguais!" pois o texto3 e texto4 e apontado para o mesmo objeto: "Freiria"
    // no entando, se inicializarmos o texto4 com o operador new, o resultado sera diferente pois as duas variaveis sera apontada
    // para objetos diferentes, visto que  JVM e forçado a instaciar um novo objeto.
    public void Texto3() {
            texto3 = "Freiria";
            String texto4 = "Freiria";
            //String texto4 = new String("Freiria");

            if(texto3 == texto4) {
                    System.out.println(" texto 3 e texto4 são iguais!");
            }else {
                    System.out.println("texto3 e texto4 NÃO são iguais!");
            }
    }
}
