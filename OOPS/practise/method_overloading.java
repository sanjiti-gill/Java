class Calculator {
    // Same name 'add', but different parameters
    
    // Version 1: Add 2 numbers
    int add(int a, int b) {
        return a + b;
    }
    
    // Version 2: Add 3 numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Version 3: Add decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(5, 10));        // Calls version 1 → 15
        System.out.println(calc.add(5, 10, 15));    // Calls version 2 → 30
        System.out.println(calc.add(5.5, 2.5));     // Calls version 3 → 8.0
    }
}
