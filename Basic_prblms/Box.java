import java.util.Scanner;
public class Box{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int lastdig=num%10;
     int frstdig=num/1000;
     int result=lastdig+frstdig;
     System.out.println("The key is :"+result);

}
}