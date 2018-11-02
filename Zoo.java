public class Zoo {
    public static void main(String[] args){
        Dog dog = new Dog();
        System.out.println("dogs");
        dog.cry();

        Cats cat = new Cats();
        System.out.println("cats cay");
        cat.cry();

        Sheep sheep = new Sheep();
        System.out.println("sheep doing cry");
        sheep.cry();
    }
}
