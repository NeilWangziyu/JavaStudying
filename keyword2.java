public class keyword2 {
    public static void main(String[] args){
        B b = new B(new A());
    }
}

class A{
    public A(){
        new B(this).print();
    }

    public void print(){
        System.out.println("hello from A");
    }
}

class B{
    A a;
    public B(A a){
        this.a = a;
    }
    public void print(){
        a.print();
        System.out.println("hello from B");
    }
}