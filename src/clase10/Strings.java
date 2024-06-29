package clase10;

public class Strings {
    
    public static void main(String[] args) {
        
        String cadena = "Hola Mundo";
        String cadena2 = "hola mundo";
        
        int longitud = cadena.length();
        char letra = cadena.charAt(0);
        String substring = cadena.substring(0, 4);
        
        boolean sonIguales = cadena.equals(cadena2);
        
        String nuevaCadena = cadena.replace("o", "0");
        
        String cadenaNum = "30";
        int nuevoNumero = Integer.parseInt(cadenaNum);
        int num = 20;
        
        String nuevoDato = Integer.toString(num);
        String nuevoDato2 = String.valueOf(num);
        
//        System.out.println(((Object)letra).getClass().getSimpleName());
        
        ////////////////////
        
        
        int edad = 30;
        String nombre = "Goku";
        
//        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años");
        
        String mensaje = String.format("Hola, mi nombre es %s y tengo %d años", nombre, edad);
        
//        System.out.println(mensaje);

        boolean contieneDato = cadena.contains("mundo");
//        System.out.println(contieneDato);
        
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        
        
        

        
        
    }
    
}
