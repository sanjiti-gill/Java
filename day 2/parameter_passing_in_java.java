//pass by value
class Test {

    void change(int x) {
        x = x + 10;
        System.out.println("Inside method x = " + x); //output=15
    }

    public static void main(String[] args) {
        int a = 5;

        Test obj = new Test();
        obj.change(a);

        System.out.println("Outside method a = " + a);    //output=5
    }
}
