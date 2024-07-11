package clase17;

public class Alumno {
    
    private String nombre;
    private String apellido;
    private String rut;
    private int numeroSalon;
    
    // Constructores
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String rut, int numeroSalon) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroSalon = numeroSalon;
    }
    
    // Metodos
//    public void mostrarNombreCompleto() {
//        System.out.println(this.nombre + " " + this.apellido);
//    }
    
    public String mostrarNombreTexto() {
        return this.nombre + " " + this.apellido;
    }
    
    // Getters and Setters
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumeroSalon() {
        return numeroSalon;
    }

    public void setNumeroSalon(int numeroSalon) {
        this.numeroSalon = numeroSalon;
    }
    
    
    // toString()
    @Override
    public String toString() {
//        return "Alumno{" 
//                + "nombre=" + nombre 
//                + ", apellido=" + apellido 
//                + ", rut=" + rut 
//                + ", numeroSalon=" 
//                + numeroSalon 
//                + '}';
        return "Alumno: " + getNombre();
    }
    
    
    
    
    
}
