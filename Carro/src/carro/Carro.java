
package carro;

public class Carro implements Comparable{
    String marca;
    String modelo;
    int ano_fab;
   private String placa;
    boolean isAuto;
 
    public int compareTo(Object obj){
        Carro aux = (Carro) obj;
        if(this.modelo.charAt(0) < aux.modelo.charAt(0)){
            return -1;
        }else if (this.modelo.charAt(0) > aux.modelo.charAt(0)){
            return 1;
        }    
        return 0;
    }
    
    
    
    public Carro(){
        
    }
    
    public Carro(String marca, String modelo, int ano_fab, String placa,  boolean isAuto ){
        this.marca = marca;
        this.isAuto = isAuto;
        this.placa = placa;
        this.ano_fab = ano_fab;
        this.modelo = modelo;
    }
 
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca (String placa){
        this.placa = placa;
    }
    
    public String imprimir(){
        return this.marca+" - "+this.modelo+ " - "+this.ano_fab+"\n"+
                this.placa +" - "+this.isAuto;
    } 

}
