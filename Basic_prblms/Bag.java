import java.util.Scanner;
public class Bag{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int copies=sc.nextInt();
     int sp_price=sc.nextInt();
     int cp_price=sc.nextInt();
     int profit=((copies*sp_price)-(copies*cp_price)-100);
     System.out.println("Profit:"+profit);
    
     


        

        }}