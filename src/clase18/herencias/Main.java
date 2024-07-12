package clase18.herencias;

public class Main {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona(
                "Pedrito", 
                "Santos", 
                "123123-k", 
                25
        );
        
        Alumno alumno1 = new Alumno(
                01, 
                "Economia", 
                "Juanito", 
                "Perez", 
                "12312412-2", 
                23
        );
        
        Profesor profesor1 = new Profesor(
                1, 
                "Historia", 
                "Tomas", 
                "Campos", 
                "123123-0", 
                30
        );
        
//        System.out.println(persona1);
//        System.out.println(alumno1);
//        System.out.println(profesor1);

        persona1.mostrarDatos();
        profesor1.mostrarDatos();
        
        System.out.println(alumno1);
        
        
        
    }
    
}
