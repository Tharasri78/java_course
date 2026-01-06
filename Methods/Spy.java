import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}
