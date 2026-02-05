import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        int original = number; // Store original for display
        
        // Handle negative numbers by working with absolute value
        int num = Math.abs(number);
        
        while (num > 0) {
            int digit = num % 10;           // Get last digit
            reversed = reversed * 10 + digit; // Build reversed number
            num /= 10;                      // Remove last digit
        }
        
        // Restore sign if original was negative
        if (number < 0) {
            reversed = -reversed;
        }
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        
        sc.close();
    }
}
