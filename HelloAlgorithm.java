public class HelloAlgorithm {
    public static int gcd(int p, int q){
        if (q>p){
            int tem = q;
            q = p;
            p = tem;
        }

        if (q==0) return p;
        int r = p % q;
        return gcd(q, r);
    }


    public static void main(String[] args){
        int p = 15;
        int q = 20;
        int their_gcd = gcd(p, q);
        System.out.println(p+" and "+q+" 的gcd is "+ their_gcd);


    }

}


