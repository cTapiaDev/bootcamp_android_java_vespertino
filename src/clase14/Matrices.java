package clase14;

public class Matrices {
    
    public static void main(String[] args) {
        
        int matriz[][] = new int[6][10];
        
//        System.out.println(matriz.length);
//        System.out.println(matriz[4].length);
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
