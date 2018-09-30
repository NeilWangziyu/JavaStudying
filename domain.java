public class domain {
    public static String name = "aaaaa";
    public int i;

    {
        int j = 2;
    }

    public void test1(){
        int j =3;
        if (j==3){
            int k =5;
        }
        System.out.println("name=" + name + ", i=" + i +", j="+j);
    }

    public static void main(String[] args){
        System.out.println(domain.name);

        domain t = new domain();
        t.test1();
    }
}
