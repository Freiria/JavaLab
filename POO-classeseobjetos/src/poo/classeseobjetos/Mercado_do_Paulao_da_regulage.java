package poo.classeseobjetos;

public class Mercado_do_Paulao_da_regulage {
    
     public static void main(String[] args) {
         
     Lampada philips = new Lampada();
     philips.fabricante = "Philips";
     philips.preco = 22;
     philips.modelo = "XR45";
     philips.estado =false;
     philips.cor = "Branca";
     
     philips.validaEstado();
     
     philips.imprimir();
     
     philips.ligar();
     
     philips.validaEstado();

     
     }
    
    
}
