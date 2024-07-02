package clase11;

public class ClaseSwitchCase {
    
    public static void main(String[] args) {
        
        int num = 10;
        
        switch (num) {
            case 1:
                System.out.println("Es el 1");
                break;
            case 2:
                System.out.println("Es el 2");
                System.out.println("bloque más grande");
                break;
            case 3:
                System.out.println("Es el 3");
                break;
            default:
                System.out.println("No es una opción valida");
                break;
        }
        
//        switch (num) {
//            case 1 -> System.out.println("Es el 1");
//            case 2 -> {
//                System.out.println("Es el 2");
//                System.out.println("bloque más grande");
//            }
//            case 3 -> System.out.println("Es el 3");
//            default -> System.out.println("No es una opción valida");
//        }
        
    }
    
}
