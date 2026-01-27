class bank{

    String acc_holder;   //instance variables
    int acc_no;
    int balance;

    bank(String name, int num, int bal){
        acc_holder=name;
        acc_no=num;
        balance=bal;
    }

    void display(){
        System.out.println("name is: "+ acc_holder);
        System.out.println("account number is: " + acc_no);
        System.out.println("balance is: " + balance);
    }

    public static void main(String[] args){

        bank b1= new bank("sanjiti", 101,1000);  //instance variable called from an object, each object has unique value
        bank b2= new bank("riya", 102, 2000);
        bank b3= new bank("ram", 103, 3000);

        b1.display();
        b2.display();
        b3.display();
    }

}
