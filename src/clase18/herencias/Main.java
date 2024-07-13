package clase18.herencias;

import clase19.intercambioObjetos.Materia;
import clase19.polimorfismo.Listado;

public class Main {
    
    public static void main(String[] args) {
        
        Listado listaPersonas = new Listado();
        
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
        
        Alumno alumno2 = new Alumno(
                02,
                "Economia",
                "Speedy",
                "Gonzalez",
                "123123-2",
                25
        );

        Profesor profesor1 = new Profesor(
                1,  
                "Tomas", 
                "Campos", 
                "123123-0", 
                30
        );
        
//        System.out.println(persona1);
//        System.out.println(alumno1);
//        System.out.println(profesor1);

//        persona1.mostrarDatos();
//        profesor1.mostrarDatos();
//        
//        System.out.println(alumno1);

        listaPersonas.agregarPersonas(persona1);
        listaPersonas.agregarPersonas(alumno1);
        listaPersonas.agregarPersonas(profesor1);
        
//        listaPersonas.mostrarListado();

        // CREAR UNA MATERIA
        Materia historia = new Materia("Historia", profesor1);
        
        
        // Agregar alumnos a la materia
        historia.agregarAlumnos(alumno1);
        historia.agregarAlumnos(alumno2);
        
        // Mostrar datos de la materia
        historia.mostrarDatosMateria();
        
        
        
    }
    
}
