package clase18.herencias;

import clase18.interfaces.IDatos;

public class Persona implements IDatos {
    
    private String nombre;
    private String apellido;
    private String rut;
    private int edad;
    
    // Constructores
    public Persona() {};
    
    public Persona(
            String nombre,
            String apellido,
            String rut,
            int edad
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
    }
    
    // Metodo creado
    @Override
    public void mostrarDatos() {
        System.out.println(this.nombre + " " + this.apellido 
                + " - " + this.edad + " anios");
    }

    @Override
    public String toString() {
        return "Persona{" 
                + "nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", rut=" + rut 
                + ", edad=" + edad 
                + '}';
    }
    
    
    
}
