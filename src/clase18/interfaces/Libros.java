package clase18.interfaces;

public class Libros implements IDatos {
    
    private String titulo;
    private String descripcion;
    private String isbn;
    
    public Libros() {};
    
    public Libros(
            String titulo,
            String descripcion,
            String isbn
    ) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.isbn = isbn;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println(this.titulo);
    }
    

    @Override
    public String toString() {
        return "Libros{" 
                + "titulo=" + titulo 
                + ", descripcion=" + descripcion 
                + ", isbn=" + isbn 
                + '}';
    }

    

    
    
    
    
}
