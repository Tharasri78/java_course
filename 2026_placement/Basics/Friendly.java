import java.util.Scanner;

public class Friendly {

    static int sum(int n) {
        int s = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (sum(a) * b == sum(b) * a)
            System.out.println("Friendly Pair");
        else
            System.out.println("Not Friendly Pair");
    }
}