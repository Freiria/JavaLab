
package carro;
//Author: Allan Freiria
//Email: allanfreiria@afreiria.com

public class Utilitario extends Carro {
    double capacidade;
    boolean frete;
    
    
    public Utilitario(String marca, String modelo, int ano_fab, String placa,  boolean isAuto, double capacidade, boolean frete){
        super(marca, modelo, ano_fab, placa, isAuto);
        this.capacidade = capacidade;
        this.frete = frete;
    }
    
    public String imprimir(){
        return super.imprimir()+"\n"+ this.capacidade +" - " + this.frete; 
    }
}
