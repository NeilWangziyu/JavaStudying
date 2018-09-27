package third;

public class Demo {
    public static void main(String[] args){
//        char
        char webName1 = 'w';
        char webName2 = 'w';
        char webName3 = 'z';
        System.out.println("name of website is : " + webName1 + webName2 + webName3);
//        int
        short x = 22;
        int y = 022;
        long z = 0x22L;
        System.out.println("into 10th:x=" + x + ", y=" + y + ", z=" + z);

//        float
        float m = 22.45f;
        double n = 10;
        System.out.println("m*n" + "=" + m*n);


        // 字符型
        boolean a = 100>10;
        boolean b = 100<10;
        System.out.println("100>10 = " + a);
        System.out.println("100<10 = " + b);

        if(a){
            System.out.println("100<10");
        }else{
            System.out.println("10>100");
        }


//        数据类型转换
//        强制转换
        int i;
        double j;
        i = (int)34.56 + (int)11.2;
        j = (double)x + (double)10 + 1;
        System.out.println("x=" + i);
        System.out.println("j=" + j);





    }
}
