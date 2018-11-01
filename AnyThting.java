public class AnyThting {
    public AnyThting(){
        this("this 的调用方法");
        System.out.println("无构造方法");

    }
    public AnyThting(String name){
        System.out.println("有参数构造方法");
    }

    public static void main(String[] args){
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}

