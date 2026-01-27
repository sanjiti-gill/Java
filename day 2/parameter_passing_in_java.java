class test{
    void modifyvalue(int x){
        x=x+10;
    }

    public static void main(String[] args){
        int a=5;
        test obj= new test();
        obj.modifyvalue(a);
        System.out.println(a);
    }
}
