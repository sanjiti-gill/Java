class Student {
    static String prefix = "24070122";  
    static int counter = 1;             // counter for last 3 digits

    String username;
    String rollNo;

    // Parameterized constructor
    Student(String username) {
        this.username = username;
        this.rollNo = prefix + String.format("%03d", counter);
        counter++;
    }

    void display() {
        System.out.println("Username: " + username);
        System.out.println("Roll No: " + rollNo);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");
        Student s3 = new Student("Rahul");

        s1.display();
        s2.display();
        s3.display();
    }
}
