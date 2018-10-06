import java.util.Scanner;
public class CheckLogin {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("input user name: ");
        String username = scan.nextLine();
        System.out.println("input password: ");
        String password = scan.nextLine();
        if (!username.equals("mr")){
            System.out.println("User name wrong");
        }
        else if (!password.equals("mrsoft")){
            System.out.println("password wrong");
        }else{
            System.out.println("Congratulation");
        }

    }
}
