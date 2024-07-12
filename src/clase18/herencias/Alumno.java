package clase18.herencias;

public class Alumno extends Persona {
    
    private int idAlumno;
    private String carrera;
    
    public Alumno() {};

    public Alumno(
            int idAlumno, 
            String carrera, 
            String nombre,
            String apellido,
            String rut,
            int edad
    ) {
        super(nombre, apellido, rut, edad);
        this.idAlumno = idAlumno;
        this.carrera = carrera;
    };

    @Override
    public String toString() {
        return "Alumno{" 
                + "idAlumno=" + idAlumno 
                + ", carrera=" + carrera 
                + "} " + super.toString();
    }
    
    

    
    
    
    
}
