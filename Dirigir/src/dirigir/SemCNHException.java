
package dirigir;

public class SemCNHException extends Exception{
    public SemCNHException(){
        super("Não tirou CNH, proibido tire antes de dirigir");
    }
}
