public class extends_test3 {
    public static void main(String[] args){
        Dogs obj = new Dogs("花花",3);
        obj.say();
    }
}

class Animals{
    String name;
    public Animals(String name){
        this.name = name;
    }
}

class Dogs extends Animals{
    int age;
    public Dogs(String name, int age){
        super(name);
        this.age = age;
    }

    public void say(){
        System.out.println("I am a cute dog and name is "+ name+ "and i am "+ age);
    }
}

