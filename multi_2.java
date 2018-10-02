public class multi_2 {
    public static void main(String[] args){
        Master ma = new Master();
        ma.feed(new Animal_three(), new Food());
        ma.feed(new Cat_three(), new Fish());
        ma.feed(new Dog_three(), new Bone());
    }
}

class Animal_three{
    public void eat(Food f){
        System.out.println("i am a little animal and are eating "+f.getFood());
    }
}

class Cat_three extends Animal_three{
    public void eat(Food f){
        System.out.println("I am a little cat are eating " + f.getFood());
    }
}

class Dog_three extends Animal_three{
    public void eat(Food f){
        System.out.println("I am a little dog and are eating "+ f.getFood());

    }
}

class Food{
    public String getFood(){
        return "things";
    }

}

class Fish extends Food{
    public String getFood(){
        return "fish";
    }
}

class Bone extends Food{
    public String getFood(){
        return "Bone";
    }
}


class Master{
    public void feed(Animal_three an, Food f){
        an.eat(f);
    }
}

