
package Controller;

public abstract class PersonaController{
    protected void reportar(){
        System.out.println("REPORTANDO...");
    }
    protected void aterderCasos(){
        System.out.println("ATENDIENDO CASOS...");
    }
    
    protected abstract void transaccion();
}
