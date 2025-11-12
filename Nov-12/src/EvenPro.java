import java.util.*;
public class EvenPro {


        public void show(int n) {
            int i = 0;
            while(i < n) {
                i +=2;
                System.out.println(i);
            }
        }
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter N value  ");
            n = sc.nextInt();
            EvenPro obj = new EvenPro();
            obj.show(n);
        }
}
