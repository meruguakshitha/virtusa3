public class StringSplit {
    public static void main(String[] args) {
        String names = "Indu Akhi Abhi Anu Naga Reevathi";
        String[] namesArray = names.split(" ");
        for (String name : namesArray) {
            System.out.println(name);
        }
    }
}
