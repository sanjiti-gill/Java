class person{
    String name;

    void display(){                            //instance method;
        System.out.println("name: " + name);
    }

    public static void main(String[] args){
        person p=new person();
        person q=new person();
        person r=new person();

        p.name="sanjiti";
        p.display();   //instance method calling using object

        q.name="riya";
        q.display();

        r.name="ram";
        r.display();

    }
}
