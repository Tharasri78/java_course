import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not a prime");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime");
                return;
            }
        }

        System.out.println("Its prime");
    }
}
