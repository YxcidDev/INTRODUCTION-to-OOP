
package Controller;

public class EstudianteController extends PersonaController{
    
    public void entregarTrabajo(){
        System.out.println("ENTREGANDO TRABAJO..."); 
    }
    
    @Override
    public void reportar(){
        //super.reportar();
        System.out.println("REPORTANDO DESDE ESTUDIANTE...");
    }
    @Override
    public void transaccion(){
        System.out.println("TRANSACCION ABSTRACTA DESDE ESTUDIANTE");
    }
}
