class student{

    static int roll_prefix=24070122;  //static variable
    int roll_suffix;
    String name;

    student(int roll, String name){
        this.roll_suffix=roll;
        this.name=name;
    }

    void display(){
        System.out.println("roll no. is: "+ student.roll_prefix + roll_suffix); //static variable called using class
        System.out.println("name is: " + name);
    }

    public static void main(String[] args){

        student s1= new student(101, "sanjiti");
        student s2=new student(102, "riya");
        student s3= new student(103, "siya");

        s1.display();
        s2.display();
        s3.display();
    }
}
