public class Jerque {
    public static void main(String[] args){
        String str = "";
        long starTime = System.currentTimeMillis();
        for (long i=0;i<1000000;i++){
            str = str + 1;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        System.out.println("String cost time: "+time);
        StringBuilder builder = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for (long j=0;j<1000000;j++){
            builder.append(j);
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;
        System.out.println("String builder time: "+time);
    }
}
