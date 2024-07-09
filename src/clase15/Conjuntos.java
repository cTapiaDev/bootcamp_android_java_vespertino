package clase15;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    
    public static void main(String[] args) {
        
        // Crear un conjunto
        Set<String> ciudades = new HashSet<>();
        
        // Agregar datos al conjunto
        ciudades.add("Santiago");
        ciudades.add("Rancagua");
        ciudades.add("Punta Arenas");
        ciudades.add("Talca");
        
        // Verificar si mi dato existe o no
        System.out.println(ciudades.contains("Rancagua"));
        
        // Eliminar un dato
        ciudades.remove("Rancagua");
        
        // Obtener dimensiones de mi conjunto
        System.out.println(ciudades.size());
        
        // Recorrer mi conjunto
        for (String e : ciudades) {
            System.out.println(e);
        }
        
        // Vaciar mi conjunto
        ciudades.clear();


        /**** Ejercicio Conjuntos ****/
        
//        Set<Integer> conjunto1 = new HashSet<>();
//        Set<Integer> conjunto2 = new HashSet<>();
//        
//        conjunto1.add(1);
//        conjunto1.add(2);
//        conjunto1.add(3);
//        
//        conjunto2.add(2);
//        conjunto2.add(3);
//        conjunto2.add(4);
//        
//        conjunto1.retainAll(conjunto2);
//        
//        for (Integer e : conjunto1) {
//            System.out.println(e);
//        }
//        
//        System.out.println(conjunto1);
//        System.out.println(conjunto2);
        
    }
    
}
