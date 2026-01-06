import java.util.Scanner;

public class p4 {

    static void printDiamond(int n) {
        int mid = n / 2;

        for (int i = -mid; i <= mid; i++) {

            int x = (i < 0) ? -i : i;

        
            for (int s = 1; s <= x; s++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= n - 2 * x; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDiamond(n);
    }
}
/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
     
     */