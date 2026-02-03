import java.util.Scanner;
class calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        calculator c= new calculator();

        System.out.println("enter number A: "); 
        int a=sc.nextInt();

        System.out.println("enter number B: "); 
        int b=sc.nextInt();

        System.out.println("sum is: "+ c.add(a,b));

        System.out.println("Enter number a: ");
        double A=sc.nextDouble();

        System.out.println("enter number B:");
        double B=sc.nextDouble();

        System.out.println("sum of doubles is: "+ c.add(A,B));

        System.out.println("enter number c");
        int d=sc.nextInt();

        System.out.println("sum of a,b,c is:"+ c.add(a,b,d));

        sc.close();


    }
}

