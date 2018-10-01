public class package_test {
    public static void main(String[] args){
        int m = 500;
        Integer obj = m;    //自动装箱
        int n = obj;        //自动拆箱
//        important
        System.out.println("n="+n);

        Integer obj1 = 500;
        System.out.println("obj is equal to obj1?" + obj.equals(obj1));

    }
}
