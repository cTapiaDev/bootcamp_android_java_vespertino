package clase11;

import java.util.Scanner;

public class EjercicioSwitchCase {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un dia de la semana");
        String dia = input.next().toLowerCase();
        
//        switch (dia) {
//            case "lunes":
//                System.out.println("Inicio de semana");
//                break;
//            case "martes", "miercoles", "jueves":
//                System.out.println("Mediados de semana");
//                break;
//            case "viernes":
//                System.out.println("Ultimo dia de la semana");
//                break;
//            case "sabado", "domingo":
//                System.out.println("Fin de semana");
//                break;
//            default:
//                System.out.println("El dato ingresado es invalido");
//                break;
//        }
        
        switch (dia) {
            case "lunes" -> System.out.println("Inicio de semana");
            case "martes", "miercoles", "jueves" -> System.out.println("Mediados de semana");
            case "viernes" -> System.out.println("Ultimo dia de la semana");
            case "sabado", "domingo" -> System.out.println("Fin de semana");
            default -> System.out.println("El dato ingresado es invalido");
        }
        
        
        
    }
    
}
