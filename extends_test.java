class People{
    String name;
    int age;
    int height;
    void say(){
        System.out.println("my name is "+name+" age is "+age+" height is "+height);
    }
}

class Teacher extends People{
    String shcool;
    String subject;
    int seniority;

    void say(){
        System.out.println("my name is "+name+" age is "+age+" height is "+height
        + "my shcool is "+shcool+" my subject is "+subject );
    }

    void lecturing(){
        System.out.println("i am "+ age+"years old and still in shcool");
    }


}


public class extends_test {
    public static void main(String[] args){
        Teacher t = new Teacher();
        t.name = "neil";
        t.age = 70;
        t.shcool = "qinghua";
        t.subject = "java";
        t.seniority = 20;
        t.say();
        t.lecturing();

    }
}
