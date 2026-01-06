import java.util.Scanner;

public class Harshar {

        static void divisor(int num) {
        int og=num;
        int sum = 0;
        while (num!=0){
            
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
            
            
        }
    
        if(og%sum==0){
            System.out.println("Harshar number");
        }
        else{
             System.out.println("Not a Harshar number");
        }
        
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        divisor(num);
    }
}
