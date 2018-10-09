public class Devision_2 {
    public static void main(String args[]){
        String s = "无言独上西楼，月如钩，寂寞梧桐。" + "剪不断理还乱，是离愁" +
                "别是一番滋味在心头。";
        System.out.println("former length:"+s.length());
        String[] news = s.split("，|。");
        for (int i=0;i<news.length;i++){
            System.out.println(news[i]);
        }
    }
}
