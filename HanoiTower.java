public class HanoiTower {
    public static void moveDish(int level, char from, char inter, char to){
        if(level==1){
            System.out.println("from" + from + " move cup 1 to " + to);
        }else{
            moveDish(level-1, from, to, inter);
            System.out.println("from" + from + " move cup " +level +" to " + to);
            moveDish(level-1, inter, from, to);
        }
    }
    public static void main(String[] args){
        int nDisks = 3;
        moveDish(nDisks, 'A', 'B', 'C');
    }
}
