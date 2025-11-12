import java.util.*;
public class MaxNumPro {
    public void show(int a, int b, int c) {
        int m = a;
        if (m < b) {
            m = b;
        }
        if (m < c) {
            m = c;
        }
        System.out.println("Max Value  " +m);
    }
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers  ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        MaxNumPro m = new MaxNumPro();
        m.show(a,b,c);
    }
}
