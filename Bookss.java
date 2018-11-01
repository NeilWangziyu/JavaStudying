public class Bookss {
    private static int counter =0;
    public Bookss(String title){
        System.out.println("出售图书:" + title);
        counter ++;
    }
    public static int getCounter(){
        return counter;
    }
}
