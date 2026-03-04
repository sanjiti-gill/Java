public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 5;  // This index doesn't exist!
            int divisor = 0;
            
            int result = numbers[index] / divisor;  // Which will fail first?
            
        } catch (ArithmeticException e) {
            System.out.println("Math problem: " + e.getMessage());
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array problem: Invalid index!");
            
        } catch (Exception e) {  // The "catch-all" net
            System.out.println("Something else went wrong: " + e);
        }
    }
}
