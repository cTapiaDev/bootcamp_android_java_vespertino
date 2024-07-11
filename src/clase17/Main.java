package clase17;

public class Main {
    
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Pedrito", "Gonzalez", "25324523-2", 10);
        Alumno alumno2 = new Alumno("Juanito", "Alcachofa", "213123-4", 12);
        
        alumno1.setNombre("Speedy");
//        System.out.println(alumno1.getNombre());
//        System.out.println(alumno2);

        System.out.println(alumno1.getNumeroSalon());
        
    }
    
}
