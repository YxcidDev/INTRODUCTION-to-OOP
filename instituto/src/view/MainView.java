
package view;

import Controller.AsistenteController;
import Controller.DocenteController;
import Controller.EstudianteController;
import java.util.Scanner;


public class MainView {

    
    public static void main(String[] args) {
       
        while (true) {            
            
            switch(imprimirMenuGeneral()){
                
            case 1 ->{
                
                AsistenteController asistente_controller = new AsistenteController();
                
                switch(imprimirMenuAsistente()){
                    
                    case 1 ->{
                        asistente_controller.registrarEstudiante();
                    }
                    case 2 ->{
                        asistente_controller.reportar();
                    }
                    case 3 ->{
                        asistente_controller.aternderCasos();
                    }
                    case 4 ->{
                        asistente_controller.transaccion();
                    }
                    
                    default ->
                        System.out.println("ERROR, LA OPCION SELECIONADA NO EXISTE, TRY AGAIN");
                }
                
            }
            case 2 ->{
                 DocenteController docente_controller = new DocenteController();
                
                switch(imprimirMenuDocente()){
                    
                    case 1 ->{
                        docente_controller.generarAsistencia();
                    }
                    case 2 ->{
                        docente_controller.subirCalificacion();
                    }
                    case 3 ->{
                        docente_controller.reportar();
                    }
                    case 4 ->{
                        docente_controller.aternderCasos();
                    }
                    case 5->{
                        docente_controller.transaccion();
                    }
                    
                    default ->
                        System.out.println("ERROR, LA OPCIÓN SELECIONADA NO EXISTE, TRY AGAIN");
                }
                
            }
            case 3 ->{
                 EstudianteController estudiante_controller = new EstudianteController();
                
                switch(imprimirMenuEstudiante()){
                    
                    case 1 ->{
                        estudiante_controller.entregarTrabajo();
                    }
                    case 2 ->{
                        estudiante_controller.reportar();
                    }
                    case 3 ->{
                        estudiante_controller.transaccion();
                    }
                    
                    
                    default ->
                        System.out.println("ERROR, LA OPCIÓN SELECIONADA NO EXISTE, TRY AGAIN");
                }
            }
            case 4 ->{
                System.out.println("PROGRAMA FINALIZADO");
                System.exit(0);
            }
            default -> 
                 System.out.println("ERROR, LA OPCIÓN SELECIONADA NO EXISTE, TRY AGAIN");
             
                
             
                
            }
           
            
        }
    }
    public static int imprimirMenuGeneral(){
        Scanner mg = new Scanner(System.in);
        
        System.out.println("""
                            USTED ES?
                           1. ASISTENTE
                           2.DOCENTE
                           3.ESTUDIANTE
                           4.SALIR  
                           """);
        int perfil = mg.nextInt();
        return perfil;
    }
    public static int imprimirMenuAsistente(){
        Scanner ma = new Scanner(System.in);
        
        System.out.println("""
                            MENU DE ASISTENTE
                           1. REGISTRAR ESTUDIANTE
                           2. REPORTAR
                           3. ATENDER CASOS
                           4. TRANSACCIÓN
                           """);
        int Opasistente = ma.nextInt();
        return Opasistente;
    }
    public static int imprimirMenuDocente(){
        Scanner md = new Scanner(System.in);
        
        System.out.println("""
                            MENU DE DOCENTE
                           1. GENERAR ASISTENCIA
                           2. SUBIR CALIFICACIÓN 
                           3. REPORTAR
                           4. ATENDER CASOS
                           5. TRANSACCIÓN
                           """);
        int Opdocente = md.nextInt();
        return Opdocente;
    }
    public static int imprimirMenuEstudiante(){
        Scanner me = new Scanner(System.in);
        
        System.out.println("""
                            MENU DE ESTUDIANTE
                           1. REGISTRAR TRABAJO 
                           2. REPORTAR 
                           3. TRANSACCIÓN
                           """);
        int Opestu = me.nextInt();
        return Opestu;
    }
    
    
    
    
}
