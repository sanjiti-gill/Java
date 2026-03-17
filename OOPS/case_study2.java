class Employee{
    public String name;
    public double baseSalary;

    public Employee(String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public double calculateSalary(){
        double housingAllowance=baseSalary*0.05;
        double totalSalary=baseSalary+housingAllowance;
        return totalSalary;
    }
}

class Manager extends Employee{
    
    public Manager(String name, double baseSalary){
        super(name,baseSalary);
    }

    @Override
    public double calculateSalary(){
        double managementBonus=super.calculateSalary()+2000;
        return managementBonus;
    }
}

class Executive extends Manager{
    public Executive(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary(){
        double executiveSalary=super.calculateSalary()+(0.10*baseSalary);
        return executiveSalary;
    }
}

class bank{
    public static void main(String[] args) {
        Employee e= new Employee("alice", 10000);
        System.out.println("employee salary:"+ e.calculateSalary());

        Employee ee= new Manager("bob", 10000);
        System.out.println("manager salary:"+ ee.calculateSalary());

        Employee eee=new Executive("charlie", 10000);
        System.out.println("executive salary:"+ eee.calculateSalary());
    }}
