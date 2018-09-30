package Dog;

public class Dog {
    private String name;
    private int age;

    Dog(String name1, int age1){
        name = name1;
        age = age1;
        System.out.println("thank you");
    }

    protected void bark(){
        System.out.println("wangwang");
    }

    void hungry(){
        System.out.println("hungry");
    }

    public int getAge(){
        return age;

    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String arg[]){
        Dog myDog = new Dog("huahua", 3);

        String name = myDog.name;
        int age = myDog.age;
        System.out.println("i am " + name + " and i am " + age + "years old.");
        myDog.bark();
        myDog.hungry();

    }
}
