import java.util.*;
public class CelToFre {
    public void calc(double celsius) {
        double fahrenheit = ((9 * celsius) / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        System.out.println("Enter Celsius Value  ");
        celsius = sc.nextDouble();
        CelToFre ctof = new CelToFre();
        ctof.calc(celsius);
    }
}
