public class MultipleExceptionSingleCatch {
    public static void main(String[] args) {
        try {
            String str = "123a";  // This causes NumberFormatException
            int num = Integer.parseInt(str);  // BOOM! Exception here
            
            int result = 5 / 0;  // This line never executes
            
        } catch (ArithmeticException | NumberFormatException e) {
            // e is a NumberFormatException object here
            System.out.println("error: " + e.getClass().getSimpleName() + " occurred");
            // Prints: error: NumberFormatException occurred
        }
        
        System.out.println("program continues");
        // Prints: program continues
    }
}
