public class sequence {
    private String name;
    private int age;

    public sequence(){
        name = "ziyu";
        age = 5;
    }


    public static void main(String[] args){
        sequence obj = new sequence();
        System.out.println(obj.name + ' ' + obj.age);
    }
}
