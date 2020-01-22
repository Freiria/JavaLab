
package carro;

public class Conversivel extends Carro{
    String tipo;
    boolean isEletric;
    
     public Conversivel(String marca, String modelo, int ano_fab, String placa,  boolean isAuto, String tipo, boolean isEletric){
        super(marca, modelo, ano_fab, placa, isAuto);
        this.tipo = tipo;
        this.isEletric = isEletric;
    }
     
        public String imprimir(){
        return super.imprimir()+"\n"+ this.tipo +" - " + this.isEletric; 
    } 
    
    
}
