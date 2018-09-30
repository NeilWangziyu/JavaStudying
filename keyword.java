public class keyword {
    public int x = 10;
    public int y = 15;

    public void sum(){
        int z = this.x + this.y;
        System.out.println("z="+z);

    }

    public static void main(String[] args){
        keyword obj = new keyword();
        obj.sum();
    }
}
