
package Model;


public class PersonalModel {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String facultad;
    protected String cargo;

    public PersonalModel() {
    }

    public PersonalModel(String nombre, String apellido, int edad, String facultad, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.facultad = facultad;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "PersonalModel{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", facultad=" + facultad + ", cargo=" + cargo + '}';
    }

    
    
}
