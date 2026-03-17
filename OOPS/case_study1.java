class Account{
    public double balance;

    public Account(double balance){
        this.balance=balance;
    }

    public double calculateInterest(){
        return balance*0.02;
    }
}

class SavingsAccount extends Account{

    public SavingsAccount(double balance){
        super(balance);
    }

    @Override
    public double calculateInterest(){
        double interest = balance*0.04;
        if (balance>50000){
            interest= interest+500; 
        }
        return interest;
    }
}

class FixedDeposit extends SavingsAccount{

    public FixedDeposit(double balance){
        super(balance);
    }

    @Override
    public double calculateInterest(){
        double savingsInterest=super.calculateInterest(); 
        double extraInterest=balance*0.02; 
        return savingsInterest+extraInterest;
    }
}

class bank{
    public static void main(String[] args){
        Account a=new SavingsAccount(10000);
        System.out.println("SavingsAccount interest: " + a.calculateInterest()); //1) 400

        Account b= new SavingsAccount(60000);
        System.out.println("Savings account interest: "+ b.calculateInterest());  //2) 2900

        Account acc =new FixedDeposit(60000);
        System.out.println("FixedDeposit interest: " + acc.calculateInterest());  //3) 4100
    }
}
