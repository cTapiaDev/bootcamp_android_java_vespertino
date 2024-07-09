package clase15;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    
    public static void main(String[] args) {
        
        // Crear un mapa
        Map<Integer, String> ciudades = new HashMap<>();
        
        // Agregar datos al mapa
        ciudades.put(10, "Santiago");
        ciudades.put(5, "Valparaiso");
        ciudades.put(25, "Linares");
        
        // Ver la dimension que tiene mi mapa
        System.out.println(ciudades.size());
        
        // Obtener un valor
        System.out.println(ciudades.get(25));
        
        // Verificar si la llave existe
        System.out.println(ciudades.containsKey(6));
        
        // Eliminar un dato
        ciudades.remove(5);
        
        // Recorrer un mapa
        for (Map.Entry<Integer, String> e : ciudades.entrySet()) {
            System.out.println(e);
        }
        
    }
    
}
