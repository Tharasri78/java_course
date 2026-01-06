import java.util.Scanner;

public class p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;

        
        for (int i = (n/2)*(-1); i <= n/2; i++) {
            if(i<0){
                x=i*(-1);
            }
            else{
                x=i;
            }
            for (int j = 1; j <= x+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
    }
}
 /*

***
**
*
**
***

*/