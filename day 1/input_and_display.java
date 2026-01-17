import java.util.Scanner;

class input{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter name: ");
        String name= sc.next();

        System.out.print("enter best friend's name: ");
        String bname= sc.next();

        System.out.println("name is: " + name);
        System.out.println("best friend's name is:" + bname);

        sc.close();
    }
}
