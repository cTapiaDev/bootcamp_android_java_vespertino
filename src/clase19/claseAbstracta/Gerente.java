package clase19.claseAbstracta;

public class Gerente extends Empleado {
    
    private int idGerente;

    public Gerente(int idGerente, String nombre, int salario) {
        super(nombre, salario);
        this.idGerente = idGerente;
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente " + getNombre() + " esta supervisando a los trabajadores");
    }

    
    
}
