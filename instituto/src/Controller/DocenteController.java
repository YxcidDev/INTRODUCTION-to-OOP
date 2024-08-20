
package Controller;


public class DocenteController extends PersonaController{
    
    public void generarAsistencia(){
        System.out.println("GENERANDO ASISTENCIA...");
    }
    
    public void subirCalificacion(){
        System.out.println("CALIFICANDO...");
    }
    
    
    public void aternderCasos(){
        //super.atenderCasos();
        System.out.println("ATENDIENDO CASOS DESDE DOCENTE...");
    }
    @Override
    public void reportar(){
        //super.reportar();
        System.out.println("REPORTANDO DESDE DOCENTE...");
    }
    @Override
    public void transaccion(){
        System.out.println("TRANSACCION ABSTRACTA DESDE DOCENTE");
    }
}
