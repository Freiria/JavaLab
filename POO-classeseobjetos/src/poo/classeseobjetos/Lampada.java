
package poo.classeseobjetos;

public class Lampada {
    String modelo;
    String fabricante;
    String cor;
    double preco;
    boolean estado;
    
    void ligar(){
        this.estado = true;
    }
    
    void desligar(){
        this.estado=false;
    }
    
    boolean estado(){
        return this.estado;
    }
    
    void validaEstado(){
        if(this.estado == true){
            System.out.println("A lâmpada ligou!");
        }else{
            System.out.println("A lâmpada está queimada");
        }
    }
    
    void imprimir(){
        System.out.println(this.fabricante);
        System.out.println(this.cor);
        System.out.println(this.modelo);
        System.out.println("R$"+this.preco);
    }
    
}
