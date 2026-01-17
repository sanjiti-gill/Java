import java.util.Scanner;

class operation{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1=sc.nextInt();

        System.out.print("enter second number: ");
        int num2=sc.nextInt();

        int sum=num1+num2;
        int multiply=num1*num2;

        System.out.println("sum is:" + sum);
        System.out.println("multiplication is: " + multiply);

        sc.close();
    }
}
