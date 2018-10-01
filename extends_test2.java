public class extends_test2 {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.move();
    }
}


class Animal{
    private String desc = "Animals are human's friends";

    public String getDesc(){
        return desc;
    }

    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    public void move(){
        super.move();
        System.out.println("Dogs can walk and run");
        System.out.println("Please rememver: "+super.getDesc());
    }
}
