import java.util.Scanner;

public class Series {

    static void oddCubeEvenSquare(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(i * i + " ");
            else
                System.out.print(i * i * i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        oddCubeEvenSquare(n);
    }
}
