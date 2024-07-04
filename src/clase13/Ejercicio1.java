package clase13;

import java.util.Scanner;

public class Ejercicio1 {
    
    /*
        Desarrolla un programa en Java que pida al usuario ingresar
        un número entero y determine si es un número primo o no.
    */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero: ");
        int num = input.nextInt();
        
        int divisor = 2;
        boolean esPrimo = true;
        
        while (divisor < num) {
            if (num % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
        }
        
        if (esPrimo) {
            System.out.println("Es un numero primo");
        } else {
            System.out.println("No es un numero primo");
        }
        
    }
    
}
