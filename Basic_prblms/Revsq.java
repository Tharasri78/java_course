
import java.util.Scanner;
public class Revsq{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        
        for (int i = 1; i <= num; i++) {
            int sq = i * i;
            int temp = sq;
            int rev=0;

        while(temp!=0){
        int last_dig=temp%10;
        rev=(rev*10)+last_dig;
        temp=temp/10;
        
        
        }
        System.out.println(rev);
 
     
     

}
}}
// input:5 1 4 9 61 52 
// output:1 4 9 61 52 63 94 46 18 1
//        1 4 9 16 25 36 49 64 81 1 
