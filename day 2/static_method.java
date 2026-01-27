class CounterExample {

    static int count = 0;   // static variable

    // static method
    static void increment() {
        count++;
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {
        CounterExample.increment();
        CounterExample.increment();
        CounterExample.increment();              //class used to call static method
    }
}
