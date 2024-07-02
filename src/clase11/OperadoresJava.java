package clase11;

public class OperadoresJava {
    
    public static void main(String[] args) {
        
        int a = 20;
        int b = 20;
        
//        int resultado = a + b;
//        int resultado = a - b;
//        int resultado = a * b;
//        int resultado = a / b;
        int resultado = a % b;
        
//        System.out.println(resultado);
        
        /*** OPERADORES RELACIONALES ***/
        
        boolean resultado2 = !(a == b);
//        boolean resultado2 = (a != b);
        
//        System.out.println(resultado2);
        
        /*** OPERADORES DE ASIGNACIÓN ***/
        
        int contador = 1;
        
//        contador = contador + 1;
        contador += 2;
        
//        System.out.println(contador);
        
        /*** OPERADORES INCREMENTALES Y DECREMENTALES ***/
        
        int num = 5;
        int num2 = num++;
        
        System.out.println(num2);
        System.out.println(num);
    }
    
}
