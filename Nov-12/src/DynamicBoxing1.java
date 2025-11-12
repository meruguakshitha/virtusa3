public class DynamicBoxing1 {
    public  void show(Object ob) {
        String type = ob.getClass().getSimpleName();
        if (type.equals("Integer")) {
            int x = (Integer)ob;
            System.out.println("Integer Casting Performed..."+x);
        }
        if (type.equals("Double")) {
            double x = (Double)ob;
            System.out.println("Double Casting Performed..."+x);
        }
        if (type.equals("String")) {
            String x = (String)ob;
            System.out.println("String Casting Performed..."+x);
        }
    }
    public static void main(String[] args) {
        int a = 12;
        double b = 12.5;
        String str = "Virtusa";
        DynamicBoxing1 run = new DynamicBoxing1();
        run.show(a);
        run.show(b);
        run.show(str);
    }
}
