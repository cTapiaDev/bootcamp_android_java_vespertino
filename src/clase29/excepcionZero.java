package clase29;

public class excepcionZero {
    
    public static void main(String[] args) {
        
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getClass().getSimpleName());
        }
        
        System.out.println("exploto!!!");
        
        
    }
    
}
