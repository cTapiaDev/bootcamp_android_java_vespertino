package clase14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Listas {
    
    public static void main(String[] args) {
        
        // Crear Lista
        List<String> ciudades = new ArrayList<>();
        
        // Agregar datos a la lista
        ciudades.add("Talca");
        ciudades.add("Santiago");
        ciudades.add("Iquique");
        ciudades.add("Talca");
        ciudades.add("Punta Arenas");
        
        // Obtener las dimensiones de mi lista
        System.out.println(ciudades.size());
        
        // Obtener un elemento
        System.out.println(ciudades.get(1));
        
        // Eliminar un elemento
        ciudades.remove(1);
        ciudades.remove("Talca");
        
        // Modificar un elemento
        ciudades.set(1, "Antofagasta");
        
        // Ordenar la lista
        Collections.sort(ciudades);
        
        // Mostrar nuestra lista
        for (String e : ciudades) {
            System.out.println(e);
        }
        
        // Borrar los datos de la lista.
        ciudades.clear();
        
        
        /*** Ejemplo ***/
        
//        Scanner input = new Scanner(System.in);
//        
//        int contador = 0;
//        String nuevaCiudad = "";
//        
//        while (contador < 3) {
//            System.out.println("Ingresa una ciudad");
//            nuevaCiudad = input.next();
//            ciudades.add(nuevaCiudad);
//            
//            contador++;
//        }
//        
//        for (String e : ciudades) {
//            System.out.println(e);
//        }

//        int contador = 0;
//        String nuevaCiudad = "";
//        
//        while (contador < 3) {
//            System.out.println("Ingrese la nueva ciudad");
//            nuevaCiudad = input.nextLine();
//            ciudades.add(nuevaCiudad);
//            contador++;
//        }
//        
//        for (String e: ciudades) {
//            System.out.println(e);
//        }
        
    }
    
}
