import java.util.*;
public class PosOrNeg {
    public void check(int n) {
        if (n >= 0) {
            System.out.println("Positive Number...");
        } else {
            System.out.println("Negative Number...");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value  ");
        n = sc.nextInt();
        PosOrNeg pn = new PosOrNeg();
        pn.check(n);
    }
}
