public class static_test {
    static int i;
    int j;

    public static void main(String[] args){
        static_test obj1 = new static_test();
        obj1.i = 10;
        obj1.j =20;

        static_test obj2 = new static_test();
        System.out.println(obj1.i + obj1.j);
        System.out.println(obj2.i + obj2.j);
    }
}
