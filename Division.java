public class Division {
    public static void main(String args[]){
        String s = new String("abc,def,ghi,gkl");
        String[] news = s.split(",");
        System.out.println("after split: ");
        for (int i = 0; i < news.length; i++){
            System.out.println(news[i]);
        }
    }
}
