public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            // I'm deliberately creating an exception!
            throw new IllegalArgumentException("Age must be 18 or above!");
        }
        System.out.println("Welcome to the club! 🎉");
    }
    
    public static void main(String[] args) {
        try {
            checkAge(15);  // This will throw our custom exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught it: " + e.getMessage());
        }
    }
}
