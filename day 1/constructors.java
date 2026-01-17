
class student{
    int rollNo;
    String name;

    student(){                    //default
        rollNo=0;
        name="nil";
    }

    student(int r, String n){    //parameterised
        rollNo=r;
        name=n;
    }

    student(student s){         //copy
        rollNo=s.rollNo;
        name=s.name;
    }

    void display(){
        System.out.print("roll no is: " + rollNo);
        System.out.print("name is: " + name);
        System.out.println();
    }

    public static void main(String[] args){
        student s1= new student(); //for default constructor
        s1.display();

        student s2=new student(18,"sanjiti"); //for parameterised constructor
        s2.display();

        student s3= new student(s2);// for copy constructor
        s3.display();

    }
}
