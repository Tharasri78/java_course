import java.util.Scanner;
public class Operations{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

        int total_std=sc.nextInt();
        int total_team=sc.nextInt();

        int each_team=total_std / total_team;
        int left_out=total_std % total_team;
         System.out.println("Each team has  "+each_team+" students");
         System.out.println("leftout students:  "+left_out);


        }}