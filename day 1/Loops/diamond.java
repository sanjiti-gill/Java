import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows till half of diamond:");
        int n = sc.nextInt();

        // TOP HALF
        for (int i = 1; i <= n; i++) {
            // 1. Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // 2. Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // 3. New line
            System.out.println();
        }

        // BOTTOM HALF
        for (int i = n - 1; i >= 1; i--) {
            // 1. Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // 2. Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // 3. New line
            System.out.println();
        }
        
        sc.close();
    }
}
