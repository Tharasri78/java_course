import java.util.Scanner;

public class Strong{


    static int Factorial(int num) {
        
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
          factorial = factorial * i;
            }
       
        return factorial;
    }

    static int strong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Factorial(digit);
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = strong(num);

        if (result == num)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}
