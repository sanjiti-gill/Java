public class TryCatchExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        
        System.out.println("Program starting...");
        
        try {
            // This is the DANGER ZONE ⚠️
            System.out.println("Attempting division...");
            int result = num1 / num2;  // BOOM! This will throw ArithmeticException
            System.out.println("Result: " + result); // This line NEVER runs!
            
        } catch (ArithmeticException e) {
            // This is the SAFETY NET 🥅
            System.out.println("⚠️ Oops! Cannot divide by zero!");
            System.out.println("Technical details: " + e.getMessage());
        }
        
        // Look! The program is still alive!
        System.out.println("Program continues normally... Phew! 😅");
    }
}
