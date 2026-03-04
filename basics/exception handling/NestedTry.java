public class NestedTryExample {
    public static void main(String[] args) {
        try {  // Outer try block
            System.out.println("Outer try block started.");
            
            // Inner try block
            try {  
                System.out.println("Inner try block started.");
                int result = 10 / 0; // This will cause ArithmeticException
                
            } catch (ArithmeticException e) {  // Catch for inner try
                System.out.println("Caught ArithmeticException in inner try block: " + e.getMessage());
            }
            
            // This line is AFTER inner try-catch
            String str = null;
            System.out.println(str.length()); // This will cause NullPointerException
            
        } catch (NullPointerException e) {  // Catch for outer try
            System.out.println("Caught NullPointerException in outer try block: " + e.getMessage());
            
        } finally {  // Finally for outer try
            System.out.println("Finally block of outer try executed.");
        }
        
        System.out.println("Program continues after nested try-catch-finally blocks.");
    }
}
