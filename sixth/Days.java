package sixth;

import java.util.*;

public class Days {
    public static void main(String[] args){
        int days = 0;

        // 获取用户输入
        Scanner sc = new Scanner(System.in);
        System.out.print("input year: ");
        int year = sc.nextInt();
        System.out.print("input month: ");
        int month = sc.nextInt();

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                if(year%4==0 && year%400!=0 || year%400==0)
                    days=29;
                else
                    days = 28;
                break;
            default:
                System.out.println("month input wrong!");
                System.exit(0);

        }
        System.out.printf("days: %d\n", days);
    }
}
