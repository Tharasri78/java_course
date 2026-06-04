import java.util.Scanner;
public class Controls{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int adults=sc.nextInt();
     int children=sc.nextInt();
     int total=((adults*75)+(children*50));
     if(total<=300){
        System.out.println("boat stable");


     }else{
        System.err.println("Not stable");
     }  

        }}