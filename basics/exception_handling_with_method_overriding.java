class superclass{
    void method(){
        System.out.println("super class method executed");
    }
}

class subclass extends superclass{
    void method() throws ArithmeticException{
        System.out.println("subclass method executed");
        throw new ArithmeticException("exception in subclass");
    }

    public static void main(String[] args){
        superclass s=new subclass();
        try{
            s.method();
        }
        catch(ArithmeticException e){
            System.out.println("caught exception: " + e.getMessage());
        }
    }
}
