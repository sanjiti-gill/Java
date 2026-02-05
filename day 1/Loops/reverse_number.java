import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        
        while (number > 0) {
            int digit = number % 10;        // Get last digit
            reversed = reversed * 10 + digit; // Add to reversed
            number /= 10;                   // Remove last digit
        }
        
        System.out.println("Reversed: " + reversed);
        sc.close();
    }
}
