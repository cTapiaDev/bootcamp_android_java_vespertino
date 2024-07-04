package clase13;

import java.util.Scanner;

public class Ejercicio5 {
    
    /*
        Crea un pequeño programa que permita al usuario ingresar una
        palabra o una frase.
        Almacena el dato en una variable.
        
        Utiliza los conocimientos adquiridos para invertir el texto
        letra por letra y almacenar el resultado en una nueva variable.
    
        Ejemplo:
        -- hola mundo -> odnum aloh
    */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String invertida = "";
        
        System.out.println("Ingresa una frase");
        String frase = input.nextLine();
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }
        
        System.out.println(invertida);
        
        
    }
    
}
