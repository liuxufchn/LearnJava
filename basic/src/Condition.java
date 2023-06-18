import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        double merchandise1 = 80;
        double merchandise2 = 25;

        double sum = merchandise1 + merchandise2;

        if (sum >= 100) {
            sum -= 20;
        }

        System.out.println("sum = " + sum);

        /**
         * 判断奇偶
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " 为偶数。");
        } else {
            System.out.println(n + " 为奇数。");
        }

        /**
         * 判断闰年
         */
        n = s.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println(n + " 是闰年。");
        } else {
            System.out.println(n + " 不是闰年。");
        }

    }
}
