package clase15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EjercicioListas {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa la dimension que tendra tu lista");
        int dimension = input.nextInt();
        int nRandom = 0;
        
        for (int i = 0; i < dimension; i++) {
            nRandom = (int) (Math.random() * 100);
            numeros.add(nRandom);
        }
        
        System.out.println("--------------");
        
        Collections.sort(numeros);
        
        for (Integer e : numeros) {
            System.out.println(e);
        }
        
        System.out.println("--------------");
        
        System.out.println("Ingresa el numero menor del rango");
        int nMenor = input.nextInt();
        
        System.out.println("Ingresa el numero mayor del rango");
        int nMayor = input.nextInt();
        
        System.out.println("--------------");
        
//        for (int i = numeros.size() - 1; i >= 0; i--) {
//            if (numeros.get(i) < nMenor || numeros.get(i) > nMayor) {
//                numeros.remove(i);
//            }
//        }

//        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println("[" + i + "] = " + numeros.get(i));
//            System.out.println();
//            if (numeros.get(i) < nMenor || numeros.get(i) > nMayor) {
//                numeros.remove(i);
//            }
//        }

        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            Integer numero = iterador.next();
            if (numero < nMenor || numero > nMayor) {
                iterador.remove(); // Elimina el elemento actual del Iterator
            }
        }
        
        for (Integer e : numeros) {
            System.out.println(e);
        }
        
        
        
        
    }
    
}
