import java.util.*;
public class CaseExp1 {
    public void show(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Hi I am Akshitha...");
                break;
            case 2:
                System.out.println("Hi I am Abhi...");
                break;
            case 3:
                System.out.println("Hi I am Anu...");
                break;
            case 4:
                System.out.println("Hi I am Priya...");
                break;
            case 5:
                System.out.println("Hi I am Harsh...");
                break;
        }
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice   ");
        choice = sc.nextInt();
        CaseExp1 c = new CaseExp1();
        c.show(choice);
    }
}
