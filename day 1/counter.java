class counter{
    static int count=0;   //static variable

    counter(){
        count++;
        System.out.println("object created, current count:" +count);
    }

    public static void main(String[] args){
        counter obj1= new counter();
        counter obj2= new counter();
        counter obj3= new counter();

        System.out.println("final count:" + counter.count);
    }
}
