import java.util.Scanner;

public class CelsiusConverter {
    public double getFahrenheit(double celsius){
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;

    }

    public static void main(String[] args){
        System.out.println("input the temperature you wanrt to transfoem");;
        Scanner in = new Scanner(System.in);
        double celsius = in.nextDouble();
        CelsiusConverter converter = new CelsiusConverter();
        double fajremjeot = converter.getFahrenheit(celsius);
        System.out.println("temperature finished :" + fajremjeot);
    }
}
