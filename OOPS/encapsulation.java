class Student { 
    private int marks;
    private String name;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {
            marks = m;
        } else {
            System.out.println("invalid");
        }
    }

   
    public String getName() { // Should return String
        return name;
    }

    public int getMarks() { // Should return int
        return marks;
    }

    public static void main(String[] args) {
        Student s = new Student("Sanjiti", 82);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());

        s.setMarks(120); // invalid
        s.setMarks(35);  // valid
        
        // Print updated marks
        System.out.println("Updated Marks: " + s.getMarks());
    }
}
