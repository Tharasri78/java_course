import java.util.Scanner;

public class Factorial {

        static int fact(int num) {
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto = facto * i;
        }
        return facto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(fact(num));
    }
}
