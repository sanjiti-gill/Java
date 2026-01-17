import java.util.Scanner;

class age{
    int age;

    void checkAge(){
        if (age>=18){
            System.out.println("adult");
        }
        else{
            System.out.println("minor");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        age a1=new age();

        System.out.print("enter age");
        a1.age=sc.nextInt();

        a1.checkAge();

        sc.close();
    }
}

