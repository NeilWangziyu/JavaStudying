public class reload {
    void test(){
        System.out.println("no parameters");
    }

    void test(int a){
        System.out.println("a: " + a);

    }

    void test(int a, int b){
        System.out.println("a and b :" + a + b);
    }

    double test(double a){
        System.out.println("double a:" + a);
        return a*a;
    }


    public static void main(String args[]){
        reload obj = new reload();
        obj.test();
        obj.test(2);
        obj.test(2.4);
        obj.test(3,4);
    }
}
