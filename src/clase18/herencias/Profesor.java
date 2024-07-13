package clase18.herencias;

public class Profesor extends Persona {
    
    private int idProfesor;
    
    public Profesor() {};

    public Profesor(
            int idProfesor,
            String nombre, 
            String apellido, 
            String rut, 
            int edad
    ) {
        super(nombre, apellido, rut, edad);
        this.idProfesor = idProfesor;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    
    public String nombreCompleto() {
        return getNombre() + " " + getApellido();
    }
    
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Profesor");
    }

    @Override
    public String toString() {
        return "Profesor{" 
                + "idProfesor=" + idProfesor
                + "} " + super.toString();
    }
    
    
    
    
    
}
