package clase11;

public class ClaseIfElse {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 15;
        int c = 12;
        
        /*** IF-ELSE ***/
        
//        if (a == b) {
//            System.out.println("Soy un bloque true");
//        } else {
//            System.out.println("Soy un bloque false");
//        }
        
        /*** OPERADOR TERNARIO ***/

        String mensaje = (a == b) ? "Soy un bloque true" : "Soy un bloque false";
        System.out.println(mensaje);
        
        
        /*** IF-ELSE ANIDADOS ***/

//        if (a == b) {
//            if (a > c) {
//                System.out.println("Soy un bloque anidado mayor");
//            } else {
//                System.out.println("Soy un bloque anidado menor");
//            }
//        } else if (a == c) {
//            System.out.println("Soy un bloque if-else");
//        } else {
//            System.out.println("Soy un bloque false");
//        }
        
    }
    
}
