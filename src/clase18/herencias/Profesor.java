package clase18.herencias;

public class Profesor extends Persona {
    
    private int idProfesor;
    private String materia;
    
    public Profesor() {};

    public Profesor(
            int idProfesor, 
            String materia, 
            String nombre, 
            String apellido, 
            String rut, 
            int edad
    ) {
        super(nombre, apellido, rut, edad);
        this.idProfesor = idProfesor;
        this.materia = materia;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("-------");
        super.mostrarDatos(); 
    }

    @Override
    public String toString() {
        return "Profesor{" 
                + "idProfesor=" + idProfesor 
                + ", materia=" + materia 
                + "} " + super.toString();
    }
    
    
    
    
    
}
