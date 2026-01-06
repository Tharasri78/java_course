
import java.util.Scanner;
public class Friendly{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        int sum_1=0;
        for (int i = 1; i <=num_1; i++) {
            if(num_1%i==0){
                 sum_1+=i;
            }

        }
         int sum_2=0;

        for (int i = 1; i <=num_2; i++) {
            if(num_2%i==0){
                 sum_2+=i;
            }

        }
        if((sum_1%num_1)==(sum_2%num_2)){
            System.out.println("Its a friendly pair");
        }else{
          System.out.println("Its not  a friendly pair");

        }
        
 
     
     

}
}