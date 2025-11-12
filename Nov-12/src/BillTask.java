import java.util.*;
public class BillTask {
    public void method(int units){


            double billAmount = 0;
            double rate;


            if (units <= 90) {
                rate = 1;
                billAmount = units * rate;
            }


            if (units > 90) {
                rate = 1;
                billAmount = 90 * rate;
                if (units - 150 >= 0) {
                    rate = 1.5;
                    billAmount = billAmount + (60 * rate);
                } else {
                    rate = 1.5;
                    billAmount = billAmount + (units - 90) * rate;
                }
            }


            if (units > 150) {
                rate = 2;
                if (units - 200 >= 0) {
                    billAmount = billAmount + (50 * rate);
                } else {
                    billAmount = billAmount + (units - 150) * rate;
                }
            }

            if (units > 200) {
                rate = 2.5;
                if (units - 240 >= 0) {
                    billAmount = billAmount + (40 * rate);
                } else {
                    billAmount = billAmount + (units - 200) * rate;
                }
            }

            if (units > 240) {
                rate = 3;
                billAmount = billAmount + (units - 240) * rate;
            }

            System.out.println("Total Bill Amount: Rs. " + billAmount);




    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int units=sc.nextInt();
        BillTask bt=new BillTask();
        bt.method(units);
    }
}
