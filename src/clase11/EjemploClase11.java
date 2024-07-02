package clase11;

import java.util.Scanner;

public class EjemploClase11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el puntaje del alumno: ");
        int puntaje = input.nextInt();
        
        String nota = "";
        
        if (puntaje >= 90 && puntaje <= 100) {
            nota = "Sobresaliente";
        } else if (puntaje >= 80 && puntaje < 90) {
            nota = "Notable";
        } else if (puntaje >= 70 && puntaje < 80) {
            nota = "Bien";
        } else if (puntaje >= 60 && puntaje < 70) {
            nota = "Suficiente";
        } else if (puntaje > 100) {
            nota = "Puntaje no valido";
        } else {
            nota = "Insuficiente";
        }
        
        System.out.println("La nota es: " + nota);
        
    }
    
}
