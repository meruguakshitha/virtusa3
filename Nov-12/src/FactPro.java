import java.util.*;
public class FactPro {
    public void fact(int n){
        int f=1,i=1;
        while(i<=n){
            f *= i;
            i++;
        }
        System.out.println("Factorial "+f);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Number: ");
        int n = sc.nextInt();
        FactPro fp=new FactPro();
        fp.fact(n);
    }
}
