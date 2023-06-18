public class Variable {

    public static void main(String[] args) {

        char ch1 = 65;

        System.out.println("ch1 = " + ch1);

//        char ch2 = 65536;
        char ch2 = 65535;

        System.out.println("ch2 = " + ch2);

        int x = 4;
        int y = (x++) + 5;

        System.out.println("y = " + y);

    }
}
