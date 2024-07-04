package clase13;

import java.util.Scanner;

public class Ejercicio4 {
    
    /*
        - Crea un programa que pida ingresar por teclado una frase o
        una palabra.
        - Con ayuda de un ciclo, cuenta cuantas vocales hay en total
        en la frase/palabra.
        - chartAt y length te pueden ayudar a resolverlo.
        
        Extra: Se pueden encontrar que usamos isBlank() para revisar si
        el dato que nos llega está vacio o no.
    
        - La diferencia entre isBlank() e isEmpty() es que el segundo
        no considera una cadena llena de espacios como un String vacio,
        en cambio isBlank() si lo hace.
    */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String palabra = "";
        String nuevaPalabra = "";
        int cA = 0, cE = 0, cI = 0, cO = 0, cU = 0;
        
        do {
            System.out.println("Ingresa una palabra");
            palabra = input.nextLine().toLowerCase();
            
            if (!palabra.isBlank()) {
                
                for (int i = 0; i < palabra.length(); i++) {
                    switch (palabra.charAt(i)) {
                        case 'a':
                            cA++;
                            break;
                        case 'e':
                            cE++;
                            break;
                        case 'i':
                            cI++;
                            break;
                        case 'o':
                            cO++;
                            break;
                        case 'u':
                            cU++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                System.out.println("No ingreses un campo sin texto");
            }
            
            
        } while(palabra.isBlank());
        
        System.out.println("La cantidad de vocales son: ");
        System.out.println("A: " + cA);
        System.out.println("E: " + cE);
        System.out.println("I: " + cI);
        System.out.println("O: " + cO);
        System.out.println("U: " + cU);
        
    }
    
}
