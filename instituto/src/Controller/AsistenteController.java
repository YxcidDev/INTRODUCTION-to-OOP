
package Controller;


public class AsistenteController extends PersonaController{
    
    public void registrarEstudiante(){
        System.out.println("REGISTRANDO ESTUDIANTE...");
    }
    
   
    public void aternderCasos(){
        // super.atenderCasos();
        System.out.println("ATENDIENDO CASOS DESDE ASISTENTE...");
    }
    @Override
    public void reportar(){
        //super.reportar();
        System.out.println("REPORTANDO DESDE ASISTENTE...");
    }
    @Override
    public void transaccion(){
        System.out.println("TRANSACCION ABSTRACTA DESDE ASISTENTE");
    }
    
}
