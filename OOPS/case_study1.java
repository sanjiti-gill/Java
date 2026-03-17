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
        Account a = new Account(100);
        System.out.println("Account interest: " + a.calculateInterest());

        Account acc = new FixedDeposit(60000);
        System.out.println("FixedDeposit interest: " + acc.calculateInterest());
    }
}
