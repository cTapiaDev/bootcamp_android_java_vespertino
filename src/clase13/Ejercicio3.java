package clase13;

import java.util.Scanner;

public class Ejercicio3 {
    
    /*
        Crea un programa en Java que solicite números al usuario y
        muestre su suma. El programa debe continuar solicitando
        números hasta que el usuario ingrese 0. Cuando el programa
        finalice, mostrará "Suma Completa".
    */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        int suma = 0;
        
        do {
            System.out.println("Ingresa un numero");
            num = input.nextInt();
            
            if (num != 0) {
                System.out.print(suma + " + " + num + ": ");
                suma += num;
                System.out.println(suma);
            }
            
        } while (num != 0);
        
    }
    
}
