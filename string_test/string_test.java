package string_test;

public class string_test {
    public static void main(String[] args){
        String stuname = "xiaoming";
        int stuAge = 17;
        float sutscore =92.5f;

        String info = stuname + "'s afe is " + stuAge +" and score is "+ sutscore;
        System.out.println(info);

        String str1 = "微学院";
        String str2 = "weixueyuan";
        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println(str2.charAt(0) + "   " + str2.charAt(3));
        System.out.println(str1.contains("x"));

        StringBuffer str3 = new StringBuffer();
        StringBuffer str4 = new StringBuffer(523);
        System.out.println(str4);
        str4.append("abcd");
        System.out.println(str4);
        str4.deleteCharAt(1);
        System.out.println(str4);
    }
}
