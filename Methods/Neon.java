import java.util.Scanner;

public class Neon{

    
    static int neon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = neon(num);

        if (sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
