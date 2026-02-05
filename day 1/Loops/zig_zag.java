import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String[] args) {
        int rows = 3;  
        int cols = 9;  
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
               
                
                if (i == 1 || i == 3) { 
                    if (j % 4 == 1) {  
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {  
                    if (j % 4 == 1) {   
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println(); 
        }
    }
}
