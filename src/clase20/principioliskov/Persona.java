package clase20.principioliskov;

public class Persona implements IPagar {
    
    private String nombre;
    private String apellido;
    private String rut;
    private int edad;
    private int cuentaRut;
    
    public Persona() {
        
    }

    public Persona(
            String nombre, 
            String apellido, 
            String rut, 
            int edad,
            int cuentaRut
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        this.cuentaRut = cuentaRut;
    }
    
    @Override
    public void pagar() {
        // Logica de pago
    }
    
    
    
}
