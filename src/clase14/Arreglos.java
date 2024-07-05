package clase14;

import java.util.Scanner;

public class Arreglos {
    
    public static void main(String[] args) {
        
//        int num[] = new int[10];
//        int [] num2 = new int[10];
//        String cadenas[] = new String[10];
//        
////        System.out.println(num.length);
//        System.out.println(num[6]);
//        System.out.println(cadenas[5]);
//        System.out.println(num[10]);
    
        /**** Ejercicio 1 Arreglos ****/
        
//        Scanner input = new Scanner(System.in);
//        int edad[] = new int[20];
//        
//        for (int i = 0; i < edad.length; i++) {
//            System.out.println("Ingresa una edad");
//            edad[i] = input.nextInt();
//        }
//        
//        System.out.println("------");
//        
//        for (int i = 0; i < edad.length; i++) {
//            System.out.print(edad[i] + " ");
//        }
//
//        System.out.println((int) (Math.random() * 100));
//
//        for (int i = 0; i < edad.length; i++) {
//            edad[i] = (int) (Math.random() * 100);
//            edad[i] = (int) (Math.random() * (40 - 10) + 10); // (max - min) + min
//            System.out.println(edad[i]);
//        }
//
//        double nRandom = Math.random() * 100;
//        System.out.println(Math.floor(nRandom * 100) / 100);

    
        /**** ARREGLO DE TIPO STRING ****/
//        String nombre[] = new String[5];
        String nombres[] = {"Corre caminos", "Pato lucas", "Chavo", "Tom", "Jerry"};
        
        for (String e : nombres) {
            System.out.println(e.toUpperCase());
        }
        
        
        
    }
    
}
