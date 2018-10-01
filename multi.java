public class multi {
    public static void main(String[] args){
        Animalold obj = new Animalold();
        obj.cry();


        obj = new Cat();
        obj.cry();

        obj = new Dog_new();
        obj.cry();
    }

}


class Animalold{
    public void cry(){
        System.out.println("dont know to cry");

    }
}

class Cat extends Animalold{
    public void cry(){
        System.out.println("miaomiao");
    }
}


class Dog_new extends Animalold{
    @Override
    public void cry() {
        System.out.println("wangwang");
    }
}