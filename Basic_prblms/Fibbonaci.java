
import java.util.Scanner;
public class Fibbonaci{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1;
        

        for (int i = 1; i <=num; i++) {
            if(i==1){
                System.out.println(a);
            }
            else if(i==2){
                 System.out.println(b);

            }
            else{
                int c=a+b;
                System.out.println(c);
                 a=b;
                 b=c;
            }

        }
        
        
 
     
     

}
}